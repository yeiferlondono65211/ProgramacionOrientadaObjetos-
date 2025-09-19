
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
            }
        }else{
            x.setEnlace(Punta);    
            }
        
        
        Punta = x;  
        x.setEnlace(Punta);
    
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
        do{
            System.out.println(P.getDato());
            P=P.getEnlace();
        }while(P!=Punta);
    
    
    }
    
}
