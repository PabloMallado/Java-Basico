package EjsBasicos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		System.out.println("Ejercicio 1");
		
		boolean X = true, Y = false, Z = true;
        
		System.out.println("a) (X && Y) || (X && Z) => " 
					+ ((X && Y) || (X && Z)));
		System.out.println("b) (X || !Y)&& (!X || Z) => " 
					+ ( (X || !Y)&& (!X || Z)));
		System.out.println("c) X || Y && Z => " 
					+ (X || Y && Z));
		System.out.println("d) !(X || Y) && Z => " 
					+ (!(X || Y) && Z));
		System.out.println("e) X || Y || X && !Z && !Y => " 
					+ (X || Y || X && !Z && !Y));
		System.out.println("f) !X || !Y || Z && X && !Y => " 
					+ (!X || !Y || Z && X && !Y));
		
		System.out.println();
		System.out.println("Ejercicio 2");
		System.out.println();
		
		boolean W = false, x = true, y = true, z = false;
        
		System.out.println("a) W || Y && X && W || Z => " 
					+ (W || y && x && W || z));
		System.out.println("b) X && !Y && !X || !W && Y => " 
					+ (x && !y && !x || !W && y));
		System.out.println("c) !(W || !Y) && X || Z => " 
					+ (!(W || !y) && x || z));
		System.out.println("d) X && Y && W || Z || X => " 
					+ (!x && y && W || z || x));
		System.out.println("e) Y || !(Y || Z && W) => " 
					+ (y || !(y || z && W)));
		System.out.println("f) !X && Y && (!Z || !X) => " 
					+ (!x && y && (!z || !x)));
		
		System.out.println();
		System.out.println("Ejercicio 3");
		System.out.println();
		
		System.out.println("Tabla de verdad de and");
		System.out.println("======================");
		System.out.println("true && true => " + (true && true));
		System.out.println("true && false => " + (true && false));
		System.out.println("false && true => " + (false && true));
		System.out.println("false && false => " + (false && false));

		System.out.println("\nTabla de verdad de or");
		System.out.println("=====================");
		System.out.println("true || true => " + (true || true));
		System.out.println("true || false => " + (true || false));
		System.out.println("false || true => " + (false || true));
		System.out.println("false || false => " + (false || false));        

		System.out.println("\nTabla de verdad de not");
		System.out.println("======================");
		System.out.println("!true => " + (!true));
		System.out.println("!false => " + (!false));
	}
}
