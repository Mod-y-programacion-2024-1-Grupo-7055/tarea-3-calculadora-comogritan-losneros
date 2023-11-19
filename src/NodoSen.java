import java.lang.Math;
/**
 * @author Ernesto Ibrahim Medina De Luna
 */
public class NodoSen extends NodoOperador {

	/**
	 * @param unico
	 */
	public NodoSen(CompositeEA izq, CompositeEA der) {
		super(izq, der);
		precedence=2;
	}

	/**
	 * @return el valor del Cosen del único hijo
	 */
	@Override
	public double evalua(){
		return Math.sin(der.evalua());
	}
}