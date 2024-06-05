
public class Porco extends Animal implements Pesado, Colorido, Nome{
    double peso;
    String cor;
    String nome;

    @Override
    public void fazerSom() {
        System.out.println("OINC!");
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void levarVeterinario() {
        String message = "O animal %s foi levado ao veterinário";
        System.out.println(String.format(message, this.nome));
    }

    @Override
    public void levarAbate() {
        System.out.println("O animal foi levado ao abate");
    }
}
