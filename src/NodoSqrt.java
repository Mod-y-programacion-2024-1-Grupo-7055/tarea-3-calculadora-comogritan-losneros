import java.lang.Math;
/**
<<<<<<< HEAD
 * @author Ernesto Ibrahim Medina De Luna
 */
public class NodoSqrt extends NodoOperador {

	/**
	 * @param unico
	 */
	public NodoSqrt(CompositeEA izq, CompositeEA der) {
=======
 * @author Ernesto Medina
 * clase NodoSqrt para el arbol de análisis sintáctico
 */

public class NodoSqrt extends NodoOperador {

	/**
	 * @param izq
	 * @param der
	 */
	public NodoSqrt(CompositeEA izq, CompositeEA der){
>>>>>>> 8fa0e85 (no c pq no jala)
		super(izq,der);
		precedence=2;
	}

	/**
<<<<<<< HEAD
	 * @return el valor del Cosen del único hijo
	 */
	@Override
	public double evalua(){
		if (unico.evalua() < 0) {
            throw new ErrorAritmeticoException("La raíz cuadrada no está definida para reales negativos.");
        }
		return Math.sqrt(der.evalua());
	}
}
=======
	 * @return la raiz positiva del real ingresado
	 */
	@Override
	public double evalua() {
		if(der.evalua()<0){
			throw new ErrorAritmeticoException("No se calcular la raiz de números negativos ");
		}
		return Math.sqrt(der.evalua());
	}

}//fin de class
>>>>>>> 8fa0e85 (no c pq no jala)
