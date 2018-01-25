/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

/**
 *
 * @author javpin
 */
import java.util.Scanner;
public class FuerzasImperiales {
    static boolean Milenario(char[][] celda){
        int Si=0;
        int Sj=0;
        int Fi;
        int Fj;
        
        for(int i=0;i<celda.length;i++){
            for(int j=0;j<celda[i].length;j++){
                if(celda[i][j]=='S'){
                    Si=i;
                    Sj=j;
                }
                if(celda[i][j]=='F'){
                    Fi=i;
                    Fj=j;
                }
            }
        }
        for(int i=Si;i<celda.length;i++){
            for(int j=Sj;j<celda[i].length;j++){
                if((j+1)<celda[i].length){
                    if((celda[i][j+1]=='.') && ((j+1)<=celda.length)){
                    Milenario(celda);
                    }
                    if(celda[i][j+1]=='*'){
                    return false;
                    }
                    if(celda[i][j+1]=='F'){
                    return true;
                    }
                }
                if(((i+1)<celda.length) && ((i+1)<=celda.length)){
                    if(celda[i+1][j]=='.'){
                    Milenario(celda);
                    }
                    if(celda[i+1][j]=='*'){
                    return false;
                    }
                    if(celda[i+1][j]=='F'){
                    return true;
                    }
                if((celda[i][j-1]=='.') && ((j-1)>=0)){
                    Milenario(celda);
                    }
                    if(celda[i][j-1]=='*'){
                    return false;
                    }
                    if(celda[i][j-1]=='F'){
                    return true;
                    }
                }
                if(((i+1)<celda.length) && ((i-1)>=0)){
                    if(celda[i-1][j]=='.'){
                    Milenario(celda);
                    }
                    if(celda[i-1][j]=='*'){
                    return false;
                    }
                    if(celda[i-1][j]=='F'){
                    return true;
                    }
                }
            }
        }
        //?¿
        return true;
    }
    static void MostrarMapa(char[][] celda){
        System.out.print("Mapa:\n");
        for(int i=0;i<celda.length;i++){
            for(int j=0;j<celda[i].length;j++){
                System.out.print(celda[i][j]);
            }
             System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int filas=0;
        int columnas=0;
        String temporal;
        String FilasColumnas;
        
        System.out.println("Dime las filas y columnas: ");
        filas=scan.nextInt();
        columnas=scan.nextInt();
        scan.nextLine();
                
        char celda [][]= new char [filas][columnas];
        
        for(int i=0;i<filas;i++){
            temporal=scan.nextLine();
            for(int j=0;j<columnas;j++){
                celda[i][j]=temporal.charAt(j);
            }
        }
        //Muestra el mapa
        //MostrarMapa(celda);
        if(Milenario(celda)==true){
            Milenario(celda);
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        
    }
    
}
