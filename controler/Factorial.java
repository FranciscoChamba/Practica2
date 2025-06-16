/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Factorial {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resultado_factorial,factorial_a_calcular = 1;
        System.out.println("Ingrese el numero factorial");
        resultado_factorial = sc.nextInt();
      factorial_a_calcular = resultado_factorial;
      for (int i = 1; i < factorial_a_calcular; i++) {
          resultado_factorial = i * resultado_factorial;
      }
        System.out.println("El resultado factorial de "+factorial_a_calcular+ "es:" +resultado_factorial);   
   }
}
