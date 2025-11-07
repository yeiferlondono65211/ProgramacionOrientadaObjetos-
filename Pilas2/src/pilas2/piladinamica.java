
package pilas2;


public class piladinamica {
    private Nodo tope;
    Nodo P = tope;
    public piladinamica(){
        tope = null;
    }
        public Nodo gettope() {
        return tope;
    }

    public void settope(Nodo tope) {
        this.tope = tope;
    }
    
    
    public void Apilar(int dato){
       Nodo x = new Nodo(dato);
       if (tope!=null){
        x.setEnlace(tope);
        
        }
        
        tope = x;   
    }   
        public void Desapilar(){
        
        Nodo P = tope;
        if (tope != null){
            P = P.getEnlace();
            tope=P;
            System.out.println("Dato inicial desapilado\n");
        }else{
            //System.out.println("La lista esta vacía. ");
        
        }}    
    public void MostrarPila(){
    
        Nodo P = tope;
           if (tope==null){
               System.out.println("La pila esta vacía");

           }
           else
           {   System.out.println("La Pila esta tiene los datos:\n");
               while (P != null){
                   System.out.println(P.getDato());
                   P=P.getEnlace();
               }
               

           }
    }
}
