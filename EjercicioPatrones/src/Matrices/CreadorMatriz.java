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
        int[][] nuevaMatriz = new int[numCol][numFila];
        
        if(Math.random()*10 < 6) { // Se crea una que es muy poco probable que sea identidad
            return construirNoIdentidad(numCol, numFila);
        } else { // Se crea una matriz asegurandose que sea identidad
            return construirIdentidad(numCol, numFila);
        }
    }
    
    private Matriz construirIdentidad(int numCol, int numFila) {
        int[][] matriz = new int[numCol][numFila];
        
        for(int col=0; col<numCol; col++) {
            for (int fila=0; fila<numFila; fila++) {
                if(col == fila) {
                    matriz[col][fila] = 1;
                } else {
                    matriz[col][fila] = 0;
                }
            }
        }
        
        return new Matriz(numCol, numFila, matriz);
    }
    
    private Matriz construirNoIdentidad(int numCol, int numFila) {
        int[][] matriz = new int[numCol][numFila];
        
        for(int col=0; col<numCol; col++) {
            for (int fila=0; fila<numFila; fila++) {
                matriz[col][fila] =(int) Math.floor(Math.random()*(1-0+1));
            }
        }
        
        return new Matriz(numCol, numFila, matriz);
    }
}
