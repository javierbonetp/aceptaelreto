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
public class Hangar {

//Devuelve true si es posible meter nave en hangar
    static boolean resuelvecaso(int[] hangares, int[] naves) {
        for (int i = 0; i < naves.length; i++) {
            int poshangarmax = dimehangarmax(hangares);
            if (naves[i] <= hangares[poshangarmax]) {
                hangares[poshangarmax] = hangares[poshangarmax] - naves[i];
            } else {
                return false;
            }
        }
        return true;
    }

    // nos dice la posicion hangar de mayor tamaño
    static int dimehangarmax(int[] hangares) {
        int pos = 0;
        for (int i = 0; i < hangares.length; i++) {
            if (hangares[i] > hangares[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hangares[];
        int nh;
        int naves[];
        int nn;

        //System.out.println("Dime cuantos hangares: ");
        nh = scan.nextInt();
        while (nh != 0) {
            hangares = new int[nh];
            for (int i = 0; i < nh; i++) {
                //System.out.println("Dime cuantos espacios vacios en hangar: ");
                hangares[i] = scan.nextInt();
            }
            //System.out.println("Dime cuantas naves: ");
            nn = scan.nextInt();
            naves = new int[nn];

            for (int i = 0; i < nn; i++) {
                //System.out.println("Dime los tamaños de las naves: ");
                naves[i] = scan.nextInt();
            }

            boolean res = resuelvecaso(hangares, naves);
            if (res == true) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            //System.out.println("Dime cuantos hangares: ");
            nh = scan.nextInt();
        }

    }

}
