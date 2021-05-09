/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

/**
 *
 * @author liugu
 */
public class EstrategiaParalela implements EstrategiaEvaluador{

    @Override
    public boolean evaluarIdentidad(Matriz matriz) {
        for (int fila=0;fila<matriz.getFilas();fila++){
            for(int columna=fila;columna<matriz.getColumnas();columna++){
                int elemento1 = matriz.getMatriz()[fila][columna];
                int elemento2 = matriz.getMatriz()[columna][fila];
                if (elemento1 != elemento2){
                    return false;
                }
                if (fila==columna){
                    if(elemento1 != 1){
                        return false;
                    }
                } else{
                    if (elemento1 != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
}
