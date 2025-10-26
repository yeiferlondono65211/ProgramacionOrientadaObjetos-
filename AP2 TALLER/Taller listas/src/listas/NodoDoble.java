
package listas;


public class NodoDoble {
    private int dato;
    private NodoDoble LigaI;
    private NodoDoble LigaD;

    public NodoDoble(int dato) {
        this.dato = dato;
        LigaI = null;
        LigaD = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoDoble getLigaI() {
        return LigaI;
    }

    public void setLigaI(NodoDoble LigaI) {
        this.LigaI = LigaI;
    }

    public NodoDoble getLigaD() {
        return LigaD;
    }

    public void setLigaD(NodoDoble LigaD) {
        this.LigaD = LigaD;
    }
    
    
}
