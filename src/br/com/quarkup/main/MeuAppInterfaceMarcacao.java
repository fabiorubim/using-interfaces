package br.com.quarkup.main;

import br.com.quarkup.interfaces.FuncionarioInterfaceMarcacao;
import br.com.quarkup.model.Coordenador;
import br.com.quarkup.model.Gerente;
import br.com.quarkup.model.Operador;

public class MeuAppInterfaceMarcacao {
    public static void main(String[] args) {
        FuncionarioInterfaceMarcacao funcionario = new Gerente();
        
        if (funcionario instanceof Gerente) {
            // calculo para gerente
        } else if (funcionario instanceof Coordenador) {
            // calculo para coordenador
        } else if (funcionario instanceof Operador) {
            // calculo para operador
        }
        
        //Melho do que fazer
        // public void calcularSalarioParaGerente(Gerente gerente){
        //
        // }
        //
        // public void calcularSalarioParaCoordenador(Coordenador coordenador){
        //
        // }
        //
        // public void calcularSalarioParaOperador(Operador operador){
        //
        // }
    }
}
