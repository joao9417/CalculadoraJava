package Calculadora;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        boolean salir = false;


        while (!salir) {

            System.out.println("\n** Calculadora Básica **");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                int opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        realizarSuma(entrada);
                        break;
                    case 2:
                        realizarResta(entrada);
                        break;
                    case 3:
                        realizarMultiplicacion(entrada);
                        break;
                    case 4:
                        realizarDivision(entrada);
                        break;
                    case 5:
                        salir = true;
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Intenta de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingresa un número válido.");
                entrada.next();
            }
        }
        entrada.close();
    }



    private static void realizarSuma(Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 + num2));
    }


    private static void realizarResta(Scanner scanner) {
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 - num2));
    }


    private static void realizarMultiplicacion(Scanner scanner){
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: " + (num1 * num2));
    }


    private static void realizarDivision(Scanner scanner){
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            System.out.println("Resultado: " + (num1 / num2));
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }

}
