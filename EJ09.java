/*Realiza un programa que pida 8 números enteros y que luego muestre esos números
junto con la palabra "par" o "impar" según proceda. */
public class EJ09 {
    public static void main(String[] args) {
        int[] numero = new int[8];
        System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número: ");
        for (int i = 0; i < 8; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 0; i < 8; i++) {

            if(numero[i] % 2==0){
                System.out.println(numero[i] + " par");
            }else{
                System.out.println(numero[i] + " impar");
            } 
        }
    }
}
