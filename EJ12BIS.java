/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7 */
public class EJ12 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int[] resultado = new int[10];

        int numInicial;
        int numFinal=0;
        boolean valido;

        System.out.println("Introduce 10 números separados por INTRO: ");

        for (int i = 0; i < 10; i++) {
            numero[i] = Integer.parseInt(System.console().readLine()); 
        }
        System.out.println();
        System.out.println("Array original");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", i);
        }
        System.out.println("|");
        System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Valor  ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("|%4d ", numero[i]);
        }
        System.out.println("|");
        System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

        //Pide las posiciones inicial y final

        do {
            valido = true;
            System.out.print("Introduzca la posición inicial [0-9]: ");
            numInicial = Integer.parseInt(System.console().readLine());
            if(numInicial<0 || numInicial>9){
                System.out.println("Valor incorrecto, debe ser un valor entre 0 y 9");
                valido = false;
            }
            

            System.out.print("Introduzca la posición final [0-9]: ");
            numInicial = Integer.parseInt(System.console().readLine());
            if(numFinal<0 || numFinal>9){
                System.out.println("Valor incorrecto, debe ser un valor entre 0 y 9");
                valido = false;
            }

            if(numInicial>=numFinal){
                System.out.println("Valores incorrectos, el valor inicial tiene que ser menor que el valor final");
                valido = false;
            }
        } while (!valido);
        System.out.println("Array original");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", i);
        }
        System.out.println("|");
        System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Valor  ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("|%4d ", numero[i]);
        }
        System.out.println("|");
        System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

        //Copia el array numero en resultado

        for (int i = 0; i < 10; i++) {
            resultado[i] = numero[i];
        }
        resultado[numFinal]= numero[numInicial];

        for (int i = numFinal+1; i < 10; i++) {
            resultado[i]=numero[i-1];
        }
        resultado[0] = numero[9];

        for (int i = 0; i < numInicial; i++) {
            resultado[i+1] = numero[i];
        }
        //Muestra el resultado
        System.out.println("Array resultante");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", i);
        }
        System.out.println("|");
        System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("|%4d ", resultado[i]);
        }
        System.out.println("|");
        System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
