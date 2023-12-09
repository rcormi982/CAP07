/*Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él.
Ejemplo:
Array original:
459 204 20 250 178 90 353 35 229 357 224 454 260 310 140
Array cincuerizado:
460 205 20 250 180 90 355 35 230 360 225 455 260 310 140 */
public class EJ21 {
    public static void main(String[] args) {
        int [] numero = new int[15];

        for (int i = 0; i < 15; i++) {
            numero[i] = (int) (Math.random() * 501);
        }
        for (int i = 0; i < 15; i++) {
            while (numero[i] % 5 != 0) {
                numero[i]++;
            };
        }
        // Muestra el resultado
        System.out.println();
        System.out.println("Array resultado:");
        for (int i = 0; i < 15; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}
