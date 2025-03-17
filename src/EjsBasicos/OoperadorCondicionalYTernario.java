package EjsBasicos;

public class OoperadorCondicionalYTernario {
	public static void main(String[] args) {
		System.out.println("Ejercicio 1");
		int numero = 1;
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar"); 
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		System.out.printf("%d es %S%n", 
				numero, numero++ % 2 == 0 ? "par": "impar");
		
		System.out.println();
		System.out.println("Ejercicio 2");
		System.out.println();
		
		int edad = 18;

		if (edad >= 18) {
		    System.out.println("Eres mayor de edad");
		} else {
		    System.out.println("Eres menor de edad");
		}
		
		System.out.println();
		System.out.println("Ejercicio 3");
		System.out.println();
		
		int diaSemana = 3;
		String nombreDia;

		switch (diaSemana) {
		    case 1:
		        nombreDia = "Lunes";
		        break;
		    case 2:
		        nombreDia = "Martes";
		        break;
		    case 3:
		        nombreDia = "Miércoles";
		        break;
		    case 4:
		        nombreDia = "Jueves";
		        break;
		    case 5:
		        nombreDia = "Viernes";
		        break;
		    case 6:
		        nombreDia = "Sábado";
		        break;
		    case 7:
		        nombreDia = "Domingo";
		        break;
		    default:
		        nombreDia = "Día inválido";
		        break;
		}
		System.out.println("Hoy es " + nombreDia);
	}
}
