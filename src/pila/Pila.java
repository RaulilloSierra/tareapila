
package pila;

import java.util.Stack;//se importa la libreria stack para cosntruir y/o modiciar elementos pila
import javax.swing.JOptionPane;

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
            try {
                String Mensaje = JOptionPane.showInputDialog("\n Eliga la opcion: \n 1. Ingresar elemento en la pila (push) "+
                        "\n 2. Mostrar el contenido de la pila \n"+
                        "3. Digite 0 para salir");
                w=Integer.parseInt(Mensaje);//Capturador de la opcion a elegir
                switch (w){//captura la opcion a elegir
                    case 1://se designa las opciones para la opcion 1
                        Pila.push(JOptionPane.showInputDialog("Ingrese Valor unicamente alfabetico"));//Aqui se ingresan los valores en la pila
                        break;
                    case 2://se designa las opciones para la opcion 2
                        JOptionPane.showMessageDialog(null, "La pila va asi");//el enunciado
                        while (Pila.empty()==false){//a traves de un while se genera la vista de las opciones
                        JOptionPane.showMessageDialog(null, Pila.pop());
        }
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Incorrecto");// en caso de elegir la opcion incorrecta
            }
            
        }
        
        /*
        Los estudiantes deben de hacer un ciclo de tal manera que el usuario determine cuantos elementos quiere en la pila
        */
        
        
          
        
    }
}