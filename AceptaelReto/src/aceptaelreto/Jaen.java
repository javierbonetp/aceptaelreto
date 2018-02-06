package aceptaelreto;


import java.util.Scanner;

public class Jaen {

    private static int tamPlantacion(char mapa[][], int x, int y) {
        
        int tam = 0;
        
        if (x < 0 || y < 0 || x >= mapa.length || y >= mapa[0].length) {
            return 0;
        }

        if (mapa[x][y] == ' ') {
            return 0;
        }

        if (mapa[x][y] == '#') {
            
            // Evitar bucle infinito
            mapa[x][y] = ' ';
            
            tam++;

            tam += tamPlantacion(mapa, x + 1, y);
            tam += tamPlantacion(mapa, x - 1, y);
            tam += tamPlantacion(mapa, x, y + 1);
            tam += tamPlantacion(mapa, x, y - 1);

            // Devolvemos el tamaño
            return tam;
        }

        return 0;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Para cada caso de prueba (mientras haya casos)
        while (scan.hasNext()) {

            int filas = scan.nextInt();
            int columnas = scan.nextInt();
            scan.nextLine();

            char mapa[][] = new char[filas][columnas];

            // Leemos el mapa y lo guardamos
            for (int i = 0; i < filas; i++) {
                String tmp = scan.nextLine();
                for (int j = 0; j < tmp.length(); j++) {
                    mapa[i][j] = tmp.charAt(j);
                }
            }

            // Buscamos el tamaño de la plantacion en 0,0
            int tam = tamPlantacion(mapa, 0, 0);
            System.out.println("Maxima plantacion de: " + tam);

        }

    }

}
