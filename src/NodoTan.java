import java.lang.Math;
/**
<<<<<<< HEAD
 * @author Ernesto Ibrahim Medina De Luna
 */
public class NodoTan extends NodoOperador {

	/**
	 * @param unico
	 */
	public NodoTan(CompositeEA izq, CompisiteEA der) {
		super(izq, der);
=======
 * @author Ernesto Medina
 * clase NodoTan para el arbol de análisis sintáctico
 */

public class NodoTan extends NodoOperador {

	/**
	 * @param izq
	 * @param der
	 */
	public NodoTan(CompositeEA izq, CompositeEA der){
		super(izq,der);
>>>>>>> 8fa0e85 (no c pq no jala)
		precedence=2;
	}

	/**
<<<<<<< HEAD
	 * @return el valor del Cosen del único hijo
	 */
	@Override
	public double evalua(){
		if (Math.abs(Math.cos(unico.evalua())) < 1e-10) {
            throw new ErrorAritmeticoException("La tangente no está definida para este ángulo.");
        }
		return Math.tan(der.evalua());
	}
}
=======
	 * @return la tangente del real ingresado, dicho real representa radianes
	 */
	@Override
	public double evalua() {
		if( Math.cos(der.evalua())==0 ){
			throw new ErrorAritmeticoException("La funcion tan es indeterminada para ese valor");
		}
		return Math.tan(der.evalua());
	}

}//fin de class
>>>>>>> 8fa0e85 (no c pq no jala)
