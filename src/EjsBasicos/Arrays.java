package EjsBasicos;

public class Arrays {
	public static void main(String[] args) {
		System.out.println("Ejercicio 1");
		int[] numeros = {1, 2, 3, 4, 5};

		// Acceder a un elemento y leer su valor
		int primerElemento = numeros[0];
		System.out.println("Primer elemento: " + primerElemento);

		// Modificar un elemento
		numeros[2] = 10;
		System.out.println("Elemento modificado: " + numeros[2]);
		
		System.out.println();
		System.out.println("Ejercicio 2");
		System.out.println();
		
		// Definición y asignación de un array de enteros
		int[] numeros1 = {5, 10, 15, 20, 25};

		// Acceso y modificación de elementos del array
		System.out.println("Elemento en la posición 2: " + numeros1[2]); // Imprime: 15
		numeros1[3] = 30;
		System.out.println("Elemento modificado en la posición 3: " + numeros1[3]); 
		// Imprime: 30

		// Recorrido del array utilizando un bucle for
		System.out.println("Elementos del array:");
		for (int i = 0; i < numeros1.length; i++) {
		   System.out.println(numeros1[i]);
		}

		// Suma de todos los elementos del array
		int suma = 0;
		for (int i = 0; i < numeros1.length; i++) {
		   suma += numeros1[i];
		}
		System.out.println("Suma de los elementos: " + suma); 
		// Imprime: 75
	}
}
