/*Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal. */
public class EJ12Bi {
    public static void main(String[] args) {
        int[][] matriz = new int[9][9];
        // genera el array y lo muestra /////////////////////////
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                matriz[i][j] = (int)((Math.random()*401) + 500);
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.print("\nDiagonal desde la esquina superior izquierda a la esquina inferior derecha: ");
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        for(int i = 0; i < 9; i++) {
            int numero = matriz[i][8-i];
            System.out.print(numero + " ");
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
        }
        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + ((double)suma / 10));
    } 
}
