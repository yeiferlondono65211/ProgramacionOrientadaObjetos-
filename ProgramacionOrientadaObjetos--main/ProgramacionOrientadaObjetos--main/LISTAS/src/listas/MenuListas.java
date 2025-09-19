
package listas;

import java.util.Scanner;


public class MenuListas {


    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        
        int opc,opcionMenus;
        int dato;
        ListaLigada Lista1 = new ListaLigada();
        ListaSimplementeLigadaCircular Lista2 = new ListaSimplementeLigadaCircular();
        do
        {
            System.out.println("========= Menu Listas =========");
            System.out.println("1. Listas simplemente ligadas");
            System.out.println("2. Listas simplemente ligadas Circular");
            /*System.out.println("3. Listas doblemente ligadas");
            System.out.println("4. Listas doblemente ligadas Circular");*/
            System.out.println("5. Salir.");
            System.out.println("Escriba la opcion ");

            opc = sc.nextInt();
            
            switch (opc){
                case 1://lista simplemente Ligada
                    
                    
                    do
                    {
   
                    System.out.println("Lista Simplemente Ligada");
                    System.out.println("1. Insertar al inicio.");
                    System.out.println("2. Insertar al Final.");
                    System.out.println("3. Insertar medio por valor.");
                    System.out.println("4. borrar al inicio.");
                    System.out.println("5. Botrrar al final.");
                    System.out.println("6. Borrar medio por valor.");
                    System.out.println("7. Mostrar lista.");
                    System.out.println("8. Salir.");
                    System.out.println("Escriba la opcion:\n");
                    
                    opcionMenus = sc.nextInt();
                    
                    switch(opcionMenus){
                        case 1://insertar al inicio
                            
                            System.out.println("Ingrese el valor:");
                            dato = sc.nextInt();
                            Lista1.InsertarInicio(dato);
                            break;
                        case 2://insertar al final
                           
                            System.out.println("Ingrese el valor:");
                            dato = sc.nextInt();
                            Lista1.InsertarFinal(dato);
                            break;
                            
                        case 7://Mostrar
                            Lista1.MostrarDatos();
                            break;
                    }
                    }while(opcionMenus !=8);
                     
                        
            
            
            
                    
                    /*ListaLigada Lista1 = new ListaLigada();
                    Lista1.InsertarInicio(5);
                    Lista1.InsertarFinal(215);
                    Lista1.MostrarDatos();
                    break;*/
                case 2:
                    do
                    {
   
                    System.out.println("Lista Simplemente Ligada");
                    System.out.println("1. Insertar al inicio.");
                    System.out.println("2. Insertar al Final.");
                    System.out.println("3. Insertar medio por valor.");
                    System.out.println("4. borrar al inicio.");
                    System.out.println("5. Botrrar al final.");
                    System.out.println("6. Borrar medio por valor.");
                    System.out.println("7. Mostrar lista.");
                    System.out.println("8. Salir.");
                    System.out.println("Escriba la opcion:\n");
                    
                    opcionMenus = sc.nextInt();
                    
                    switch(opcionMenus){
                        case 1://insertar al inicio
                            
                            System.out.println("Ingrese el valor:");
                            dato = sc.nextInt();
                            Lista2.InsertarInicio(dato);
                            break;
                        case 2://insertar al final
                           
                            System.out.println("Ingrese el valor:");
                            dato = sc.nextInt();
                            Lista2.InsertarFinal(dato);
                            break;
                            
                        case 7://Mostrar
                            Lista2.MostrarDato();
                            break;
                    }
                    }while(opcionMenus !=8);
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
