//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gerente	gerente	=	new	Gerente();

        gerente.setNome("João	da	Silva");
        gerente.setSenha(4231);
        gerente.setSalario(5000);

        System.out.println("Bonus: " + gerente.getBonificacao());
    }
}
