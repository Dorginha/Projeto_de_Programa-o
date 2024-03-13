//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Ingrid", 7 , "1020", 1000);
        System.out.println(c1.recuperarDadosParaImpressao());

        Conta c2 = new Conta("Maria", 2323 , "1015", 100);
        System.out.println(c2.recuperarDadosParaImpressao());

        Conta c3 = new Conta("Mary", 2324 , "1020", 105);
        System.out.println(c3.recuperarDadosParaImpressao());

        int total = Conta.getTotalDecontas();
        System.out.println("Total de contas do banco é: " +total);

        }
    }
