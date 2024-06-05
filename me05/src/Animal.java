
public abstract class Animal extends Carro{
    public void fazerSom(){
        System.out.println("Faz som");
    }
    public void andar(){
        System.out.println("Animal andou");
    }

    @Override
    public void levarAbate() {
        System.out.println();
    }

    @Override
    public void levarVeterinario() {
        System.out.println();
    }
}
