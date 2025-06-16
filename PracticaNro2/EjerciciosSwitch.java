package PracticaNro2;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class EjerciciosSwitch {

    Scanner sc = new Scanner(System.in);

    /**
     * Simular un menú de cajero automático con depósitos, retiros y
     * consultas.(programa que simula un cajero automatico)
     */
    public void cajero_automatico() {
        int depositos = 0;
        int retiros = 0;
        int consultas = 0;
        float cuenta = 1250.75f;
        System.out.println("1.Depósitos");
        System.out.println("2.Retiros");
        System.out.println("3.Consulta su saldo");
        int option = sc.nextInt();
        switch (option) {
            case 1:

                System.out.println("Cuanto desea depositar");
                depositos = sc.nextInt();
                if (depositos <= 0) {
                    System.out.println("Error");
                } else {
                    cuenta += depositos;
                    System.out.println("Usted a depositado $" + depositos);
                    System.out.println("Nuevo saldo $" + cuenta);
                }
                break;
            case 2:
                System.out.println("Usted tiene $" + cuenta);
                System.out.println("Cuanto desea retirar");
                retiros = sc.nextInt();
                if (retiros <= 0) {
                    System.out.println("Error");
                } else if (retiros > cuenta) {
                    System.out.println("Saldo insuficiente");
                } else {
                    cuenta -= retiros;
                    System.out.println("Usted a retirado $" + retiros);
                    System.out.println("Saldo disponible $" + cuenta);
                }
                break;
            case 3:
                System.out.println("Usted tiene $" + cuenta);
                break;
            default:
                break;
        }

    }

    /**
     * Mostrar nombre del mes según número ingresado(programa que si el usuario
     * ingresa un numero mustre nombre del mes )
     */
    public void mes_segun_numero() {
        int mes = 0;
        System.out.println("Ingrese un numero");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero");

                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiemre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                break;
        }
    }

    /**
     * Clasificación de IMC según valor ingresado(Programa que al momento que el
     * usuario ingresa su indice de masa corporal determina a que clase
     * pertenece)
     */
    public void clasificacion_IMC() {
        float peso = 0.0f;
        System.out.println("Ingrese su IMC");
        peso = sc.nextFloat();
        int condicion = 0;
        if (peso < 0) {
            System.out.println("IMC no valido");
        }
        if (peso < 18.5) {
            condicion = 1;
        } else if (peso >= 18.5 && peso < 25) {
            condicion = 2;
        } else if (peso >= 25 && peso < 30) {
            condicion = 3;
        } else if (peso >= 30) {
            condicion = 4;
        }

        switch (condicion) {
            case 1:
                System.out.println("Bajo peso");
                break;
            case 2:
                System.out.println("Peso normal");
                break;
            case 3:
                System.out.println("Sobre peso");
                break;
            case 4:
                System.out.println("Obesidad");
                break;
            default:
                break;
        }
    }

    /**
     * Determinar la estación del año según el número del mes.(Programa que al
     * momento de ingresar un numero del 1 al 12 determine la estacion del año )
     */

    public void EstacionDeAño() {
        int condicion = 0;
        int num = 0;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        if (num <= 0 || num > 12) {
            System.out.println("Ingrese un numero del 1 al 12");
        }
        if (num >= 3 && num <= 5) {
            condicion = 1;
        } else if (num >= 6 && num <= 8) {
            condicion = 2;
        } else if (num >= 9 && num <= 11) {
            condicion = 3;
        } else if (num == 12 || num == 1 || num == 2) {
            condicion = 4;
        }
        switch (condicion) {
            case 1:
                System.out.println("Primavera");
                break;
            case 2:
                System.out.println("Verano");
                break;
            case 3:
                System.out.println("Otoño");
                break;
            case 4:
                System.out.println("Invierno");
                break;
            default:
                break;
        }
    }
}
