package UT3;

import java.util.Scanner;

	/**
	 * 
	 * @author Lucia
	 *
	 */

	public class ejercicio17 {
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
		    System.out.println("Escribe numero inicial:");
		    int start = entrada.nextInt();
		    System.out.println("Escribe numero final:");
		    int stop = entrada.nextInt();
		    System.out.println("Escribe intervalo:");
		    int intervalo = entrada.nextInt();
		    
		    for(int i = start; i<=stop; i=i+intervalo) {
		    	System.out.println(i+"");
		    }
		
		    
		    
         entrada.close();
		}

	}
