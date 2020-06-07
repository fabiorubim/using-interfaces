package br.com.quarkup.main;

import br.com.quarkup.model.abstracts.ContaAbstract;

public class GeradorExtratos {
    public void geradorConta(ContaAbstract conta){
        System.out.println("Saldo Atual: "+conta.getSaldo());
    }
}
