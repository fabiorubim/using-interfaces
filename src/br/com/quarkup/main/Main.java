package br.com.quarkup.main;

import br.com.quarkup.interfaces.FiguraGeometrica;
import br.com.quarkup.model.Quadrado;

public class Main {
    public static void main(String[] args) {
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica() ;
        
        //FiguraGeometrica quadrado = new Quadrado(); //Assim o setLado() e o getLado() serão ignorados pois não existem na Interface
        Quadrado quadrado = new Quadrado();
               
        System.out.println("Nome: " + quadrado.getNomeFigura());
        quadrado.setLado(20);
        System.out.println("Lado: " + quadrado.getLado());
    }
}
