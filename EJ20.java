/*Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1º y el segundo como Felipe 2º.
Ejemplo 1:
Arrays 129
Introduzca el número total de nombres de reyes: 7
Vaya introduciendo los nombres de los reyes y pulsando INTRO.
Felipe
Carlos
Carlos
Fernando
Carlos
Carlos
Felipe
Los reyes introducidos son:
Felipe 1º
Carlos 1º
Carlos 2º
Fernando 1º
Carlos 3º
Carlos 4º
Felipe 2º */
public class EJ20 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número total de nombres de reyes: ");
        int numero = Integer.parseInt(System.console().readLine());
        String[] reyes = new String[numero];
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        for (int i = 0; i < numero; i++) {
            reyes[i] = System.console().readLine();
        }
        for (int i = 0; i < numero; i++) {
            int orden = 1;
            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])) {
                orden++;
                }
            }
        System.out.println(reyes[i] + " " + orden + "º");
        }
    }
}

