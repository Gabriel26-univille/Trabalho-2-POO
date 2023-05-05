import java.util.ArrayList;

public class Gastos {
    private String nome;
    private String tipo;
    private int dia;
    private int mes;
    private int ano;
    private double valor;
    private String pagamento;
    private static ArrayList<String> tipoGastos = new ArrayList<String>();
    public Gastos (String nome, String tipo, int dia, int mes, int ano, double valor, String pagamento){
        this.nome = nome;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public String toString() {
        return
                "nome: '" + nome + '\'' +
                ", tipo: '" + tipo + '\'' +
                ", dia: " + dia +
                ", mes: " + mes +
                ", ano: " + ano +
                ", R$ " + valor +
                ", pagamento: = '" + pagamento + '\'';
    }

    public static void addTipoGastos() {
        tipoGastos.add("Habitação");
        tipoGastos.add("Entretenimento");
        tipoGastos.add("Alimentação");
        tipoGastos.add("Transporte");
        tipoGastos.add("Outro");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public static ArrayList<String> getTipoGastos() {
        return tipoGastos;
    }

    public static void setTipoGastos(ArrayList<String> tipoGastos) {
        Gastos.tipoGastos = tipoGastos;
    }
}
