/*Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números. */
public class EJ4Bi {
    public static void main(String[] args) throws InterruptedException {
        int[][] numero = new int[4][5];
        int fila;
        int columna;
        int sumaFila;
        int sumaColumna;
        int sumaTotal=0;
        System.out.println("\nIntroduce 20 números enteros separados por INTRO");
        for (fila= 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++){
                numero[fila][columna] = (int)((Math.random()*900)+100);
            }   
        }

        System.out.print("        ");
        for (columna = 0; columna < 5; columna++) {
            System.out.print("Columna " + columna + "     ");
        }
        System.out.print("      Suma");
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
            Thread.sleep(500);
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
            Thread.sleep(500);
        }
        System.out.printf("      %8d",sumaTotal);
    }
}
 

