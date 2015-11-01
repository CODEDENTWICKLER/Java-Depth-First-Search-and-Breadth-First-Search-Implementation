
package d_y_b_sf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Sebastián Delgado
 */
public class Algoritmos {
    
    public static ArrayList<Integer> dfs(Grafo grafo, int origen)
     {
         //creo un stack de enteros vacio
         Stack<Integer> stack = new Stack();
         //creo una lista vacia donde van a estar los visitantes
         ArrayList<Integer> visitados = new ArrayList<Integer>();
         //meto el origen al stack
         stack.push(origen);
         
         //mientras el stack no esté vacío
         while (stack.empty()==false){
            //guardo el valor de el ultimo sacado en una variable
            int ultimoSacado = stack.pop();
            
            //si el ultimo sacado no ha sido visitado
            if (!visitados.contains(ultimoSacado)){
                //pues lo visito 
                visitados.add(ultimoSacado);
                
                for(int i = 0; i < grafo.getSucesores(ultimoSacado).size();i++){
                    
                    //guardo en una variable individualmente cada uno de los sucesores de el ultimo sacado
                    int sucesor = grafo.getSucesores(ultimoSacado).get(i);
                    
                    //si ese sucesor de el ultimo sacado no lo he visitado, lo meto al stack
                    if (!visitados.contains(sucesor)) {
                        stack.push(sucesor);
                    }
                }
            }
         }
         //cuando el stack este vacío, ya ha visitado a todos
         System.out.println(visitados);
         return visitados;
     }
    
    
    public static ArrayList<Integer> bfs(Grafo grafo, int origen){
        
        //creo una cola de enteros vacio
         Queue<Integer> queue = new LinkedList();
         //creo una lista vacia donde van a estar los visitantes
         ArrayList<Integer> visitados = new ArrayList<Integer>();
         //meto el origen a la cola
         queue.add(origen);
         
         //mientras la cola no esté vacío
         while (queue.isEmpty() == false){
            //guardo el valor de el ultimo sacado en una variable
            int ultimoSacado = queue.remove();
            
            //si el ultimo sacado no ha sido visitado
            if (!visitados.contains(ultimoSacado)){
                //pues lo visito 
                visitados.add(ultimoSacado);
                
                for(int i = 0; i < grafo.getSucesores(ultimoSacado).size();i++){
                    
                    //guardo en una variable individualmente cada uno de los sucesores de el ultimo sacado
                    int sucesor = grafo.getSucesores(ultimoSacado).get(i);
                    
                    //si ese sucesor de el ultimo sacado no lo he visitado, lo meto a la cola
                    if (!visitados.contains(sucesor)) {
                        queue.add(sucesor);
                    }
                }
            }
         }
         //cuando la cola esté vacío, ya ha visitado a todos
         System.out.println(visitados);
         return visitados;
         
         
        
        
    }

   
}
