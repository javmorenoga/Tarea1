
package trabajos.poo;

public class TrabajosPOO {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
        ejercicio19();
        ejercicio20();
        ejercicio21();
        ejercicio22();
        ejercicio23();
        ejercicio24();
        ejercicio25();
        ejercicio26();
        ejercicio27();
        ejercicio28();
        ejercicio29();
        ejercicio30();

    }

    public static void ejercicio1() {
        System.out.println("Hola, ya se imprimir frases");
    }

    public static void ejercicio2() {
        System.out.println(273);
    }

    public static void ejercicio3() {
        System.out.println(5.3);
    }

    public static void ejercicio4() {
        System.out.println(1234 + 532);
    }

    public static void ejercicio5() {
        System.out.println(1234 - 532);
    }

    public static void ejercicio6() {
        System.out.println(1234 * 532);
    }

    public static void ejercicio7() {
        System.out.println(1234 / 532.0);
    }

    public static void ejercicio8() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio9() {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio10() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio11() {
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio12() {
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio13() {
        for (int i = 5; i <= 15000; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio14() {
        for (int i = 0; i < 200; i++) {
            System.out.println("hola");
        }
    }

    public static void ejercicio15() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i * i);
        }
    }

    public static void ejercicio16() {
        long resultado = 1;
        for (int i = 1; i <= 20; i++) {
            resultado *= i;
        }
        System.out.println(resultado);
    }

    public static void ejercicio17() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println(suma);
    }
    
    public static void ejercicio18() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += num + i;
        }
        System.out.println("Suma de los 100 siguientes: " + suma);
    }

    public static void ejercicio19() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad en euros:");
        double euros = sc.nextDouble();
        double dolares = euros * 1.08; // Puedes ajustar la tasa
        System.out.println("Equivalente en dólares: " + dolares);
    }

    public static void ejercicio20() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese altura:");
        double altura = sc.nextDouble();
        System.out.println("Ingrese anchura:");
        double anchura = sc.nextDouble();
        double area = altura * anchura;
        System.out.println("Área del rectángulo: " + area);
    }

    public static void ejercicio21() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Mayor: " + Math.max(a, b));
        System.out.println("Menor: " + Math.min(a, b));
    }

    public static void ejercicio22() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int limite = sc.nextInt();
        System.out.println("Números impares menores que " + limite + ":");
        for (int i = 1; i < limite; i += 2) {
            System.out.println(i);
        }
    }

    public static void ejercicio23() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números para el GCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Máximo común divisor: " + a);
    }

    public static void ejercicio24() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese coeficientes a, b y c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double discriminante = b * b - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Soluciones: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void ejercicio25() {
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Ackermann de (2, 2): " + ackermann(2, 2));
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    private static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void ejercicio26() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tres números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mayor = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));
        System.out.println("Mayor: " + mayor + ", Menor: " + menor);
    }

    public static void ejercicio27() {
        Scanner sc = new Scanner(System.in);
        double f;
        do {
            System.out.println("Ingrese temperatura en Fahrenheit (999 para salir):");
            f = sc.nextDouble();
            if (f != 999) {
                double c = (5.0 / 9) * (f - 32);
                System.out.println("Temperatura en Celsius: " + c);
            }
        } while (f != 999);
        System.out.println("Programa terminado.");
    }

    public static void ejercicio28() {
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.println("Caso 1");
                    break;
                case 2:
                    System.out.println("Caso 2");
                    break;
                case 3:
                    System.out.println("Caso 3");
                    break;
                default:
                    System.out.println("Otro caso");
            }
        }
    }

    public static void ejercicio29() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese texto (CTRL+D o CTRL+Z para terminar):");
        while (sc.hasNext()) {
            String linea = sc.nextLine();
            System.out.println("Leído: " + linea);
        }
        System.out.println("Fin de entrada detectado.");
    }

    public static void ejercicio30() {
        System.out.println("Números primos hasta 100:");
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }

}