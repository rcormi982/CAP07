/*Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13 */

public class EJ16 {
     public static void main(String[] args) {
        int [] numero = new int[20];
        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*401);
            System.out.printf("%d, ", numero[i]);
        }
        System.out.println();
        System.out.println("1. Múltiplos de 5");
        System.out.println("2. Múltiplos de 7");
        System.out.println("3. Opción: ");
        int opcion = Integer.parseInt(System.console().readLine());

        int multiplo;
            if (opcion == 1) {
                multiplo = 5;
            } else {
                multiplo = 7;
            }

        for (int elemento : numero) {
            if (elemento % multiplo == 0) {
                System.out.print("[" + elemento + "] ");
            } else {
                System.out.print(elemento + " ");
            }
        }
    }
}
