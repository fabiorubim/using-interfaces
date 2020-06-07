package br.com.quarkup.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.quarkup.model.abstracts.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimeExtrato() {
        System.out.println("### Extrato da Conta ###");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + sdf.format(date));
    }

}
