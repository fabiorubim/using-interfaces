package br.com.quarkup.model.abstracts;

import br.com.quarkup.interfaces.ContaInterface;

public abstract class ContaAbstract implements ContaInterface {
    // Por ser uma classe abstrata, não é necessário implementar a Interface
    public abstract void depositar(double valor);

    public abstract void sacar(double valor);
}
