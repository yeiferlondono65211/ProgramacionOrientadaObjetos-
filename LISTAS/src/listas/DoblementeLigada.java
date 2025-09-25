
package listas;


public class DoblementeLigada {
    private NodoDoble Punta;

    public DoblementeLigada(NodoDoble Punta) {
        this.Punta = Punta;
    }

    public NodoDoble getPunta() {
        return Punta;
    }

    public void setPunta(NodoDoble Punta) {
        this.Punta = Punta;
    }
    
    public void InsertarInicio(int dato){
        NodoDoble x = new NodoDoble(dato);
        
        if(Punta == Null){
            Punta = x;
        }
        else{
            Punta.setLigaI(x);
            x.setLigaD(Punta);
            Punta = x;
        }
    }
    public void InsertarFinal(int dato){
        NodoDoble x = new NodoDoble(dato);
        NodoDoble P = Punta;
        if(Punta == null){
            Punta = x;
        }
    
    }
        
        
        
    }
    
    
    
    
    

