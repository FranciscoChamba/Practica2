/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso;
/**
 *
 * @author Usuario iTC
 */
public class Repaso {
    
        //nos piden transformar a letras las notas de los estudiantes 
        //A 10
        //B 9 
        //C 8
        //E 7 
        //F 6........0

    /**
     *
     * @param nota
     * @return
     */
    public char transformarNotaLetra(float nota){
        char resp = ' ';
        switch((int)nota){
            case 10: resp = 'A';
            break;
            case 9: resp = 'B';
            break;
            case 8: resp = 'C';
            break;
            case 7: resp = 'E';
            break;
            default: resp = 'F';
            break;  
        }
        return resp;
    }
    //numero perfecto
public boolean verificar_num_perfecto(int num) {
    boolean band = false;
    int aux = 0;
    for (int i = 0; i < num;i++){
        if (num % i == 0)
            aux = aux+i;  
    }
    if (num == aux)
        band = true;
    return band;
            
} 

    }

