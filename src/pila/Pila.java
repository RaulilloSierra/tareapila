
package pila;

/**
 *
 * @author RaulSierra
 */
import java.util.Stack;//se importa la libreria stack para cosntruir y/o modiciar elementos pila
import java.util.Scanner;
public class Pila {
//Existen varios metodos nativos de la clase Stack
//metodo push, permite introducir un dato en la PILA
    
    /**
     * @param args the command line arguments
     */
    //Metodo peek permite visualizar cual es el ultimo dato de la pila
    //Metodo empty se utiliza para saber si la pila esta vacia.
    public static void main(String[] args) {
        // TODO code application logic here
        Stack Pila = new Stack();
        Scanner leer = new Scanner (System.in);
        String op;
        Pila.push(15);//EStamos insertando el numero 15 en la pila
        /*
        Los estudiantes deben de hacer un ciclo de tal manera que el usuario determine cuantos elementos quiere en la pila
        */
        System.out.println("PROGRAMA PARA INGRESAR ELEMENTOS EN LA PILA");
        do {
        System.out.println("Instrucciones");
        System.out.println("Presione la tecla 'i' para ingresar un nuevo elemento a la pila");
        System.out.println("Presione la tecla 'm' para mostrar el estado de la pila");
        System.out.println("Presione la tecla 'n' para terminar");
        System.out.println("Recuerde que solo puede ingresar palabras a la pila");
        op=leer.nextLine();
        switch (op){
            case "i":
                System.out.println("Ingrese el valor");
                Pila.push(leer.nextLine());
                break;
            case "m":
                System.out.println("La pila va de momento así");
                while (Pila.empty()==false){
                System.out.println(Pila.pop());
                }
                break;
            case "n":
                if (Pila.empty()!=false){
                  System.out.println("Ultimo de la pila es: \n "+Pila.peek());
                  System.out.println("La pila esta compuesta por ");
                  System.out.println("");
                  while (Pila.empty()==false){
                      System.out.println(Pila.pop());
                  }  
                }else{
                    System.out.println("La pila esta vacia");
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                
        }
        }while (!"n".equals(op));
        
        
    }
    
}
