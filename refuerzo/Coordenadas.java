/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Coordenadas {
    //(5.6) ==> longitud;runbo
    //Tipos de datos primitivos o simples
    //short(edades,cuatro digitos), int,long(datos grandes,bases de datos) datos enteros
    //double (decimal con presicion)
    //float (decimal simple)
    //char (caracter)
    //boolean (valor logico)
    //tipos de datos compuestos
    //String (cadena de caracteres)
    //array (conjunto de datos de la misma especie)
    //Object (objetos)
    //list (listas en memoria)
    //grafos (grandes voluimenes de datos) 
    //arboles ()
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //entradas
        float x,y,longitud = 0.0f;
        String rumbo = "";
        System.out.println("Ingrese el valor de x en Kilometros");
        x = sc.nextFloat();
        System.out.println("Ingrese el valor de y en Kilometros");
        y = sc.nextFloat();
        //Modelos
        longitud = (float) Math.sqrt(x*x) + (y*y);
        double angulo = Math.atan (y/x);
        //entera.decimal (presicion)
        System.out.println("El resultado es:("+longitud+", "+angulo+")");
        //el resultado es (7.81025, 39.8055704204433)
        if (x == y){
            rumbo = "NE";
        } else {
            rumbo = "N" + (90);
        }
        if (x >= 0 && y >=0) {
            //primer cuadrante
        } else if (x < 0 && y >=0){
            //segundo cuadrante
        } else if (x < 0 && y < 0){
            //tercer cuadrante
        } else if ( x >= 0 && y <0){
            //cuarto cuadrante
        }
    }
    
}
