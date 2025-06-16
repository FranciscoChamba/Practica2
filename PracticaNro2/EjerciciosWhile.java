package PracticaNro2;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class EjerciciosWhile {

    /**
     * Ingresar números hasta que la suma supere 1000. (programa que al ingresar
     * un numero sume hasta que el mismo supere los 1000)
     *
     * @param sum (Entero que inicia la suma)
     * @return (retorna la suma)
     */
    public int numerosHastaquesupere1000(int sum) {
        int suma = 0;
        while (suma <= 1000) {
            suma += sum;
            System.out.println("Suma actual: " + suma);
        }
        System.out.println("La suma ha superado los 1000.");
        return suma;
    }

    /**
     * Leer enteros hasta que se ingrese un múltiplo de 7. (Programa que al
     * momento de poner un numero va a seguir poniendo y al poner cualquier
     * numero que sea divisible para 7 este muestre un mensaje)
     */
    public void numerosNomultiplosde7() {
        Scanner sc = new Scanner(System.in);
        int cif = 1;
        while (cif % 7 != 0) {
            System.out.println("ingrese el numero");
            cif = sc.nextInt();
            System.out.println("el numero es" + cif);
            if (cif % 7 == 0) {
                System.out.println("Es multiplo de 7");
            }
        }

    }

    /**
     * Validar contraseña con tres intentos. (Programa que valida una contraseña
     * que ingresa el usuario y si se equivica tres veces le deniega el paso)
     *
     * @param contraseña_accept (variable donde se va a guardar la contraseña
     * para poder acceder)
     * @return (cadena vacia)
     */
    public String contraseñadetresintentos(String contraseña_accept) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("Ingrese la contraseña");
            String ingreso = sc.nextLine();
            if (ingreso.equals(contraseña_accept)) {
                System.out.println("Acceso aceptado");
                break;
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta escriba de nuevo, " + intentos + " intentos disponibles");

            }

        }
        if (intentos == 0) {
            System.out.println("Error, se a alcanzado el numero de intentos permitidos");
        }
        return "";
    }

    /**
     * Leer temperaturas hasta encontrar una menor a cero (Un programa que
     * solicita al usuario que introduzca las temperaturas una por una,el
     * proceso se repite hasta que se introduce una temperatura inferior a cero,
     * momento en el que se muestra un mensaje y el programa finaliza.)
     *
     * @param temperatura (variable donde se guarda la temperatura)
     */
    public void temperaturamenora0(float temperatura) {
        Scanner sc = new Scanner(System.in);
        temperatura = 0.0f;
        System.out.println("Ingrese una temperatura");
        temperatura = sc.nextFloat();
        while (temperatura >= 0) {
            System.out.println("Ingrese otra temperatura");
            temperatura = sc.nextFloat();
            if (temperatura < 0) {
                System.out.println("Se encontro una temperatura menor a  0 " + temperatura);
                break;
            }
        }
    }     
}
