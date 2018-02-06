package aceptaelreto;


import java.util.Scanner;

public class Jaen {

    private static int tamPlantacion(char mapa[][], int x, int y) {
        
        //tam = tamaño de la plantacion
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
            
            //A la derecha
            tam += tamPlantacion(mapa, x + 1, y);
            //A la izquierda
            tam += tamPlantacion(mapa, x - 1, y);
            //Arriba
            tam += tamPlantacion(mapa, x, y + 1);
            //Abajo
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
            int fbuscada=-1;
            int cbuscada=-1;
            scan.nextLine();

            char mapa[][] = new char[filas][columnas];

            // Leemos el mapa y lo guardamos
            for (int i = 0; i < filas; i++) {
                String tmp = scan.nextLine();
                for (int j = 0; j < tmp.length(); j++) {
                    mapa[i][j] = tmp.charAt(j);
                }
            }
            //Buscamos la primera #
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if(mapa[i][j]=='#'){
                        if(fbuscada==-1){
                            fbuscada=i;
                            cbuscada=j;
                        }
                    }
                }
            }

            // Buscamos el tamaño de la plantacion en 0,0
            int tam = tamPlantacion(mapa, fbuscada, cbuscada);
            System.out.println("Maxima plantacion de: " + tam);

        }

    }

}
