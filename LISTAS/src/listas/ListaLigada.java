
package listas;

public class ListaLigada {
    private Nodo Punta;
    Nodo P = Punta;
    public ListaLigada() {
        Punta = null;
    }

    public Nodo getPunta() {
        return Punta;
    }

    public void setPunta(Nodo Punta) {
        this.Punta = Punta;
    }

    public void InsertarInicio(int dato){
        Nodo x = new Nodo(dato);
        if (Punta!=null){
           x.setEnlace(Punta);
        
        }
        
        Punta = x;   
    }
    
    public void InsertarFinal(int dato){
        Nodo x = new Nodo(dato);
        
        Nodo P = Punta;
        if (Punta==null){
           Punta = x;
        
        }
        else
        {   
            while (P.getEnlace() != null){
                P=P.getEnlace();
            }
            P.setEnlace(x);
     
        }
        
            
    }
    
    public void MostrarDatos(){
    
        Nodo P = Punta;
           if (Punta==null){
               System.out.println("La lista esta vacía");

           }
           else
           {   
               while (P != null){
                   System.out.println(P.getDato());
                   P=P.getEnlace();
               }
               

           }
    }
    
    public void BorrarInicio(){
        if (Punta != null){
            while (P != null){
                   System.out.println(P.getDato());
                   P=P.getEnlace();
               }
        
        }
    
    
    }
    
}
