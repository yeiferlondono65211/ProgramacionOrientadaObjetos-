
package pilas2;

import java.util.Scanner;


public class Pilas2 {

   
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int opcpilas,opcdinamica;
        int dato;
        piladinamica pila1= new piladinamica();
        
        do
        {
            System.out.println("========= Menu Pilas =========");
            System.out.println("1. Pilas estaticas            ");
            System.out.println("2. Pilas Dinamicas            ");
            /*System.out.println("3. Listas doblemente ligadas  ");
            /*System.out.println("4. Listas doblemente ligadas Circular");*/
            System.out.println("3. Salir.                     ");
            System.out.println("Escriba la opcion:");

            opcpilas = sc.nextInt();
        switch(opcpilas){
            case 2: 
                do {
                    System.out.println("========= Menu Pilas =========");
                    System.out.println("1. Apilar Valor               ");
                    System.out.println("2. Desapilar                  ");
                    System.out.println("3. Mostrar pila               ");
                    System.out.println("4. Salir.                     ");
                    System.out.println("Escriba la opcion:");
                    
                opcdinamica =  sc.nextInt();
                switch (opcdinamica){
                    case 1:
                        System.out.println("Ingrese el valor:");
                        dato = sc.nextInt();
                        pila1.Apilar(dato);
                        break;
                    case 2:
                        pila1.Desapilar();
                        break;
                    case 3://Mostrar
                        pila1.MostrarPila();
                        break;
                    case 4:     
                        break;
                }
                }while(opcpilas !=4);{}
                    break;
                }
        }while(opcpilas != 3);
    }
    
}
