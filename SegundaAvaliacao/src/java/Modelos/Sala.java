/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.List;

/**
 *
 * @author Aluno
 */
public abstract class Sala {
    
    protected int qtdLugares;
    protected double precoBilhete;
    protected int qtdLugaresDisponiveis;
    protected List<Sessoes> sessoes;
    
    public abstract void setPrecoBilhete(double preco);
    public abstract double getPrecoBilhete();
    
    
    
    
    
}
