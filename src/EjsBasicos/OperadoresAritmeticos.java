package EjsBasicos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		System.out.println("Ejercicio 1");
		System.out.println();
		
		int a = 8, b = 3, c = -5;
		
		System.out.println("a) a + b + c = " + (a + b + c));
		System.out.println("b) 2 * b + 3 * (a - c) = " + (2 * b + 3 * (a - c)));
		System.out.println("c) a / b = " + (a / b));
		System.out.println("d) a % b = " + (a % b));
		System.out.println("e) a / c = " + (a / c));
		System.out.println("f) a % c = " + (a % c));
		System.out.println("g) a * b / c = " + (a * b / c));
		System.out.println("h) a * (b / c) = " + (a * (b / c)));
		System.out.println("i) (a * c) % b = " + ((a * c) % b));
		System.out.println("j) a * (c % b) = " + (a * (c % b)));
		System.out.println("k) (3 * a - 2 * b) % (2 * a - c) = " + ((3 * a - 2 * b) % (2 * a - c)));
		System.out
				.println("l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2) = " + (2 * (a / 5 + (4 - b * 3)) % (a + c - 2)));
		System.out.println("m) (a - 3 * b) % (c + 2 * a) / (a - c) = " + ((a - 3 * b) % (c + 2 * a) / (a - c)));
		System.out.println("n) a - b - c * 2 = " + (a - b - c * 2));
		System.out.println();
		System.out.println("Ejercicio 2");
		System.out.println();
		double x = 88, y = 3.5, z = -5.2;

		System.out.println("a) x + y + z = " + (x + y + z));
		System.out.println("b) 2 * y + 3 * (x - z) = " + (2 * y + 3 * (x - z)));
		System.out.println("c) x / y = " + (x / y));
		System.out.println("d) x % y = " + (x % y));
		System.out.println("e) x / (y + z) = " + (x / (y + z)));
		System.out.println("f) (x / y) + z = " + ((x / y) + z));
		System.out.println("g) 2 * x / 3 * y = " + (2 * x / 3 * y));
		System.out.println("h) 2 * x / (3 * y) = " + (2 * x / (3 * y)));
		System.out.println("i) x * y % z = " + (x * y % z));
		System.out.println("j) x * (y % z) = " + (x * (y % z)));
		System.out.println("k) 3 * x - z - 2 * x = " + (3 * x - z - 2 * x));
		System.out.println("l) 2 * x / 5 % y) = " + (2 * x / 5 % y));
		System.out.println("m) x - 100 % y % z = " + (x - 100 % y % z));
		System.out.println("n) x - y - z * 2 = " + (x - y - z * 2));

		System.out.println();
		System.out.println("Ejercicio 3");
		System.out.println();

		char c1 = 'E', c2 = '5', c3 = '?';

		System.out.println("a) c1 + 1 = " + (char) (c1 + 1));
		System.out.println("b) c1 - c2 + c3 = " + (char) (c1 - c2 + c3));
		System.out.println("c) c2 - 2 = " + (char) (c2 - 2));
		System.out.println("d) c2 - '2' = " + (char) (c2 - '2'));
		System.out.println("e) c3 + '#' = " + (char) (c3 + '#'));
		System.out.println("f) c1 % c3 = " + (char) (c1 % c3));
		System.out.println("g) '2' + '2' = " + (char) ('2' + '2'));
		System.out.println("(c1 / c2) * c3 = " + (char) ((c1 / c2) * c3));
		System.out.println("i) 3 * c2 = " + (char) (3 * c2));
		System.out.println("j) '3' * c2 = " + (char) ('3' * c2));
	}
}
