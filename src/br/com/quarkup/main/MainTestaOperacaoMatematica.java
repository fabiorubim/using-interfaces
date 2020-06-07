package br.com.quarkup.main;

import br.com.quarkup.model.Multiplicacao;
import br.com.quarkup.model.OperacaoMatematica;
import br.com.quarkup.model.Soma;

public class MainTestaOperacaoMatematica {
    // EXECUTA A OPERACAO - COM POLIMORFISMO
    public static void calculaOperacao(OperacaoMatematica o, double x, double y) {
        System.out.println(o.calcular(x, y));
    }

    public static void main(String[] args) {
        calculaOperacao(new Soma(), 2500, 200);
        calculaOperacao(new Multiplicacao(), 10, 10);
    }
}
