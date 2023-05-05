import java.util.ArrayList;

public class Ganhos {
    private String nome;
    private String tipo;
    private int dia;
    private int mes;
    private int ano;
    private double valor;

    private static ArrayList<String> tipoGanhos = new ArrayList<String>();
    //private static String tp1 = "Salario";
    //private static String tp2 = "Freelancer";
    //private static String tp3 = "Dividendos";
    //private static String tp4 = "Outro";

    public Ganhos (String nome, String tipo, int dia, int mes, int ano, double valor, String pagamento){
        this.nome = nome;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
    }

    public String toString() {
        return
                "nome: '" + nome + '\'' +
                        ", tipo: '" + tipo + '\'' +
                        ", dia: " + dia +
                        ", mes: " + mes +
                        ", ano: " + ano +
                        ", R$ " + valor + '\'';
    }

    public static void addTipoGanhos() {
        tipoGanhos.add("Salário");
        tipoGanhos.add("Freelancer");
        tipoGanhos.add("Dividendos");
        tipoGanhos.add("Outro");
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

    public static ArrayList<String> getTipoGanhos() {
        return tipoGanhos;
    }

    public static void setTipoGanhos(ArrayList<String> tipoGanhos) {
        Ganhos.tipoGanhos = tipoGanhos;
    }
}
