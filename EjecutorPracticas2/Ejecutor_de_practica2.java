package EjecutorPracticas2;

import PracticaNro2.EjerciciosDoWhile;
import PracticaNro2.EjerciciosFor;
import PracticaNro2.EjerciciosWhile;
import PracticaNro2.EjerciciosSwitch;
import PracticaNro2.Practica2;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 *En este espacio se encuentra el ejecutor donde
 * se pude probar la ejecucion de los programas
 */
public class Ejecutor_de_practica2 {
    private static Scanner sc = new Scanner(System.in);
   public static void main(String[] args){
       System.out.println("1. Secuencia de Collatz");
        System.out.println("2. Determinar la raíz cuadrada entera de un número sin usar funciones matemáticas.");
        System.out.println("3.Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por 5.");
        System.out.println("4.Generar todos los números de 3 dígitos donde la suma de los dígitos sea igual a 10.");
        System.out.println("5.Ingresar números hasta que la suma supere 1000");
        System.out.println("6.Leer enteros hasta que se ingrese un múltiplo de 7.");
        System.out.println("7.Validar contraseña con tres intentos");
        System.out.println("8 Leer temperaturas hasta encontrar una menor a cero.");
        System.out.println("9.Generar un menú que se repita hasta que se elija salir");
        System.out.println("10.Leer notas hasta que se ingrese -1 y calcular promedio");
        System.out.println("11.Verificar si una secuencia termina en número negativo.");
        System.out.println("12.Leer edades y determinar la cantidad de mayores de edad.");
        System.out.println("13.Simular un menú de cajero automático con depósitos, retiros y consultas.");
        System.out.println("14.Mostrar nombre del mes según número ingresado");
        System.out.println("15.Clasificación de IMC según valor ingresado.");
        System.out.println("16.Determinar la estación del año según el número del mes.");
        System.out.println("17.Validación de formularios web");
        System.out.println("18.Análisis de datos climáticos");
        System.out.println("19.Gestión de préstamos en biblioteca");
        System.out.println("20.Control de inventario en tienda de electrónica ");
        System.out.println("21.Control de acceso en un sistema de seguridad");
         
        int option = sc.nextInt();
        EjerciciosFor ef = new EjerciciosFor();
        EjerciciosWhile ew = new EjerciciosWhile();
        EjerciciosDoWhile dw = new EjerciciosDoWhile();
        EjerciciosSwitch es = new EjerciciosSwitch();
        Practica2 ep = new Practica2();
        do {
            switch (option) {
                case 1:
                    System.out.println("Ingrese un numero");
                    int num = sc.nextInt();
                    int resultado = ef.secuenciaDeCollatz(num);
                    System.out.println(+resultado);
                    break;
                case 2:
                    System.out.println("Ingrese un valor ");
                    int va  = sc.nextInt();
                    int res = ef.raizCuadradadeunNumero(va);
                    System.out.println("La respuesta es " + res);
                    break;
                case 3:
                    System.out.println("La secuencia es :");
                    ef.numerosNoidivisiblespor3nipor5();
                    break;
                case 4:
                    System.out.println("Los numero de 3 digitos que sumados dan 10 son :");
                    ef.sumaDe3digitossumadosiguala10();
                    break;
                case 5:
                    System.out.println("Ingrese un numero");
                    int sum = sc.nextInt();
                    int r = ew.numerosHastaquesupere1000(sum);
                    System.out.println(+r);
                    break;
                case 6:
                    ew.numerosNomultiplosde7();
                    break;
                case 7:
                    ew.contraseñadetresintentos("swing123");
                    break;
                case 8:
                    ew.temperaturamenora0(0);
                    break;
                case 9 :
                    dw.menuhastaExit();
                    break;
                case 10 :
                    dw.notas();
                    break;
                case 11 :
                    dw.verificarSecuencia();
                    break;
                case 12 :
                    dw.determinar_cantidad_mayor_edad();
                    break;
                case 13:
                    es.cajero_automatico();
                    break;
                case 14 :
                   es.mes_segun_numero();
                    break;
                case 15 :
                    es.clasificacion_IMC();
                    break;
                case 16:
                    es.EstacionDeAño();
                    break;
                case 17:
                    ep.validacion_web();
                    break;
                case 18:
                    ep.analisis_climatico();
                    break;
                case 19 :
                    ep.gestion_prestamo();
                    break;
                case 20:
                   ep.Control_inventario();
                    break;
                case 21:
                    ep.Contro_acceso();
                    break;
                default:
                    break;
            }
            System.out.println("Quieres salir presione 0 sino presione cualquier numero del menu para continuar");
            option = sc.nextInt();
        } while (option != 0);
        

    }
      
}
        
