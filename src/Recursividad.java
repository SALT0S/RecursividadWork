import java.util.Scanner;

public class Recursividad {
    private static Scanner sc;

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int x = 0;
        String palabra;
        // ejercicio 1
        // 1. ¿Cuál es el resultado de esta función para distintos valores de x?";
        System.out.println("Ingrese el valor de X \n");
        x = sc.nextInt();
        System.out.println("El resultado es: " + f(x));
        System.out.println("\n");

        // ejercicio 2
        // 2. Demuestre usando el método iterativo y recursivo que, para todo número n
        // mayor o igual que 4, n!>2n.
        if (x >= 4) {
            System.out.println("El factorial " + x + " es mayor de " + NumeroRecursivo(x) + " Metodo Recursivo");
            System.out.println("El factorial " + x + " es mayor de " + NumeroInterativo(x) + " Metodo Interativo");
        } else {
            System.out.println("El factorial " + x + " es igual a " + NumeroRecursivo(x) + " Metodo Recursivo");
            System.out.println("El factorial " + x + " es igual a " + NumeroInterativo(x) + " Metodo Interativo");
        }
        System.out.println("\n");

        // ejercicio 3
        // "3. Implemente, tanto de forma recursiva como de forma iterativa, una función
        // que nos diga si una cadena de caracteres es simétrica (un palíndromo). Por
        // ejemplo, “DABALEARROZALAZORRAELABAD” es un palíndromo."
        System.out.println("Ingrese una palabra para identificar si es un palíndromo.");
        palabra = "DABALEARROZALAZORRAELABAD";
        System.out.println(PalindromoRecursivo(palabra) + " Forma 'Recursiva'");
        System.out.println(iterativaPolindromo(palabra) + " Forma 'iterativa'");
        System.out.println("\n");
    }

    // Ejercicio 1
    public static int f(int x) {
        if (x > 100) {
            return (x - 10);
        } else {
            return (f(f(x + 11)));
        }
    } // x <= 99 = 91 R//

    // Ejercicio 2
    public static int NumeroRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return NumeroRecursivo(n - 1) * n;
        }
    }

    public static int NumeroInterativo(int n) {
        int z = 1, i;
        for (i = 1; i <= n; i += 1) {
            z *= i;
        }
        return z;
    }

    // Ejercicio 3
    public static String PalindromoRecursivo(String palabra) {
        String k = palabra.replaceAll("\\s+", "");
        return recursivoPalindromo(k, 0, k.length() - 1);
    }

    private static String recursivoPalindromo(String palabra, int ade, int rev) {
        if (ade == rev) {
            return "La palabra '" + palabra + "' SI es un palíndromo.";
        }
        if ((palabra.charAt(ade)) != (palabra.charAt(rev))) {
            return "La palabra '" + palabra + "' NO es un palíndromo.";
        }
        return "La palabra '" + palabra + "' SI es un palíndromo.";
    }

    public static String iterativaPolindromo(String palabra) {
        String rev = "";
        int length = palabra.length();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + palabra.charAt(i);
        if (palabra.equals(rev)) {
            return "La palabra '" + palabra + "' SI es un palíndromo.";
        } else {
            return "La palabra '" + palabra + "' NO es un palíndromo.";
        }

    }
}
