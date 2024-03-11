package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Ingrid", 7 , "1020", 1000);
        System.out.println(c1.recuperarDadosParaImpressao());

        Conta c2 = new Conta("Maria", 2323 , "1015", 100);
        System.out.println(c2.recuperarDadosParaImpressao());

        int total = Conta.getTotalDecontas();
        System.out.println("Total de Contas no banco é: " +total);
    }
}