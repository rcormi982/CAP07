/*Escribe un programa que pida 20 números enteros.
Estos números se deben introducir en un array de 4 filas por 5 columnas.
El programa mostrará las sumas parciales de filas y columnas igual que
si de una hoja de cálculo se tratara.
La suma total debe aparecer en la esquina inferior derecha. */
public class EJ2Bi {
    public static void main(String[] args) {
        int[][] numero = new int[4][5];
        int fila;
        int columna;
        int sumaFila;
        int sumaColumna;
        int sumaTotal=0;
        System.out.println("\nIntroduce 20 números enteros separados por INTRO");
        for (fila= 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++){
                numero[fila][columna] = Integer.parseInt(System.console().readLine());
            }   
        }

        System.out.print("        ");
        for (columna = 0; columna < 5; columna++) {
            System.out.print("Columna " + columna + "     ");
        }
        System.out.print("     Suma");
        System.out.println();
        for (fila= 0; fila < 4; fila++) {
            sumaFila = 0;
            System.out.print("Fila  " + fila);
            for (columna= 0; columna < 5; columna++) {
                sumaFila+=numero[fila][columna];
                System.out.printf("%7d       ", numero[fila][columna]);  
            }
            sumaTotal += sumaFila;
            System.out.print("       " + sumaFila);
            System.out.println();
        }
        System.out.print("Suma");
        //System.out.print("         ");
        for (columna = 0; columna < 5; columna++) {
            sumaColumna = 0;
            for (fila = 0; fila < 4; fila++) {
                sumaColumna += numero[fila][columna];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%10d    ",sumaColumna);   
        }
        System.out.printf("    %8d",sumaTotal);
    }
}
