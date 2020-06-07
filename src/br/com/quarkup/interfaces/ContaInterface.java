package br.com.quarkup.interfaces;

public interface ContaInterface {
    // Uma interface é 100% abstrata, ou seja, os seus métodos são definidos como abstract,
    // e as variáveis por padrão são sempre constantes (static final).
    double saldo = 0.0;

    public void setSaldo(double saldo);

    public double getSaldo();

}
