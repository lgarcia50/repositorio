	/** 

	*  

	*/ 

	package UT3; 
 

	import java.util.Scanner; 

	/** 

	* @author Lucia

	*

	*/ 

	public class Ejerciciofutbol {
	  //metros cuadrados = base * altura

	    /** 

	     * @param args 

	     */ 

	    public static void main(String[] args) { 
	        // TODO Auto-generated method stub 
	    	Scanner sc = new Scanner(System.in);{ 
	    	
	        int area_rectangulo = 0;
	        int base = 65;
	        int altura = 105;
            
	        area_rectangulo = base*altura;
	        System.out.println("El area de un campo de futbol de base "+base+" y altura "+altura+" es igual a "+area_rectangulo);
	        
	        System.out.println("¿Cuantos metros cuadrados son:?)");  
	        int metros2 =sc.nextInt();  
            System.out.println("¿Cuantos campos de futbol equivale:?)");
            int campos_futbol =sc.nextInt();
   

            }  

      
            
	    }  
	      }
