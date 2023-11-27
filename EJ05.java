/*Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */
public class EJ05 {
    public static void main(String[] args) {
        int numero[] = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Introduce un número y pulse INTRO");

        for (int i = 0; i < 10; i++) {
            numero[i]=Integer.parseInt(System.console().readLine());
            if(numero[i] < minimo){
                minimo = numero[i];
            }
            if(numero[i] > maximo){
                maximo = numero[i];
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(numero[i]);
            if(numero[i]==maximo){
                System.out.print(" maximo");
            }
            if(numero[i]==minimo){
                System.out.print(" minimo");
            }
        System.out.println();
        }
    }
}
