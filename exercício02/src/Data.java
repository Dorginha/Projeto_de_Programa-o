public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia) {
        if (dia >= 1 &&  dia <=  31){
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String dataFormatada(){
        return dia + "/" + mes + "/" + ano;
    }
}
