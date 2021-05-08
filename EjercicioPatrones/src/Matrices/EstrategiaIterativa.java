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
public class EstrategiaIterativa implements EstrategiaEvaluador{

    public EstrategiaIterativa() {}
    
    @Override
    public boolean evaluarIdentidad(Matriz matriz) {
        if (matriz.getColumnas() != matriz.getFilas())
            return false;
        else {
            
            for (int columna=0; columna<matriz.getColumnas(); columna++){
                for (int fila=0; fila<matriz.getFilas(); fila++) {
                    if (columna == fila) {
                        if (matriz.getMatriz()[columna][fila] != 1)
                            return false;
                    }
                    
                    else {
                        if (matriz.getMatriz()[columna][fila] != 0)
                            return false;
                    }
                }
            }
            
            return true;
        }
    }
    
}
