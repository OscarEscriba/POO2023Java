package Laboratorio1OscarEscriba;
import java.util.Scanner;
public class pig {  
    public static void main (String[] args) { 
        Jugador jugador = new Jugador();   
        Computadora compu = new Computadora();     

        Scanner teclado = new Scanner(System.in);  
        System.out.println("Quieres iniciar el juego: (1:si, 0: no)"); 
        String iniciar =teclado.nextLine();  
        int start = Integer.parseInt(iniciar); 
        if (start ==1) { 
        int ronda =1; 
        while (jugador.getcontinuidad() != 1){
            System.out.println("Ronda" +ronda+":"+jugador.getPuntosPorRonda()+"puntos");  
            jugador.PuntosPorRonda(jugador.getPuntosPorRonda()); 
            ronda++; 
        } 
        if (jugador.getcontinuidad() ==1) { 
            System.out.println("El jugador tiene estos puntos totales "+jugador.getPuntosTotales());
        } else { 
            System.out.println("es turno de la computadora... ");
        } if (jugador.getcontinuidad() ==1 && compu.getcontinuidadCPU() ==0){ 
            System.out.println("ronda" +ronda+":"+compu.getPuntosPorRondaCPU() +"Puntos"); 
            ronda++; 
        }else if (compu.getcontinuidadCPU() ==1) { 
             System.out.println("El jugador tiene estos puntos totales "+compu.getPuntosPorRondaCPU()); 

        }
    }
} 
} 

