/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a
las primeras posiciones del array (del 0 en adelante) y todos los números impares a
las celdas restantes. Utiliza arrays auxiliares si es necesario. */
public class EJ10 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 20; i++) {
            numero[i]=(int)(Math.random()*101); 
            if(numero[i]%2==0){
                par[pares++]=numero[i];
            }else{
                impar[impares++]=numero[i];
            } 
        }
        //Muestra el array original
        System.out.println("Array original");
        for (int i = 0; i < 20; i++) {
            System.out.print(numero[i] + " ");
        }
        /*Mete los pares en las primeras posiciones del array*/
        for (int i = 0; i < pares; i++) {
            numero[i]=par[i];
        }
        //Mete los impares en los huecos que quedan
        for (int i = pares; i < 20; i++) {
            numero[i]=impar[i-pares];
        }
        System.out.println();
        //Muestra el resultado
        System.out.println("Muestra el array con los pares al principio");
        for (int i = 0; i < 20; i++) {
            System.out.print(numero[i] + " ");  
        }
    }
}
