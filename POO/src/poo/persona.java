
package poo;
public class persona {
    private String nombre;
    int edad;
    
    public persona(String nombre, int edad)
    {
        
        this.nombre=nombre;
        this.edad= edad;
    }
    
    public persona(String nombre)
    {
      
        
        this.nombre=nombre;    
    }
    
    public int sumar(){
    
        return edad;
    }
    
    public void asignarnombre(String nombre){
    
        this.nombre= nombre;
    }
    
    public void saludar(){
        System.out.println("Hola mi nombre es: "+nombre);
    }
    
    
    
}
