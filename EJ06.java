/*Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota 
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array. */
public class EJ06 {
    public static void main(String[] args) {
        int numero[] = new int[15];

        System.out.println("Introduzca el número y pulse INTRO");

        for (int i = 0; i < 15; i++) {
            numero[i]=Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        //Muestra el array original
        System.out.println("Array original");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");
        //Rota una posición a la derecha
        int aux = numero[14];
        for (int i = 14; i > 0; i--) {
            numero[i]=numero[i-1];  
        }
        numero[0]=aux;

        //Muestra el array rotado
        System.out.println("\nArray rotado a la derecha una posición:");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println("-");
        for (int i = 0; i < 15; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");
    }
}
