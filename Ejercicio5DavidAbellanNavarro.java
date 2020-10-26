//Created by David Abellán Navarro 1ºDAM
//https://github.com/Naabda/Ejercicio4/blob/main/Ejercicio5DavidAbellanNavarro.java
package EjerciciosEntregados;

import java.util.Scanner;

public class Ejercicio5DavidAbellanNavarro {

	private static void fibonacci(Scanner Fibo) {
		// Que nos devuelva el numero "X" de la cadena fibonacci
		//Para calcular Fibonacci lo que haremos es coger el A=0(i=A), B=1. y haremos la siguiente ecuación:
		// A+B=C; donde B=C-A deducimos que C=A+(B-1)
		//
		//Ejercicio con for:
		//Recogemos los datos.
		System.out.println("Introduce que número en la secuencia fibonacci quieres saber");
		int fibo = Fibo.nextInt();
		int B=1;
		int C=0;
		int contador=0;
		//Dato para que no corte el bucle hasta que nos interese.
		int D=0;
		//Iniciamos el for.
		for (int i = 0; i >= D; i++) {
			//Mostramos resultados.


			//Con este while rompemos el bucle en la vuelta solicitada.
			while (contador==fibo) {
				System.out.println("Su número Fibonacci es: "+C);
				break;
			}
			//Contador vueltas.
			contador ++;
			// Sacamos resultados del bucle donde.
			C=i+(B-1);
			// Igualamos A=B
			i=B;
			// Igualamos B=C
			B=C;
			//Linea de comprobacion.
			//System.out.println("I vale: "+i+" B vale: "+B+" resultado vale: "+C+" contador: "+contador);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definimos las variables.
		Scanner sc= new Scanner(System.in);
		boolean continuar =true;
		int opcion;

		do {
			//Escribimos las opciones que posteriormente pondremos en las cajas.
			System.out.println("Elige una opción");
			System.out.println("1.Estructura IF");
			System.out.println("2.Estructura de control For");
			System.out.println("3.Estructura de datos Array");
			System.out.println("4.Salir");
			opcion=sc.nextInt();
			//Definimos las cajas con las opciones del menú.
			switch (opcion) {
			case 1:
				// Llamar a una función llamada accidente.
//				facc(sc);
				break;
			case 2:
				// Llamar a una función llamada fibonacci.
				fibonacci(sc);
				break;
			case 3:
				// Llamar a una función llamada vector.
				break;
			case 4: 
				System.out.println("Adiós");
				continuar = false;
				break;
			default:
				System.out.println("Inserta una opción correcta");
			} 
		}
		while (continuar); 
		//Cerramos el escaner.
		sc.close();		
	}
	//Cerramos programa.
}