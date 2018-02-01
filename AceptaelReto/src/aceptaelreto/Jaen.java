package aceptaelreto;

import java.util.Scanner;

public class Jaen {

    public static int sx, sy;
    public static int contador=0;

    // Busca camino
    public static boolean camino(char mapa[][], int x, int y) {

        // Nº de filas y de columnas
        int filas = mapa.length;
        int columnas = mapa[0].length;

        // Si fuera de rango, no hay camino
        if (x < 0 || y < 0 || x >= filas || y >= columnas) {
            return false;
        }

        // Si (x,y) es un espacio vacio, probando caminos
        if (mapa[x][y] == '#') {

            // Lo marcamos como asteroide, para que no se vuelva a
            // comprobar por otra funcion recursivas (bucle infinito)
            contador++;
            mapa[x][y] = '*';

            // Probamos Derecha
            if (camino(mapa, x + 1, y)) {
                return true;
            } // Probamos Abajo
            else if (camino(mapa, x, y + 1)) {
                return true;
            } // Probamos Izquierda
            else if (camino(mapa, x - 1, y)) {
                return true;
            } // Probamos Arriba
            else if (camino(mapa, x, y - 1)) {
                return true;
            } // Si no, ningun camino posible
            else {
                return false;
            }
        }

        // Si (x,y) es un asteroide: NO hay camino
        if (mapa[x][y] == '*') {
            // System.out.println("Encontrado asteroide");
            return false;
        }

        // Si (x,y) es F, camino encontrado!!
        if (mapa[x][y] == '#') {
            return true;
        }

        // Otro caso no deberia darse nunca, pero por si acaso, return false
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // int filas, columnas;
        char mapa[][] = new char[8][8];

        // Mientras haya casos de prueba
        while (scan.hasNext()) {

            // Cuantas Filas y Columnas
            int filas = scan.nextInt();
            int columnas = scan.nextInt();
            scan.nextLine();

            // Procesamos las Filas
            for (int i = 0; i < filas; i++) {
                String str = scan.nextLine();
                for (int j = 0; j < columnas; j++) {
                    char c = str.charAt(j);
                    mapa[i][j] = c;
                    if (c == '#') {
                        sx = i;
                        sy = j;
                    }
                }
            }
            camino(mapa, sx, sy);
            System.out.println("Caminos: " + contador);

        }

    }

}
