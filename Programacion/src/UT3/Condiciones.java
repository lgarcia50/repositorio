package UT3;

public class Condiciones {

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		//uso de if - else - else if
		//escribir si un numero es par o impar
		int numero = 23;
		if (numero%2 ==0) {
			System.out.println("Es par");
		}else
			System.out.println("Es impar");
		
		numero=24;
		//Indicar si es multiplo de 10, de 2, de 5 o ninguno de estos
		if(numero%10 ==0) {
			System.out.println("Es multiplo de 10");
		}else if(numero%2 ==0) {
			System.out.println("Es multiplo de 2");
	}else if(numero%3 ==0) {
		System.out.println("Es multiplo de 3");
	}else
		System.out.println("Ningun caso de estos");
		
		numero = 6;
		//Uso de distintos  operadores logicos (<, >, ==, !=, &&)
		if (numero%2 == 0 && numero%3 == 0 && numero%10 != 0) {
			System.out.println("Multiplo de 2 y 3, pero no de 10");
		}else 
			System.out.println("No cumple las condiciones");
		// Uso en bucle
		// if anidados
		

		}
	}


