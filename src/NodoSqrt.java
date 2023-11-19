import java.lang.Math;
/**
 * @author Ernesto Ibrahim Medina De Luna
 */
public class NodoSqrt extends NodoOperador {

	/**
	 * @param unico
	 */
	public NodoSqrt(CompositeEA izq, CompositeEA der) {
		super(izq,der);
		precedence=2;
	}

	/**
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