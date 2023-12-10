/*Modica el programa anterior de tal forma que no se repita ningún número en el array. */
public class EJ6Bi {
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

        // Genera el contenido del array sin que se repita ningún valor
        boolean repetido;
        for(fila = 0; fila < 6; fila++) {
            for(columna = 0; columna < 10; columna++) {
                do {
                    numero[fila][columna] = (int)(Math.random() * 1001);
                    // Comprueba si el número generado ya está en el array.
                    repetido = false;
                    for (int i = 0; i < 10 * fila + columna; i++) {//Preguntar
                        if (numero[fila][columna] == numero[i / 10][i % 10]) {
                            repetido = true;
                        }
                    }
                } while (repetido);
            }
        }

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

