import java.util.ArrayList;
public class Relatorios {

    public static void geraRelGasto(ArrayList<Gastos> gastos, int dia, int mes, int ano, int diaFim, int mesFim, int anoFim){
        int somaValor = 0;

        ArrayList<String> relGastos = Gastos.getTipoGastos();

        for (String relGasto : relGastos) {
            for (Gastos gasto : gastos) {
                if ((gasto.getTipo()).equals(relGasto)) {
                    if (ano <= gasto.getAno() && anoFim >= gasto.getAno()) {
                        if (mes <= gasto.getMes() && mesFim >= gasto.getMes()) {
                            if (dia <= gasto.getDia() && diaFim >= gasto.getDia()) {
                                System.out.println(gasto);
                                somaValor += gasto.getValor();
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Gastos totais: R$" + somaValor);
    }

    public static void geraRelGanho(ArrayList<Ganhos> ganhos, int dia, int mes, int ano, int diaFim, int mesFim, int anoFim){
        int somaValor = 0;

        ArrayList<String> relGanhos = Ganhos.getTipoGanhos();

        for (String relGanho : relGanhos) {
            for (Ganhos ganho : ganhos) {
                if ((ganho.getTipo()).equals(relGanho)) {
                    if (ano <= ganho.getAno() && anoFim >= ganho.getAno()) {
                        if (mes <= ganho.getMes() && mesFim >= ganho.getMes()) {
                            if (dia <= ganho.getDia() && diaFim >= ganho.getDia()) {
                                System.out.println(ganho);
                                somaValor += ganho.getValor();
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Ganhos totais: R$" + somaValor);
    }

    public static void geraRelMes(ArrayList<Gastos> gastos, ArrayList<Ganhos> ganhos, int mes, int ano, int mesFim, int anoFim){
        int somaValor = 0;

        ArrayList<String> relGastos = Gastos.getTipoGastos();
        ArrayList<String> relGanhos = Ganhos.getTipoGanhos();

        System.out.println("Gastos:");
        for (String relGasto : relGastos) {
            for (Gastos gasto : gastos) {
                if ((gasto.getTipo()).equals(relGasto)) {
                    if (ano == gasto.getAno()) {
                        if (mes == gasto.getMes()) {

                            System.out.println(gasto);
                            somaValor -= gasto.getValor();
                        }
                    }
                }
            }
        }
        System.out.println();

        System.out.println("Ganhos:");
        for (String relGanho : relGanhos) {
            for (Ganhos ganho : ganhos) {
                if ((ganho.getTipo()).equals(relGanho)) {
                    if (ano == ganho.getAno()) {
                        if (mes == ganho.getMes()) {

                            System.out.println(ganho);
                            somaValor += ganho.getValor();

                        }
                    }
                }
            }
        }
        System.out.println("Valor total: R$" + somaValor);
    }
}


