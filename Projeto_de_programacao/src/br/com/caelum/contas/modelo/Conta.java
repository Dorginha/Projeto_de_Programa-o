package br.com.caelum.contas.modelo;

public class Conta {
    public String	nome;
    public int	numero;
    public String agencia;
    public double	saldo;
    public Data data;
    public int identificador;
    public static int proximoIdentificador = 1;
    public static int totalDecontas;



    public Conta(String nome, int numero, String agencia, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.identificador = proximoIdentificador ++ ;
        Conta.totalDecontas = Conta.totalDecontas + 1;
    }

    public Conta( int numero, String agencia, double saldo){
        this.nome = "Não informado";
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.identificador = proximoIdentificador ++ ;
        Conta.totalDecontas = Conta.totalDecontas + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public double calcularRendimento(){
        return saldo * 0.1;
    }

    public static int getTotalDecontas(){
        return Conta.totalDecontas;
    }
    public String recuperarDadosParaImpressao(){
        return "Nome " + nome +
                "\n" + "Numero " + numero +
                "\n" + "Agencia " + agencia +
                "\n" + "Saldo " + saldo +
                "\n" + "identificador " + identificador + "\n";
    }
}

