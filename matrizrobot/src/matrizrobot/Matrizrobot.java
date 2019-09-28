/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizrobot;

import ejercicios.clsrecorrido;
import java.util.Scanner;

/**
 *
 * @author richa
 */
public class Matrizrobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         clsrecorrido aver = new clsrecorrido();
        Scanner sc = new Scanner(System.in);
        String res ="";
        
         aver.pos();
         System.out.println();
         
        do{
         aver.jugar();
             System.out.println("quieres seguir");
             res = sc.nextLine();
         }while(res.equalsIgnoreCase("si"));
        
         }
    }
    

