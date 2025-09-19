
package poo;


public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona persona1= new persona("Yeifer",26);
        persona1.saludar();
        
        persona persona2= new persona("Juan");
        persona2.setedad(30);
        persona2.saludar();
        
        
        Estudiante estudiante1= new Estudiante("Pedro",20,1);
        estudiante1.saludar();
        estudiante1.mostrardatos();
        
        Animal animal1=new Animal();
        Perro perro1=new Perro();
        Gato gato1= new Gato();
        
        animal1.Hablar();
        perro1.Hablar();
        gato1.Hablar();
    }
    
}
