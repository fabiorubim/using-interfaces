package br.com.quarkup.model;

import br.com.quarkup.model.abstracts.ContaAbstract;

public class ContaCorrenteAbstract extends ContaAbstract{
    private double saldo;
    private double taxaOperacao = 0.45;
     
    @Override
    public double getSaldo() {
        return this.saldo;
    }
 
    @Override
    public void sacar(double valor) {
        this.saldo -= valor + taxaOperacao;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaOperacao;
        
    }
    
    
}
