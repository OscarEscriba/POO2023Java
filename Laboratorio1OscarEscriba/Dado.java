package Laboratorio1OscarEscriba; 
import java.util.Random; 


public class Dado { 
    private int dado1; 
    private int dado2; 
    private Random GenerarRandom; 

    //constructor de la clase dado.  
    public Dado() { 
        dado1 =0; 
        dado2 =0; 
        GenerarRandom = new Random(); 
    }
    public Dado(int dado1, int dado2) {  
        this.dado1 = dado1; 
        this.dado2 = dado2; 
        GenerarRandom = new Random(); 
    } 
// se crean los metodos para obtener los valores de los atributos de las clases. 
    public int getdado1() { 
        return this.dado1; 
    } 
    public void setdado1(int dado1) { 
        this.dado1=dado1;  
    } 
    public int getdado2() { 
        return this.dado2; 
    } 
    public void setdado2(int dado2) { 
        this.dado2 =dado2; 
    } 
    public int Aleatorio() { 
        return GenerarRandom.nextInt(6-1+1)+1; 
    } 
    //le asigna un valor a los dados para el juego. 
    public void tiro(){ 
        dado1=  Aleatorio(); 
        dado2= Aleatorio(); 
    }
}
