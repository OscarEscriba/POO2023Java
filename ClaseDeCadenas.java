//import, para importar se hace afuera de la clase. 
import java.util.Scanner; 
//para crear un objeto en una clase, se hace con "new"
public class ClaseDeCadenas { 
    public static void main(String[] args) { 
        String cadena = "Hola mundo"; 
        System.out.println(cadena); 
        cadena = "hola mundo a todo el \"mundo\""; 
        System.out.println(cadena); 
        //crear un objeto de tipo string. 
        String cadena1 = "hola", cadena2 ="mundo"; 
        //concatenacion de cadenas
        cadena = cadena1+cadena2; 
        System.out.println(cadena);  

        //tipos de datos. 
        int numero1=10; 
        float numero2=0.5f; 
        short numero3 =15; 

        int numero = numero3;  
        //casting, investigar que es. 
        numero2 = (short)numero; 

        System.out.println(numero);  

        Scanner teclado = new Scanner(System.in); 
        System.out.println(x:"ingrese el primero nombre"); 
        String nombre = teclado.nextLine(); 
        System.out.println("bienvenido" +nombre); 
    }
}