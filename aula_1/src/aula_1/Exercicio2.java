package aula_1;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 byte b = 100;
	        short s = 30000; 
	        int i = 2000000000;
	        long l = 9000000000L; 
	        
	        float f = 3.14f;
	        double d = 2.718281828459045;
	        
	        char c = 'Z';
	        boolean bool = false; 

	       
	        System.out.println("Valor original do byte: " + b);
	        System.out.println("Valor original do short: " + s);
	        System.out.println("Valor original do int: " + i);
	        System.out.println("Valor original do long: " + l);
	        System.out.println("Valor original do float: " + f);
	        System.out.println("Valor original do double: " + d);
	        System.out.println("Valor original do char: " + c);
	        System.out.println("Valor original do boolean: " + bool);

	      
	        int bToInt = b; 
	        short sToByte = (short) b;
	        long iToLong = i;
	        float dToFloat = (float) d; 
	        
	      
	        System.out.println("\nResultados do casting:");
	        System.out.println("byte para int: " + bToInt);
	        System.out.println("byte para short: " + sToByte);
	        System.out.println("int para long: " + iToLong);
	        System.out.println("double para float: " + dToFloat);
	        
	       
	        int cToInt = (int) c;
	        System.out.println("char para int (código ASCII de 'Z'): " + cToInt);

	}

}
