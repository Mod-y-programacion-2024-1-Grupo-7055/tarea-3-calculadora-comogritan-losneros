import java.lang.Math;
/**
<<<<<<< HEAD
 * @author Ernesto Ibrahim Medina De Luna
 */
public class NodoCos extends NodoOperador {

	/**
	 * @param unico
	 */
	public NodoCos(CompositeEA izq, CompositeEA der) {
		super(izq, der);
=======
 * @author Ernesto Medina
 * clase NodoCos para el arbol de análisis sintáctico
 */

public class NodoCos extends NodoOperador {

	/**
	 * @param izq
	 * @param der
	 */
	public NodoCos(CompositeEA izq, CompositeEA der){
		super(izq,der);
>>>>>>> 8fa0e85 (no c pq no jala)
		precedence=2;
	}

	/**
<<<<<<< HEAD
	 * @return el valor del Cosen del único hijo
=======
	 * @return el Coseno del real ingresado, dicho real represemta radianes
>>>>>>> 8fa0e85 (no c pq no jala)
	 */
	@Override
	public double evalua(){
		return Math.cos(der.evalua());
	}
<<<<<<< HEAD
}
=======

}//fin de class
>>>>>>> 8fa0e85 (no c pq no jala)
