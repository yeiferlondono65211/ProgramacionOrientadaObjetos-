
package listas;



public class ListaSimplementeLigadaCircular {
    private Nodo Punta;
    Nodo P = Punta;    
    public ListaSimplementeLigadaCircular() {
        this.Punta = null;
    }

    public Nodo getPunta() {
        return Punta;
    }

    public void setPunta(Nodo Punta) {
        this.Punta = Punta;
    }
    
    public void InsertarInicio(int dato){
        Nodo x = new Nodo(dato);
        Nodo P = Punta;
        if (Punta!=null){
          
            do{
               P=P.getEnlace();

            }while(P.getEnlace() != Punta);{
                P.setEnlace(x);
                x.setEnlace(Punta);
                Punta = x;
            }
        }else{
            Punta = x;
            x.setEnlace(Punta);    
             
            }
        
        
        
    
    }
    public void InsertarFinal(int dato){
        Nodo x = new Nodo(dato);        
        Nodo P = Punta;
        if (Punta==null){
            Punta = x;
            x.setEnlace(Punta);
            
        }
        else
        {   
            do {
                P=P.getEnlace();
            }
            while (P.getEnlace() != Punta);{
               P.setEnlace(x);
               x.setEnlace(Punta);
                
            }
            
     
        }
    
    }
    
    public void MostrarDato(){
        Nodo P = Punta;
        if (Punta == null) {
        
        return;
        }
        
        do{
            System.out.println(P.getDato());
            P=P.getEnlace();
        }while(P!=Punta);
    
    
    }
    
    
    public void BorrarInicio(){
        Nodo P = Punta;
        Nodo Q = Punta;
        if (Punta==null){
            System.out.println("La lista esta vacía.");
            }
        if (Punta.getEnlace() == Punta) {
            Punta = null;
            System.out.println("Ahora la lista esta vacía.\n");
            return;
        }    
                
            
            while(P.getEnlace()!= Punta){
                P = P.getEnlace();
            }
            
            P.setEnlace(Q.getEnlace());
            Punta = Q.getEnlace();
            
            
        }
    
    
    
    public void BorrarFinal(){
        Nodo P = Punta;
        Nodo Q = Punta;
        if (Punta==null){
            System.out.println("La lista esta vacía.");
            }
        if (Punta.getEnlace() == Punta) {
            Punta = null;
            System.out.println("Ahora la lista esta vacía.\n");
            return;
        }    
             
            
            while(P.getEnlace()!= Punta){
                Q = P;
                P = P.getEnlace();
            }
            
            Q.setEnlace(Punta);
            
            
            
        }
        
        
        
        
       
    }
    

