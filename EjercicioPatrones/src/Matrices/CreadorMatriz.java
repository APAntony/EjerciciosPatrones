/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

/**
 *
 * @author Antony Artavia
 */
public class CreadorMatriz {
    private static CreadorMatriz creadorMatriz;
    
    private CreadorMatriz(){
        
    }
    
    public static CreadorMatriz getInstance(){
        if (creadorMatriz == null){
            creadorMatriz = new CreadorMatriz();
        }
        
        return creadorMatriz;
    }
    
    public Matriz construirMatriz(int numCol, int numFila) {
        return new Matriz(numCol, numFila);
    }
}
