
package pila;

import java.util.Stack;//se importa la libreria stack para cosntruir y/o modiciar elementos pila

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
        int w = -1;
        
        Stack Pila = new Stack();
        while(w != 0){
            
        }
        Pila.push(15);//EStamos insertando el numero 15 en la pila
        /*
        Los estudiantes deben de hacer un ciclo de tal manera que el usuario determine cuantos elementos quiere en la pila
        */
        Pila.push("p");
        System.out.println("Ultimo de la pila es: \n "+Pila.peek());
        System.out.println("La pila esta compuesta por ");
        System.out.println("");
        while (Pila.empty()==false){
            System.out.println(Pila.pop());
        }   
        
    }
}