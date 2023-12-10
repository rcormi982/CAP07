/*Mejora el juego "Busca el tesoro" de tal forma que si hay una mina a una
casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca! */
public class EJ7Bi {
    //Definimos las contantes
    public static final int VACIO = 0;
    public static final int MINA = 1;
    public static final int TESORO = 2;
    public static final int INTENTO = 3;
    public static void main(String[] args) {
        int [][] cuadrante = new int[5][4];
        int x;
        int y;

        //Inicializa el array
        for (y = 0; y < 5 ; y++) {
            for (x = 0; x < 4; x++) {
                cuadrante [y][x] = VACIO;  
            }
        }
        //Coloca la mina
        int minaY = (int)(Math.random()*5);
        int minaX = (int)(Math.random()*4);
        cuadrante[minaY][minaX]=MINA;

        //Coloca el tesoro
        int tesoroY;
        int tesoroX;
        do {
            tesoroY = (int)(Math.random()*5);
            tesoroX = (int)(Math.random()*4);
        } while (minaX == tesoroX && minaY == tesoroX);

        cuadrante[tesoroY][tesoroX]=TESORO;

        //Juego
        System.out.println("¡Busca el Tesoro!\n");

        int oportunidades = 6;
        boolean salir = false;
        String c = "";
        
        do {
            //Pinta el cuadrante
            for (y= 4; y >=0; y--) {
                System.out.print(y + "|");
                for (x= 0; x < 4; x++) {
                    if(cuadrante[y][x]==INTENTO){
                        System.out.print("X ");
                    }else{
                        System.out.print("  ");
                    }
                }
            System.out.println();
            }
            System.out.println("  -------");
            System.out.println("  0 1 2 3");
            //Pide las coordenadas
            System.out.print("Coordenada Y: ");
            y = Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada X: ");
            x = Integer.parseInt(System.console().readLine());

            //Mira lo que hay en la coordenadas indicadas por el usuario
            switch (cuadrante[y][x]) {
                case VACIO:
                    cuadrante[y][x] = INTENTO;
                    if(Math.abs(y-minaY) < 2 && Math.abs(x-minaX) < 2){
                        System.out.println("Cuidado, hay una mina cerca");
                    }
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido");
                    salir = true; 
                    break;
                case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro");
                    salir = true; 
                    break;
                default:
                    break;
            }            
        } while (!salir);
        //Pinta el cuadrante
        for (y= 4; y >=0; y--) {
            System.out.print(y + "|");
                for (x= 0; x < 4; x++) {
                    switch (cuadrante[y][x]) {
                        case VACIO:
                            c = "  ";
                            break;
                        case MINA:
                            c = "* ";
                            break;
                        case TESORO:
                            c = "€ ";
                            break;
                        case INTENTO:
                            c = "X ";
                            break;
                        default:
                            break;
                    }
                System.out.print(c);
                }
            System.out.println();
        }
        System.out.println("  -------");
        System.out.println("  0 1 2 3");
    }
}
