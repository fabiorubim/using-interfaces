package br.com.quarkup.model.abstracts;

public abstract class Conta {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void imprimeExtrato();//Possuem comportamento diferente, poisso não possuem "corpo"/implementação
    //devendo cada classe filha implementá-lo
    
    //Diferente de uma interface, uma classe abstrata pode possui método completos e funcionais
    //Se quiser forçar que um método seja implementado em uma classe filha, deve-se torná-lo abstrato
}
