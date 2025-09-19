
package poo;
public class persona {
    private String nombre;
    protected int edad;
    
    
    //Constructor, inicializa nombre,edad
    public persona(String nombre, int edad)
    {
        
        this.nombre=nombre;
        this.edad= edad;
    }
    //Constructor inicializa nombre
    public persona(String nombre)
    {
      
        
        this.nombre=nombre;    
    }
    
    public int sumar(){
    
        return edad;
    }
    
    
    //Asignar nombre
    public void Setnombre(String nombre){
    
        this.nombre= nombre;
    }
    
    
    //Devolver nombre
    public String getnombre(){
        return nombre;
    
    }
    
    
    
    public int getedad(){
        return edad;
    }
    
    
    public void setedad(int edad){
        this.edad=edad;
    }
    
    public void saludar(){
        System.out.println("Hola mi nombre es: "+nombre);
    }
    
    
    
}
