
package d_y_b_sf;

import java.util.ArrayList;

/**
 *
 * @author Sebastián Delgafo
 */
public  abstract class Grafo {
    

   protected int tamano;
   
   public Grafo(int vertices) {tamano = vertices;}
   
   public  abstract void agregarArco (int fuente, int destino, int peso);
   
   public abstract ArrayList<Integer> getSucesores (int vertice);
   
   public abstract int getPeso(int fuente, int destino);
   
   public  int size() {return tamano;}
   
   public abstract boolean conectadoMismo ();
}
    

