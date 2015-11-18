//clase Matematicas.java

/** clase que va a contener métodos estáticos de cálculo matemático
 * @author Antonio
 * @version 1.0
 */
 
public class Matematicas {
	/** método que devuelve si un número es par o no
	 * @param numero int
	 * @return boolean true si es par
	 */ 
	public static boolean esPar (int numero) {
		return numero % 2 == 0;
	}
	
	/** método que devuelve si un número es disivible o no por 3
	 * @param numero int
	 * @return boolean true si es divisible por 3
	 */ 
	public static boolean esDivisiblePorTres (int numero) {
		return numero % 3 == 0;
	}
	
	/** método que devuelve si un número es divisible o no por 5
	 * @param numero int
	 * @return boolean ture si es divisible por 5
	 */ 
	public static boolean esDivisiblePorCinco (int numero) {
		return numero % 5 == 0;
	}
}
