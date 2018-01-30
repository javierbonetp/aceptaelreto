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
    static boolean Milenario(char[][] celda, int x,int y){
        if((x<0) || (x>=celda.length) || (y<0) || (y>=celda[0].length)){
            return false;
        }
        if((celda[x][y]=='S') || (celda[x][y]=='.')){
            if((x+1)>=celda.length){
                Milenario(celda,x,y+1);
            }else{
                Milenario(celda,x+1,y);
            }
            if((y+1)>=celda[0].length){
                Milenario(celda,x+1,y);
            }else{
                Milenario(celda,x,y+1);
            }
        }else{
            return false;
        }
        return false;
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
        int Si=0;
        int Sj=0;
        
        System.out.println("Dime las filas y columnas: ");
        filas=scan.nextInt();
        columnas=scan.nextInt();
        scan.nextLine();
                
        char celda [][]= new char [filas][columnas];
        
        for(int i=0;i<filas;i++){
            temporal=scan.nextLine();
            for(int j=0;j<columnas;j++){
                celda[i][j]=temporal.charAt(j);
                if(celda[i][j]=='S'){
                    Si=i;
                    Sj=j;
                }
            }
        }
        //Muestra el mapa
        //MostrarMapa(celda);
        if(Milenario(celda, Si,Sj)==true){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        
    }
    
}
