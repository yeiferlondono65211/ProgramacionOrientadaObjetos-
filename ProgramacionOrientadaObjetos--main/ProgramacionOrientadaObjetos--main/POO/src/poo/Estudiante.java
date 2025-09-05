/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author sala306
 */
public class Estudiante extends persona{
    int codigoEstudiante;
    
    public Estudiante(String nombre, int edad, int codigoEstudiante){
        super(nombre,edad);
        this.codigoEstudiante=codigoEstudiante;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
    public void mostrardatos(){
            System.out.println("Hola mi nombre es: "+ getnombre()+"\nMi edad es: "+edad+"\nMi codigo de estudiante es: "+codigoEstudiante);
    
    }
    
}
