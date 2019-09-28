/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author richa
 */
public class clsrecorrido {
     int catri [][] = new int [8][8];
    public void despliega(int matriz[][]){
        for(int x = 0; x<matriz.length; x++){
            
            for(int y =0; y<matriz[x].length; y++){
                int currentCell = matriz [x][y];
                System.out.print(currentCell);
            }
            System.out.println();
        }
    }
    
     public  int numerornd(int rango){
        
         int numero=(int)(Math.random()*rango);
        return numero;
    }
    
    public void pos(){
        int matriz[][] = new int [8][8];
        int fila = numerornd(matriz.length);
        int columna = numerornd(matriz.length);
        
            
        matriz [fila][columna]=9;
        
        for(int i =0; i<matriz.length;i++){
            for(int j =0; j<matriz.length;j++){
                catri[i][j] = matriz[i][j];
                
            }
        }
        
        despliega(catri);
         
    }
    
    public void jugar(){
        
        int i=0, j=0, movi,movi2=0,posicion=0,fila=0;
        String mov="";
        String res="";
        Scanner sc = new Scanner(System.in);
        despliega(catri);
        posicion = catri.length;
        System.out.println("¿A que direccion deseas moverte?");
        System.out.println("Arriba");
        System.out.println("Abajo");
        System.out.println("Izquierda");
        System.out.println("Derecha");
        mov = sc.nextLine();
        
        if(mov.equalsIgnoreCase("abajo")){
            
            System.out.println("Ingresa tu posicion anterior, sino te haz movido ingresa 0");
            movi2= sc.nextInt();
            
            System.out.println("cuantas posiciones para abajo deseas moverte");
            movi= sc.nextInt();
            
            if(movi2==0){
            for(int x= 0; x<movi;x++){  
                catri [x][0] =1;
            }
            }else if(movi2>0){
             for(int x= 0; x<movi;x++){  
                catri [x][movi2-1] =1;
            }
        }
        }
        if(mov.equalsIgnoreCase("izquierda")){
        
            
            System.out.println("Ingresa tu posicion anterior, sino te haz movido ingresa 0");
            movi2= sc.nextInt();
            
            System.out.println("cuantas posiciones para la izquierda deseas moverte");
            movi= sc.nextInt();
            
            if(movi2==0){
                for(int x= 0; x<movi;x++){
                catri [movi2][x] =2;
                
             }
            }else{
            for(int x= 0; x<movi;x++){
                catri [movi2-1][x] =2;
                
             }
            }
    }
        if(mov.equalsIgnoreCase("Arriba")){
        
            
            System.out.println("Ingresa tu posicion anterior");
            movi2= sc.nextInt();
            
            System.out.println("cuantas posiciones para arriba deseas moverte");
            movi= sc.nextInt();
            
            
            for(int x = movi2; x>=movi;x--){
                catri [x][movi2] =3;
                
             }
            
    }
        despliega(catri);
}
}
