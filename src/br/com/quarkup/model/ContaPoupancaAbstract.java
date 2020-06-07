package br.com.quarkup.model;

import br.com.quarkup.model.abstracts.ContaAbstract;

public class ContaPoupancaAbstract extends ContaAbstract{
    private double saldo;
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;        
    }
 
    @Override
    public double getSaldo() {
        return this.saldo;
    }
 
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
         
    }

    @Override
    public void setSaldo(double saldo) {
        // TODO Auto-generated method stub
        
    }
}
