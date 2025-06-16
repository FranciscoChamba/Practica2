/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class PracticasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner sc = new Scanner (System.in);
        float l1, l2, l3 = 0.0f ;
        System.out.println("Ingrese el lado1");
        l1 = sc.nextFloat();
        System.out.println("Ingrese el lado 2");
        l2 = sc.nextFloat();
        System.out.println("Ingrese el lado 3");
        l3 = sc.nextFloat();
        if (l1 > 0 && l2 > 0 && l3 >0) {
          if (l1 == l2 && l2 == l3) {
            System.out.println("Es un triangulo equilatero");
        } 
    }
}
}