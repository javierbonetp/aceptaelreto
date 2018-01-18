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

public class LadoOscuro {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int numero;
        int nu;
        int i;
        int j;
        int cont;
        //System.out.println("Numeros: ");
        nu=num.nextInt();
        for(j=0;j<nu;j++){
            //System.out.println("Dime: ");
            numero=num.nextInt();
            char[] res=Integer.toString(numero,5).toCharArray();
            cont=0;
            for(i=0;i<res.length;i++){
                if(res[i]=='4'){
                    cont++;
                }
            }
            if(cont>1){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}
