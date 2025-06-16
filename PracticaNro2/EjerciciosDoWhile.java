package PracticaNro2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class EjerciciosDoWhile {

    Scanner sc = new Scanner(System.in);

    /**
     * Generar un menú que se repita hasta que se elija "salir". (Este programa
     * muestra un menú interactivo en consola, que permite al usuario elegir
     * opciones hasta que decide salir. Cada selección muestra un mensaje
     * correspondiente y, si la entrada no es válida, se le advierte que debe
     * volver a intentarlo.)
     */
    public void menuhastaExit() {
        int option = 0;
        do {
            System.out.println("El menú de hoy es :");
            System.out.println("1.Guata");
            System.out.println("2.Pollo a la brasa");
            System.out.println("3.Repe Lojano");
            System.out.println("4.Sancocho");
            System.out.println("0.Salir");
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Orden aceptada");
            } else if (option == 2) {
                System.out.println("Orden aceptada");
            } else if (option == 3) {
                System.out.println("Orden aceptada");
            } else if (option == 4) {
                System.out.println("Orden aceptada");
            } else if (option == 0) {
                System.out.println("Fue un placer atenderlo regrese pronto");
            } else {
                System.out.println("Error,ingrese un numero del menu");
            }

        } while (option != 0);
    }

    /**
     * Leer notas hasta que se ingrese -1 y calcular promedio(Programa que lee
     * notas hasta que el usuario ingrese -1)
     *
     * @return (retorna el promedio calculado)
     */
    public float notas() {
        float nota = 0.0f;
        float suma = 0.0f;
        int contador = 0;
        do {
            System.out.println("Ingrese una nota");
            nota = sc.nextFloat();
            if (nota != -1) {
                suma += nota;
                contador++;
            }
        } while (nota != -1);
        if (contador > 0) {
            float promedio = suma / contador;
            System.out.println("Su promedio es: " + promedio);
            return promedio;
        } else {
            System.out.println("No se ingresaron notas válidas.");
            return 0;
        }
    }

    /**
     * Verificar si una secuencia termina en número negativo.(Programa que
     * cuando el usuario ingresa un numero negativo muestre un mensaje diciendo
     * que a ingresado un numero negativo)
     */
    public void verificarSecuencia() {
        int numero = 0;
        do {
            System.out.println("Ingrese un número :");
            numero = sc.nextInt();
        } while (numero >= 0);
        System.out.println("A ingresado número negativo.");
    }

    /**
     * Leer edades y determinar la cantidad de mayores de edad(Programa que
     * cuando ingresa 5 edades muestre un mensaje mostrando cuantos mayores de
     * edad hay)
     *
     * @return (devuelve cuantos mayores de edad hay)
     */
    public int determinar_cantidad_mayor_edad() {
        int edad = 0;
        int contador = 0;
        int numeros_de_personas = 0;
        do {
            try {
            System.out.println("Ingrese su edad");
            edad = sc.nextInt();
                
            if (edad < 0 || edad > 110) {
                System.out.println("Ingrese una edad en el rango 0-110");
            }
            if (edad >= 18) {
                contador++;
            }
            numeros_de_personas++;
            } catch (InputMismatchException e) {
                System.out.println("Error no se puede poner letras");
                break;
            }
        } while (numeros_de_personas < 5);
        if (contador > 0) {
            System.out.println("Hay: " + contador + " mayor/es de edad");
            return contador;
        } else {
            System.out.println("No hay mayores de edad");
            return 0;
        }
    }
}
