//las clases en java no llevan () 
//las clases principales llevan el mismo nombre que el archivo donde son creadas. 
public class Equipo {  
    // el nombre del consutructor tiene que ser igual al el de la clase en la que se encuentra.  
    //lo siguiente es un constructor.  
     /* 
      * constructor: metodo especial para crear e inicializar objeto en esa clase. Su principal funcion es asignar valores 
      iniciales a las variables miembro (atributos o propiedades) del objeto cuando se crea una nueva istancia de la clase. 
      */
    public Equipo() { 
    }  
    /* 
     * Son los atributos de la clase, almacenan informacion del equipo. Son variables de acceso privado, esto significa que solo pueden 
     * ser accedidas directamente dentro de la clase. 
     */
    private String nombre; 
    private int posicion; 
    private int tirosEsquina; 
    private int ganados; 
    private int perdidos; 
    private int tirosAgol; 
    private int goles;
    private int amarillas; 
    private int faltas; 

}