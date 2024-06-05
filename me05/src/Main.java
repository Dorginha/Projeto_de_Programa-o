
public class Main {
    public static void main(String[] args) {
        Porco porco = new Porco();
        porco.fazerSom();
        porco.setCor("Rosa");
        porco.setPeso(20.2);
        porco.setNome("Pascal");
        porco.levarVeterinario();
        System.out.println(porco.cor);
        System.out.println(porco.peso);

    }
}