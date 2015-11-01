
package d_y_b_sf;

import java.util.ArrayList;

/**
 *
 * @author Sebastián Delgado
 */
public class MatrizAdy extends Grafo{
    private int[][]vertices;
    
    public MatrizAdy(int tamano){
        super(tamano);
        vertices = new int [tamano][tamano];
        
        for (int i = 0; i < tamano; i++){
            for (int j = 0; j < tamano; j++){
                //lo lleno con un peso que nunca voy a usar realmente para comparalo luego
                vertices[i][j] = 99999999;
            }
        }
        
    }

    @Override
    public void agregarArco(int fuente, int destino, int peso) {
        
        //es una matriz simetrica
        vertices[fuente][destino] = peso;
        vertices[destino][fuente] = peso;
    }

    @Override
    public ArrayList<Integer> getSucesores(int vertice) {
        ArrayList<Integer> sucesores = new ArrayList<Integer>();
        
        for(int k = 0; k < tamano; k++){
            //meto a sucesores todos los que esten conectados a el vertice
            if (vertices[vertice][k] != 99999999){
                sucesores.add(k);
            }
                
        }      
        return sucesores;
        
    }

    @Override
    public int getPeso(int fuente, int destino) {
      
        return vertices[fuente][destino];
    }

    @Override
    public boolean conectadoMismo() {
        ArrayList<Integer> seConectanASiMismos = new ArrayList<Integer>();
        
        for(int k = 0; k < tamano; k++){
            //meto a seConectanASiMismos todos los que tienen conecciones a sí mismos
            if (vertices[k][k] != 99999999){
                seConectanASiMismos.add(k);   
            }
                
        }      
        System.out.println(seConectanASiMismos);
        if (seConectanASiMismos.isEmpty()){
            System.out.println("no se autoconectan");
            return false;
        }
        System.out.println("si se autoconectan");
        return true;
        
    }
    
    
    

    
    
}
