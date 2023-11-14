

package tap_u3_practica1_tirodados;

public class HiloJugadores extends Thread{
    VDados d;
    String mensaje = "";
    int yoSoy;
    int dado1, dado2 = 0;
    int sum1, sum1total, sum2, sum2total, sum3, sum3total = 0;
    StringBuffer buffer = new StringBuffer();
    
    
    public HiloJugadores(VDados d, int tuEres) {
        this.d = d;
        yoSoy = tuEres;
    }
    
    public static void ganador(int sum1total, int sum2total, int sum3total){
        if(sum1total>sum2total){
            if (sum1total>sum3total) {
                System.out.println("Jugador 1 es el ganador con " + sum1total);
            }else{
                if (sum1total==sum3total) {
                    System.out.println("Jugadores 1 y 3 son ganadores con " + sum1total + " y " + sum3total);  
                }else{
                    System.out.println("Jugador 3 es el ganador con " + sum3total);
                }
            }
        }else{
            if (sum1total==sum2total) {
                if (sum1total>sum3total) {
                    System.out.println("Jugadores 1 y 2 son ganadores con " + sum1total + " y " + sum2total);
                }else{
                    System.out.println("Jugador 3 es el ganador con " + sum3total);
                }
            }else{
                if (sum2total>sum3total) {
                    System.out.println("Jugador 2 es el ganador con " + sum2total);
                }else{
                    if (sum2total==sum3total) {
                        System.out.println("Jugador 2 y 3 son los ganadores con " + sum2total + " y " + sum3total);
                    }else{
                        System.out.println("Jugador 3 es el ganador con " + sum3total);
                    }
                }
                
            }
        }
    }
    
    public void run(){
            System.out.println("SE LANZAN LOS DADOS");
            if(yoSoy == 1)               
                for (int i = 1; i < 3; i++) {
                dado1 = (int) (Math.random() * 6) + 1;
                dado2 = (int) (Math.random() * 6) + 1;
                sum1 = dado1+dado2;
                d.mostrarMensaje1("Jugador 1:" + "\n" 
                               + "Turno " + i + ":" + "\n"
                               + "Dado 1: " + dado1 + "\n"
                               + "Dado 2: " + dado2 + "\n");
                sum1total = sum1total + sum1;
            }   
            if(yoSoy == 2)               
                for (int j = 1; j < 3; j++) {
                dado1 = (int) (Math.random() * 6) + 1;
                dado2 = (int) (Math.random() * 6) + 1;
                sum2 = dado1+dado2;
                d.mostrarMensaje2("Jugador 2:" + "\n" 
                               + "Turno " + j + ":" + "\n"
                               + "Dado 1: " + dado1 + "\n"
                               + "Dado 2: " + dado2 + "\n");
                sum2total = sum2total + sum2;
            }     
            if(yoSoy == 3)               
                for (int k = 1; k < 3; k++) {
                dado1 = (int) (Math.random() * 6) + 1;
                dado2 = (int) (Math.random() * 6) + 1;
                sum3 = dado1+dado2;
                d.mostrarMensaje3("Jugador 3:" + "\n" 
                               + "Turno " + k + ":" + "\n"
                               + "Dado 1: " + dado1 + "\n"
                               + "Dado 2: " + dado2 + "\n");
                sum3total = sum3total + sum3;
                ganador(sum1total, sum2total, sum3total);
            }
    }  
} 
    


