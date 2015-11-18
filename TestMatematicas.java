//clase para comprobar los métodos estáticos de la calse Matematicas.java

public class TestMatematicas {
	public static void main(String[] arg) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int numero = sc.nextInt();
		System.out.printf("%s %d %s %b%n", "El número ", numero, "es par: ",
			Matematicas.esPar(numero));
		System.out.printf("%s %d %s %b%n", "El número ", numero, "es divisible por 3: ",
			Matematicas.esDivisiblePorTres(numero));
		System.out.printf("%s %d %s %b%n", "El número ", numero, "es divisible por 5: ",
			Matematicas.esDivisiblePorCinco(numero));
	}
}
