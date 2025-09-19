
package ListasLigadas;

public class Nodo {
   int Dato;
   Nodo Siguiente;

    public Nodo(int Dato) {
        this.Dato = Dato;
        Siguiente=null;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
   
   
   
   
}
