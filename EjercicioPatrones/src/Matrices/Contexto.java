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
public class Contexto {
    private EstrategiaEvaluador estrategia;

    public Contexto(EstrategiaEvaluador estrategia) {
        this.estrategia = estrategia;
    }
    
    public boolean evaluar(Matriz matriz) {
        return estrategia.evaluarIdentidad(matriz);
    }

    public void setEstrategia(EstrategiaEvaluador estrategia) {
        this.estrategia = estrategia;
    }

    public EstrategiaEvaluador getEstrategia() {
        return estrategia;
    }
}
