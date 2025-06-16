/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjecutorPracticas2;

import Repaso.Repaso;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class ejecutor {
private static Scanner sc = new Scanner (System.in);  
    public static void main(String[] args) {
        //para repaso transformar Nota
        /*System.out.println("Ingrese la nota");
        float nota = sc.nextFloat();
        Repaso rp = new Repaso();
        char letra_nota = rp.transformarNotaLetra(nota);
        System.out.println("La nota es:" + letra_nota);*/
        
         Repaso rp = new Repaso();
       for (int i = 0; i < 100 ; i++){
        if (rp.verificar_num_perfecto(i))  
               System.out.println("El numero"+i+"es perfecto ");
  
        }
    } 
}

    
    
   
     

