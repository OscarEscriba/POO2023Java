package Laboratorio1OscarEscriba; 
import java.util.*; 

public class Jugador { 
    //se instancian los atributos de la clase (variables con las que se van a trabajar en la clase.)
    private int PuntosPorRonda; 
    private int PuntosTotales; 
    private int continuidad;  

    //constructor de esta clase. 
    public Jugador() { 
        PuntosPorRonda =0; 
        PuntosTotales =0; 
        continuidad =0; 
    }
    public Jugador(int PuntosTotales, int PuntosPorRonda, int continuidad) { 
        this.PuntosPorRonda =PuntosPorRonda; 
        this.PuntosTotales =PuntosTotales; 
        this.continuidad =continuidad;  
    } 
    //metodos para obtener los valores de los atributos de la clase, porque aun se van autilizar e otras clases
    public int getPuntosPorRonda(){
        return this.PuntosPorRonda; 
    } 
    public void setPuntosPorRonda(int PuntosPorRonda) {
        this.PuntosPorRonda = PuntosPorRonda; 
    }
    public int getPuntosTotales(){ 
        return this.PuntosTotales; 
    } 
    public void setPuntosTotales(int PuntosTotales){ 
        this.PuntosTotales = PuntosTotales; 
    } 
    public int getcontinuidad() { 
        return this.continuidad; 
    } 
    public void setcontinuidad(int continuidad) { 
        this.continuidad=continuidad; 
    }
// metodos para que cada clase realice la accion corespondiente en la clase Jugador. 
public int PuntosPorTurno(int PuntosPorRonda) { 
    Dado valor1= new Dado();  
    Dado valor2 = new Dado(); 
    int v1 =valor1.getdado1(); 
    int v2 =valor2.getdado2(); 
    if (v1 ==1 || v2 ==1){ 
        PuntosPorRonda =0; 
    } else { 
        PuntosPorRonda += v1 + v2; 
    }
    /* estamos generando el tiro en el dado , nos queda obtener los valores de los dados y hacer las respectivas comprobaciones
    la parte de las comprobaciones y sumatorias las podemos ver en chatGPT. Despues de realizar eso nos queda solo ir sumando cantidades
    dentro de los parametros que se van a mandar a la clase principal. */ 
    return PuntosPorRonda; 
} 
public int SumatoriaPuntosTotales (int PuntosTotales) {  
    PuntosTotales += PuntosPorRonda; 
    return PuntosTotales; 
}  
/* 
 * enciende una tipo bandera para que el programa principal entienda que paso y que no. 
 * en el caso de que se siga jungando o no. 
 */
public int seguir(int continuidad) {  
    if (PuntosPorRonda >=20) {
        continuidad =1; 
    }else{
        continuidad=0; 
    }
    return continuidad;
}
}
