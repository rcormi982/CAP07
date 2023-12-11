/*Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados. */
public class EJ9Bi {
    public static void main(String[] args) {
        int[][] matriz = new int[12][12];
        int capa;
        int aux1;
        int aux2;
        
        System.out.println("Matriz original");
        System.out.print(" -");
        for (int i = 0; i < 12; i++) {
            System.out.print("-----");
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j]=(int)(Math.random()*101);
                System.out.printf("%5d", matriz[i][j]);
            }
        System.out.println();
        }
        System.out.print(" -");
        for (int i = 0; i < 12; i++) {
            System.out.print("-----");
        }
        // rotación /////////////////////////////////////////////
        for(capa = 0; capa < 6; capa++) {//Lo divide por la mitad
            // rota por arriba
            aux1 = matriz[capa][11 - capa];
            for (int i = 11 - capa; i > capa; i--) {
                matriz[capa][i] = matriz[capa][i - 1];
            }
            // rota por la derecha
            aux2 = matriz[11 - capa][11 - capa];
            for (int i = 11 - capa; i > capa + 1; i--) {
                matriz[i][11 - capa] = matriz[i - 1][11 - capa];
            }
            matriz[capa + 1][11 - capa] = aux1;
            // rota por abajo
            aux1 = matriz[11 - capa][capa];
            for (int i = capa; i < 11 - capa - 1; i++) {
                matriz[11 - capa][i] = matriz[11 - capa][i + 1];
            }
            matriz[11 - capa][11 - capa - 1] = aux2;
            // rota por la izquierda
            for (int i = capa; i < 11 - capa - 1; i++) {
                matriz[i][capa] = matriz[i + 1][capa];
            }
            matriz[11 - capa - 1][capa] = aux1;
        } // for capa
        // muestra el array resultante ///////////////////////////
        System.out.println("\nMatriz Rotada:");
        System.out.print(" -");
        for (int i = 0; i < 12; i++) {
            System.out.print("-----");
        }
        System.out.println();
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
            System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.print(" -");
        for (int i = 0; i < 12; i++) {
            System.out.print("-----");
        }
    }
}
