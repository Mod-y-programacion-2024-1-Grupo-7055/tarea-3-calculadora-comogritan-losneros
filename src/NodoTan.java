import java.lang.Math;
/**
 * @author Ernesto Ibrahim Medina De Luna
 */
public class NodoTan extends NodoOperador {

	/**
	 * @param unico
	 */
	public NodoTan(CompositeEA izq, CompisiteEA der) {
		super(izq, der);
		precedence=2;
	}

	/**
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