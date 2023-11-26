/*Define un array de 10 simboloes con nombre “simbolo” y asigna
valores a los elementos según la siguiente tabla:
Posición 0  1  2  3  4  5  6  7  8  9
Valor   'a''x'      '@'   ' ''+''Q'
Muestra el contenido de todos los elementos del array. ¿Qué sucede
con los valores de los elementos que no han sido inicializados? */
public class EJ02 {
    public static void main(String[] args) {
        char[] caracter = new char[10];

        caracter[0]='a';
        caracter[1]='x';
        caracter[4]='@';
        caracter[6]=' ';
        caracter[7]='+';
        caracter[8]='Q';

        for (int i = 0; i < 10; i++) {
            System.out.printf("[%d]: %s%n", i, caracter[i]);

            //System.out.println("["+i+"]: " + caracter[i]);
        }




    }
}
