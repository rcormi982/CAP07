/*Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden.
Ejemplo 1:
Array original:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │ 0   │ 1   │ 2   │ 3   │ 4   │ 5   │ 6   │ 7   │ 8   │ 9   │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 127 │ 178 │ 11  │ 39  │ 121 │ 82  │ 130 │ 47  │ 128 │ 129 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
Array resultado:
┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│ Índice │ 0   │ 1   │ 2   │   3 │   4 │   5 │   6 │   7 │   8 │   9 │
├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ Valor  │ 11  │ 127 │ 39  │ 178 │  82 │ 121 │ 47  │ 130 │ 128 │ 129 │
└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘ */
public class EJ18 {
    public static void main(String[] args) {
        int[] numero = new int[10];
        int[] numMenores = new int[10];
        int[] numMayores = new int[10];
        int cuentaMenores = 0;
        int cuentaMayores = 0;

        // Genera el array original y clasifica los números
        for (int i = 0; i < 10; i++) {
            numero[i] = (int) (Math.random() * 201);
            if (numero[i] <= 100) {
                numMenores[cuentaMenores++] = numero[i];
            } else {
                numMayores[cuentaMayores++] = numero[i];
            }
        }
        // Muestra el array original
        System.out.println("\nArray original:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│");
        System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", numero[i]);
        }
        System.out.println("│");
        System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        // Genera el array resultado
        int[] resultado = new int[10];
        int menoresColocados = 0;
        int mayoresColocados = 0;
        int j = 0;
        do {
            if (menoresColocados < cuentaMenores) {
                resultado[j++] = numMenores[menoresColocados++];
            }
            if (mayoresColocados < cuentaMayores) {
                resultado[j++] = numMayores[mayoresColocados++];
            }
        } while (j < 10);
        // Muestra el resultado.
        System.out.println("\nArray resultado:");
        System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", i);
        }
        System.out.println("│");
        System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("│ Valor  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("│%4d ", resultado[i]);
        }
        System.out.println("│");
        System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}
