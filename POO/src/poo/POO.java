
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
        persona2.edad= 28;
        persona2.saludar();
        
    }
    
}
