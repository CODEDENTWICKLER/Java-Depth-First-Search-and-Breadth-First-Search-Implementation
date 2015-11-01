/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d_y_b_sf;

import java.util.ArrayList;

/**
 *
 * @author Sebastián Delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo g = new MatrizAdy(8);
        
        g.agregarArco(0,1,4);
        g.agregarArco(0,3,8);
        g.agregarArco(0,6,9);
       
        g.agregarArco(1,4,8);
        g.agregarArco(1,5,2);
        g.agregarArco(2,5,1);
        g.agregarArco(2,7,7);
        
        g.agregarArco(3,5,5);
        
        g.agregarArco(4,6,2);
        
        
        
        
        
        g.conectadoMismo();
        Algoritmos.dfs(g,0);
        Algoritmos.bfs(g,0);
        
        
    }
    
}
