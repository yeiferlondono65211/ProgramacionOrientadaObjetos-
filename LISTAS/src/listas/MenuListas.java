
package listas;

import java.util.Scanner;


public class MenuListas {


    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        
        int opc;
        
        
        do
        {
            System.out.println("========= Menu Listas =========");
            System.out.println("1. Listas simplemente ligadas");
           /* System.out.println("2. Listas simplemente ligadas Circular");
            System.out.println("3. Listas doblemente ligadas");
            System.out.println("4. Listas doblemente ligadas Circular");*/
            System.out.println("5. Salir.");
            System.out.println("Escriba la opcion ");

            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Opcion 1");
                    ListaLigada Lista1 = new ListaLigada();
                    Lista1.InsertarInicio(5);
                    Lista1.InsertarFinal(215);
                    Lista1.MostrarDatos();
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;



                default:
                    System.out.println("Opcion por defecto");
                    break;
            }    
                
                   
        }while(opc != 5);
    
    }
    
}
