/*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
Seguidamente el programa pasará los primos a las primeras posiciones, desplazando
el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
Al final se debe mostrar el array resultante. */
public class EJ11 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int[] primo = new int[10];
        int[] noPrimo = new int[10];

        int primos = 0;
        int noPrimos = 0;
        boolean esPrimo = false;

        System.out.println("Introduzca 10 números separados por INTRO:");

        for (int i = 0; i < 10; i++) {
            numero[i]=Integer.parseInt(System.console().readLine());
            esPrimo = true;
            for (int j = 2; j < numero[i]-1; j++) {
                if(numero[i]%j==0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                primo[primos++]= numero[i];
            }else{
                noPrimo[noPrimos++]= numero[i];
            }
        }
        //Muestra el array original
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" │%4d", numero[i]);
        }
        System.out.println(" │\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        //Los números primos se meten en las primeras posiciones del array original

        for (int i = 0; i < primos; i++) {
            numero[i]=primo[i];
        }
        //Los números que no son primos se colocan al final
        for (int i = primos; i < primos + noPrimos; i++) {
            numero[i] = noPrimo[i -primos];
        }
        System.out.println("\n\nArray con los primos al principio:");
        System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" │%4d", numero[i]);
        }
        System.out.println(" │\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
