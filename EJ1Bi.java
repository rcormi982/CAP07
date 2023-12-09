/*Define un array de números enteros de 3 filas por 6 columnas con
nombre "num" y asigna los valores según la siguiente tabla:
num:
        Columna 0 Columna 1 Columna 2 Columna 3 Columna 4 Columna 5
Fila 0       0       30        2                             5
Fila 1      75                                      0
Fila 2                        -2          9                 11
Muestra el contenido de todos los elementos del array dispuestos en
forma de tabla como se muestra en la figura.*/
public class EJ1Bi {
    public static void main(String[] args) {
        int [][] numero = new int [3][6];
        int fila = 0;
        int columna;

        numero [0][0] = 0;
        numero [0][1] = 30;
        numero [0][2] = 2;
        numero [0][5] = 7;
        numero [1][0] = 75;
        numero [1][4] = 0;
        numero [2][2] = -2;
        numero [2][3] = 9;
        numero [2][5] = 11;

        System.out.print("      ");

        for (columna = 0; columna < 6; columna++) {
            System.out.print("   Columna " + columna);
        }
        System.out.println();
        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila  " + fila);
            for (columna = 0; columna  < 6; columna++) {
                System.out.printf("%6d      ", numero[fila][columna] );
            }
        System.out.println();
        }
    }
}

