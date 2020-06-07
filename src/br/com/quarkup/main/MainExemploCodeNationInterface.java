package br.com.quarkup.main;

import br.com.quarkup.dao.FuncionarioDAO;
import br.com.quarkup.interfaces.BasicoDAO;
import br.com.quarkup.model.Funcionario;

public class MainExemploCodeNationInterface {
    public static void main(String[] args) {
        //BasicoDAO funcionarioDAO = new FuncionarioDAO();
        
        //funcionarioDAO.calcularSalario(); //O hint da IDE diz que calcular salário não foi definido para o tipo BasicoDAO

        Funcionario funcionario001 = new Funcionario();
        
        //funcionarioDAO.salvar(funcionario001);

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO(); //Aqui é possível chamar todos os método de FuncionarioDAO 
        //BasicoDAO funcionarioDAO = new FuncionarioDAO(); //Aqui só é possível chamar os métodos da interface BasicoDAO
        
        
        //Verifica se a classe criada funcionarioDAO, implementou BasicoDAO.Neste caso também será true, pois funcionarioDAO Implements BascicoDAO 
        if (funcionarioDAO instanceof BasicoDAO) {
            funcionarioDAO.salvar(funcionario001);
            System.out.println("Implementou a Interface BasicoDAO");
        }
        else
            System.err.println("A Classe FuncionarioDAO não implementa BasicoDAO, nenhum procedimento foi realizado");

    }
}
