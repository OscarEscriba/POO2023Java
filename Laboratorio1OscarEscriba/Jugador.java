package Laboratorio1OscarEscriba; 
import java.util.*; 

public class Jugador { 
    //se instancian los atributos de la clase (variables con las que se van a trabajar en la clase.)
    private int PuntosPorRonda; 
    private int PuntosTotales; 
    private int continuidad;  

    //constructor de esta clase. 
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
// metodos para que cada clase realice la accion corespondiente. 

}
