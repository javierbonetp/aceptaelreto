/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;
import java.util.Scanner;
/**
 *
 * @author javpin
 */
public class AceptaelReto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner txt0=new Scanner(System.in);
        Scanner txt1=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        
        
        String texto0;
        String texto1;
        int lin;
        int i;
        
        //System.out.println("Dime cuantas lineas: ");
        lin=sc.nextInt();
        for(i=0;i<lin;i++){
            //System.out.println("Dime: ");
            texto0=txt0.nextLine();
            //System.out.println("Dime dime: ");
            texto1=txt1.nextLine();
            if (texto0.equals("Luke") && texto1.equals("padre")){
                System.out.println("TOP SECRET");
            }else{
                System.out.println( texto0 + " yo soy tu, " + texto1);
            }
        }
    }
    
}
