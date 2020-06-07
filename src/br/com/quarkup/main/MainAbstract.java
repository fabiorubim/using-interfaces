package br.com.quarkup.main;

import br.com.quarkup.model.ContaPoupanca;
import br.com.quarkup.model.abstracts.Conta;

public class MainAbstract {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }
}
