/*Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).
Arrays 134
Ejemplo:
                                                      MED MIN MAX
España:     178 165 148 185 155 141 165 149 155 201 | 164 141 201
Rusia:      179 189 208 167 186 174 152 192 173 179 | 179 152 179
Japón:      173 182 168 170 181 197 146 168 166 177 | 172 146 177
Australia:  172 170 187 186 197 143 190 199 187 191 | 182 143 191 */
public class EJ13Bi {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estaturas = new int[4][10];
        // Genera el array de estaturas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                estaturas[i][j] = (int) (Math.random() * (210 - 140 + 1)) + 140;
            }
        }
        // Calcula media, mínimo y máximo y muestra los datos
        System.out.printf("%64s\n", "MED MIN MAX");
        for (int i = 0; i < 4; i++) {
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;
            int suma = 0;
            System.out.printf("%9s:", pais[i]);
            for (int estatura : estaturas[i]) {
                System.out.printf("%4d", estatura);
                if(estatura > maximo){
                    maximo = estatura;
                }
                if(estatura < minimo){
                    minimo = estatura;
                }
                suma += estatura;
            }
        System.out.printf(" |%4d%4d%4d\n", suma / 10, minimo, maximo);
        }
    }
}

   
