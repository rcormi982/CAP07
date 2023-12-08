/*Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá.
Ejemplo 1:
Array original:
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 5 82 0 131 113 200 134 44 48 134 68 151
Introduzca el número que quiere insertar: 77
Introduzca la posición donde lo quiere insertar (0 – 11): 6
Array resultado:
Arrays 128
Índice 0 1 2 3 4 5 6 7 8 9 10 11
Valor 5 82 0 131 113 200 77 134 44 48 134 68 */

public class EJ19 {
    public static void main(String[] args) {
        int[] numero = new int[12];
        for (int i = 0; i < 12; i++) {
            numero[i] = (int) (Math.random() * 201);
        }
        // Muestra el array original
        System.out.println("Array original:");
        System.out.print("\nÍndice ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor  ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", numero[i]);
        }
        // Pide el número y la posición donde colocarlo
        System.out.println();
        System.out.print("Introduzca el número que quiere insertar: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int posicion = Integer.parseInt(System.console().readLine());
        // Inserta el número y desplaza el resto hacia la derecha
        for (int i = 11; i > posicion; i--) {
            numero[i] = numero[i - 1];
        }
        numero[posicion] = numeroIntroducido;
        // Muestra el resultado
        System.out.println();
        System.out.println("Array resultado:");
        System.out.print("\nÍndice ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor  ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", numero[i]);
        }
    }
}

