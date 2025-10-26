
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
           {   System.out.println("La lista esta tiene los datos:\n");
               while (P != null){
                   System.out.println(P.getDato());
                   P=P.getEnlace();
               }
               

           }
    }
    
    public void BorrarInicio(){
        
        Nodo P = Punta;
        if (Punta != null){
            P = P.getEnlace();
            Punta=P;
            System.out.println("Dato inicial borrado\n");
        }else{
            //System.out.println("La lista esta vacía. ");
        
        }    
            
            
    }
    
    
    public void BorrarFinal(){
        Nodo P = Punta;
        
        if (Punta==null){
            System.out.println("La lista esta vacía.");
        
        }
        else
        {   Nodo Q = Punta;
            P = P.getEnlace();
            while (P.getEnlace() != null){
                
                Q = P;
                P=P.getEnlace();
                
            }
            Q.setEnlace(null);
            System.out.println("Dato final borrado\n");
     
        }
    
    
    }
    
    
        public void BorrarXValor(int dato){
        
        Nodo P = Punta;
        
        if (Punta==null){
            System.out.println("La lista esta vacía.");
        
        }
        else
        {   Nodo Q = Punta;
            P = P.getEnlace();
            while (P.getEnlace() != null){
                if (P.getDato() == dato){
                    Q.setEnlace(P.getEnlace());
                    System.out.println("Dato borrado de la lista\n");
                }                
                Q = P;
                P= P.getEnlace();
                
            }
        System.out.println("El dato no se encontró en la lista.");    
            
     
        }
    
    
    }
    
        
        public void InsertarpostValor(int dato,int dato1){
       
        Nodo x = new Nodo(dato);
        Nodo z = new Nodo(dato1);
        Nodo P = Punta;
        
        if (Punta==null){
            System.out.println("La lista esta vacía.");
        
        }
        else
        {   Nodo Q = Punta;
            P = P.getEnlace();
            while (P.getEnlace() != null){
                if (Q.getDato() == x.getDato()){
                    
                    Q.setEnlace(z);
                    z.setEnlace(P);
                    System.out.println("Dato Ingresado en la lista\n");
                    
                }                
                Q = P;
                P= P.getEnlace();
                
            }
            //System.out.println("El dato no se encontró en la lista.");    
            
     
        }
    
    
    }
    
    
    }
    

