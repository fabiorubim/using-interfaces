package br.com.quarkup.main;

import br.com.quarkup.model.ContaCorrenteAbstract;
import br.com.quarkup.model.ContaPoupanca;
import br.com.quarkup.model.ContaPoupancaAbstract;

public class MainTestaContas {
    public static void main(String[] args) {

        ContaCorrenteAbstract cc = new ContaCorrenteAbstract();
        cc.depositar(1200.20);
        cc.sacar(300);

        ContaPoupancaAbstract cp = new ContaPoupancaAbstract();
        cp.depositar(500.50);
        cp.sacar(25);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }
}
