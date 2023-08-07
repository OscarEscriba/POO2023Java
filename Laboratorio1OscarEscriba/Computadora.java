package Laboratorio1OscarEscriba;
import java.util.*;  
//el codigo de clase computadora es basicamente lo mismo que el codigo de lca clase Jugador.java
public class Computadora {
    //se instancian los atributos de la clase (variables con las que se van a trabajar en la clase.)
    private int PuntosPorRondaCPU; 
    private int PuntosTotalesCPU; 
    private int continuidadCPU;    
    private boolean accion = false;  //esto es solo avisa si la computadora ya jugo un turno o no, ya que la limitante de la computadora es que solo pueda jugar un turno. 
//constructor de esta clase. 
    public Computadora() { 
        PuntosPorRondaCPU =0; 
        PuntosTotalesCPU =0; 
        continuidadCPU =0; 
    }
    public Computadora(int PuntosTotalesCPU, int PuntosPorRondaCPU, int continuidadCPU) { 
        this.PuntosPorRondaCPU =PuntosPorRondaCPU; 
        this.PuntosTotalesCPU =PuntosTotalesCPU; 
        this.continuidadCPU =continuidadCPU;  
    } 
    //metodos para obtener los valores de los atributos de la clase, porque aun se van autilizar e otras clases
    public int getPuntosPorRondaCPU(){
        return this.PuntosPorRondaCPU; 
    } 
    public void setPuntosPorRondaCPU(int PuntosPorRondaCPU) {
        this.PuntosPorRondaCPU = PuntosPorRondaCPU; 
    }
    public int getPuntosTotalesCPU(){ 
        return this.PuntosTotalesCPU; 
    } 
    public void setPuntosTotalesCPU(int PuntosTotalesCPU){ 
        this.PuntosTotalesCPU = PuntosTotalesCPU; 
    } 
    public int getcontinuidadCPU() { 
        return this.continuidadCPU; 
    } 
    public void setcontinuidadCPU(int continuidadCPU) { 
        this.continuidadCPU=continuidadCPU; 
    }
    public int PuntosPorRondaCPU(int PuntosPorRondaCPU) {  
        Dado tiro1 = new Dado(); 
        Dado tiro2 = new Dado(); 
        int v1 =tiro1.getdado1(); 
        int v2 =tiro2.getdado2();  
        if (v1 ==1|| v2 ==1) { 
            PuntosPorRondaCPU =0; 
        } 
        else { 
            PuntosPorRondaCPU += v1 +v2;
            accion = true; 
        }
        return PuntosPorRondaCPU; 
    } 
public int PuntosTotalesCPU (int PuntosTotalesCPU) {  
    PuntosTotalesCPU += PuntosPorRondaCPU; 
    return PuntosTotalesCPU; 
}  
/* 
 * enciende una tipo bandera para que el programa principal entienda que paso y que no. 
 * en el caso de que se siga jungando o no. 
 */
public int seguirCPU(int continuidadCPU) { 
    if (accion){ 
        continuidadCPU =0; 
    }else { 
        continuidadCPU=1; 
    }
return continuidadCPU;   
}
}
