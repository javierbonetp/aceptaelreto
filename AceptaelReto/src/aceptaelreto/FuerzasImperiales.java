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
        
        MostrarMapa(celda);
        
        
        
    }
    
}
