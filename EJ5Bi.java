/*Realiza un programa que rellene un array de 6 filas por 10 columnas
con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
A continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */
public class EJ5Bi {
    public static void main(String[] args) throws InterruptedException {
        int [][] numero = new int[6][10];
        int fila;
        int columna;

        int maximo = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int columnaMaximo = 0;

        int minimo = Integer.MAX_VALUE;
        int filaMinimo = 0;
        int columnaMinimo = 0;

        System.out.print("         ");

        for (columna= 0; columna < 10; columna++) {
            System.out.print("   " + columna + "   " );    
        }
        System.out.println();
        System.out.print("        ┌");
        for (columna= 0; columna < 10; columna++) {
            System.out.print("-------");    
        }
        System.out.println("┐");

        for (fila = 0; fila < 6; fila++) {
            System.out.print("      " + fila + " |");
            for (columna= 0; columna < 10; columna++) {
                numero[fila][columna] = (int)(Math.random()*1001);
                System.out.printf("%5d  ", numero[fila][columna]);
                Thread.sleep(50);

                //Calcula el máximo
                if(numero[fila][columna] > maximo){
                    maximo = numero[fila][columna];
                    filaMaximo = fila;
                    columnaMaximo = columna;
                }
                //Calcula el mínimo
                if(numero[fila][columna] < minimo){
                    minimo = numero[fila][columna];
                    filaMinimo = fila;
                    columnaMinimo = columna;
                }
            }
        System.out.print("|");
        System.out.println();
        }
        System.out.print("        └");
        for (columna= 0; columna < 10; columna++) {
            System.out.print("-------");    
        }
        System.out.println("┘\n");

        System.out.println("El máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
        System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
        System.out.println(); 
    }
}
