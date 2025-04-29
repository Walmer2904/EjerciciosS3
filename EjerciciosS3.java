/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioss3;

import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EjerciciosS3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            // Mostrar menú
            System.out.println("\n:: MENÚ DE EJERCICIOS ::");
            System.out.println("1. Calculadora");
            System.out.println("2. Conversor");
            System.out.println("3. Contador");
            System.out.println("4. Banco");
            System.out.println("5. Auto y Motor");
            System.out.println("6. Libro y Página");
            System.out.println("7. División con manejo de error");
            System.out.println("8. DivisiónUsuario (interactiva)");
            System.out.println("9. ValidarEdad");
            System.out.println("10. Leer Archivo");
            System.out.println("11. SALIR");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("\n--- Ejercicio 1: Calculadora ---");
                        Calculadora calc = new Calculadora();
                        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 7));
                        System.out.println("Suma de 3 enteros: " + calc.sumar(1, 2, 3));
                        System.out.println("Suma de 2 doubles: " + calc.sumar(4.5, 3.2));
                        break;
                    case 2:
                        System.out.println("\n--- Ejercicio 2: Conversor ---");
                        Conversor conv = new Conversor();
                        System.out.println("Celsius a Fahrenheit: " + conv.convertir(25));
                        System.out.println("Kilómetros a millas: " + conv.convertirKilometrosAMillas(10));
                        System.out.println("Segundos a minutos y segundos: " + conv.convertir(125));
                        break;
                    case 3:
                        System.out.println("\n--- Ejercicio 3: Contador ---");
                        new Contador();
                        new Contador();
                        Contador.mostrarTotal();
                        break;
                    case 4:
                        System.out.println("\n--- Ejercicio 4: Banco ---");
                        Banco.mostrarTasaInteres();
                        Banco.actualizarTasaInteres(0.07);
                        Banco.mostrarTasaInteres();
                        break;
                    case 5:
                        System.out.println("\n--- Ejercicio 5: Auto y Motor ---");
                        Auto auto = new Auto();
                        auto.mostrarTipoMotor();
                        break;
                    case 6:
                        System.out.println("\n--- Ejercicio 6: Libro y Página ---");
                        Libro libro = new Libro();
                        libro.mostrarContenidoPagina();
                        break;
                    case 7:
                        System.out.println("\n--- Ejercicio 7: División con manejo de error ---");
                        Division div = new Division();
                        div.dividir(10, 0); // Ejemplo de división con error (por 0)
                        break;
                    case 8:
                        System.out.println("\n--- Ejercicio 8: DivisiónUsuario (interactiva) ---");
                        DivisionUsuario.ejecutarDivision();
                        break;
                    case 9:
                        System.out.println("\n--- Ejercicio 9: ValidarEdad ---");
                        ValidarEdad validar = new ValidarEdad();
                        try {
                            validar.verificarEdad(16);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Excepción: " + e.getMessage());
                        }
                        break;
                    case 10:
                        System.out.println("\n--- Ejercicio 10: Leer Archivo ---");
                        Archivo archivo = new Archivo();
                        try {
                            archivo.leerArchivo("archivo.txt"); // Asegúrate de tener archivo.txt en la raíz del proyecto
                        } catch (IOException e) {
                            System.out.println("Error leyendo archivo: " + e.getMessage());
                        }
                        break;
                    case 11:
                        System.out.println("\nSaliendo del programa...");
                        break;
                    default:
                        System.out.println("\nOpción inválida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nDebe ingresar un número válido.");
                sc.next(); // Limpiar el scanner para evitar un bucle infinito
            }
        } while (opcion != 11);

        sc.close();  // Cerrar el scanner al finalizar
    }
}
