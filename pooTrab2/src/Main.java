//Aluno: Gabriel Lopes

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = "";
        String tipo = "";
        int dia = 0;
        int mes = 0;
        int ano = 0;
        int diaFim = 0;
        int mesFim = 0;
        int anoFim = 0;
        double valor = 0;
        String pag = "";


        ArrayList<Gastos> gastos = new ArrayList<Gastos>();
        ArrayList<Ganhos> ganhos = new ArrayList<Ganhos>();

        Gastos.addTipoGastos();
        Ganhos.addTipoGanhos();

        boolean loop = true;
        while(loop) {

            System.out.println("Gestão Financeira");
            System.out.println("----------------------------------------");
            System.out.println("1- Adicionar gasto");
            System.out.println("2- Adicionar ganho");
            System.out.println("3- Relatório de gastos");
            System.out.println("4- Relatório de ganhos");
            System.out.println("5- Relatório mensal");
            System.out.println("6- Sair");
            System.out.println("----------------------------------------");
            System.out.println("Selecione uma opção");
            String input = leitor.next();
            int intinput = Integer.parseInt(input);

            while (intinput < 1 || intinput > 6) {
                input = leitor.next();
                intinput = Integer.parseInt(input);
            }

//ADICIONAR GASTOS ---------------------------------------------------
            System.out.println();
            switch (input) {
                case "1" -> {
                    System.out.println("Selecione o nome do gasto");
                    System.out.println("----------------------------------------");
                    input = leitor.next();
                    nome = input;
                    System.out.println();
                    //------------------------------------------------------------

                    System.out.println("Selecione o tipo do gasto");
                    System.out.println("----------------------------------------");
                    System.out.println("1- Habitação");
                    System.out.println("2- Entretenimento");
                    System.out.println("3- Alimentação");
                    System.out.println("4- Transporte");
                    System.out.println("5- Outro");
                    System.out.println("----------------------------------------");
                    input = leitor.next();
                    intinput = Integer.parseInt(input);
                    while (intinput < 1 || intinput > 5) {
                        input = leitor.next();
                        intinput = Integer.parseInt(input);
                    }
                    switch (input) {
                        case "1" -> tipo = "Habitação";
                        case "2" -> tipo = "Entretenimento";
                        case "3" -> tipo = "Alimentação";
                        case "4" -> tipo = "Transporte";
                        case "5" -> tipo = "Outro";
                    }
                    System.out.println();
                    //------------------------------------------------------------

                    System.out.println("Selecione a data do gasto");
                    System.out.println("----------------------------------------");
                    System.out.print("Dia: ");
                    input = leitor.next();
                    dia = Integer.parseInt(input);
                    System.out.print("Mês: ");
                    input = leitor.next();
                    mes = Integer.parseInt(input);
                    System.out.print("Ano: ");
                    input = leitor.next();
                    ano = Integer.parseInt(input);
                    System.out.println();

                    //------------------------------------------------------------

                    System.out.println("Selecione o valor do gasto");
                    System.out.println("----------------------------------------");
                    System.out.print("R$ ");
                    input = leitor.next();
                    valor = Double.parseDouble(input);
                    System.out.println();

                    //------------------------------------------------------------

                    System.out.println("Selecione a forma de pagamento");
                    System.out.println("----------------------------------------");
                    System.out.println("1- Boleto");
                    System.out.println("2- Pix");
                    System.out.println("3- Débito");
                    System.out.println("4- Outro");
                    System.out.println("----------------------------------------");
                    input = leitor.next();
                    intinput = Integer.parseInt(input);
                    while (intinput < 1 || intinput > 4) {
                        input = leitor.next();
                        intinput = Integer.parseInt(input);
                    }
                    switch (input) {
                        case "1" -> pag = "Cheque";
                        case "2" -> pag = "Pix";
                        case "3" -> pag = "Débito";
                        case "4" -> pag = "Outro";
                    }
                    System.out.println();
                    //------------------------------------------------------------
                    gastos.add(new Gastos(nome, tipo, dia, mes, ano, valor, pag));
                    int sizeGas = gastos.size() - 1;
                    System.out.println();
                    System.out.println("Gasto cadastrado:");
                    System.out.println(gastos.get(sizeGas));
                    System.out.println();
                }

//ADICIONAR GANHOS ---------------------------------------------------

                case "2" -> {
                    System.out.println("Selecione o nome do ganho");
                    System.out.println("----------------------------------------");
                    input = leitor.next();
                    nome = input;
                    System.out.println();
                    //------------------------------------------------------------

                    System.out.println("Selecione o tipo do ganho");
                    System.out.println("----------------------------------------");
                    System.out.println("1- Salário");
                    System.out.println("2- Freelancer");
                    System.out.println("3- Dividendos");
                    System.out.println("4- Outro");
                    System.out.println("----------------------------------------");
                    input = leitor.next();
                    intinput = Integer.parseInt(input);
                    while (intinput < 1 || intinput > 4) {
                        input = leitor.next();
                        intinput = Integer.parseInt(input);
                    }
                    tipo = switch (input) {
                        case "1" -> "Salário";
                        case "2" -> "Freelancer";
                        case "3" -> "Dividendos";
                        default -> "Outro";
                    };
                    System.out.println();
                    //------------------------------------------------------------

                    System.out.println("Selecione a data do ganho");
                    System.out.println("----------------------------------------");
                    System.out.print("Dia: ");
                    input = leitor.next();
                    dia = Integer.parseInt(input);
                    System.out.print("Mês: ");
                    input = leitor.next();
                    mes = Integer.parseInt(input);
                    System.out.print("Ano: ");
                    input = leitor.next();
                    ano = Integer.parseInt(input);
                    System.out.println();

                    //------------------------------------------------------------

                    System.out.println("Selecione o valor do ganho");
                    System.out.println("----------------------------------------");
                    System.out.print("R$ ");
                    input = leitor.next();
                    valor = Double.parseDouble(input);

                    //------------------------------------------------------------

                    ganhos.add(new Ganhos(nome, tipo, dia, mes, ano, valor, pag));
                    int sizeGan = ganhos.size() - 1;
                    System.out.println();
                    System.out.println("Ganho cadastrado:");
                    System.out.println(ganhos.get(sizeGan));
                    System.out.println();
                }

//RELATORIO DE GASTOS---------------------------------------------------------

                case "3" -> {
                    System.out.println("Selecione a data de início");
                    System.out.println("----------------------------------------");
                    System.out.print("Dia: ");
                    input = leitor.next();
                    dia = Integer.parseInt(input);
                    System.out.print("Mês: ");
                    input = leitor.next();
                    mes = Integer.parseInt(input);
                    System.out.print("Ano: ");
                    input = leitor.next();
                    ano = Integer.parseInt(input);

                    //------------------------------------------------------------

                    System.out.println();
                    System.out.println("Selecione a data de fim");
                    System.out.println("----------------------------------------");
                    System.out.print("Dia: ");
                    input = leitor.next();
                    diaFim = Integer.parseInt(input);
                    System.out.print("Mês: ");
                    input = leitor.next();
                    mesFim = Integer.parseInt(input);
                    System.out.print("Ano: ");
                    input = leitor.next();
                    anoFim = Integer.parseInt(input);

                    //------------------------------------------------------------

                    System.out.println();
                    Relatorios.geraRelGasto(gastos, dia, mes, ano, diaFim, mesFim, anoFim);
                    System.out.println();
                }

//RELATORIO DE GANHOS----------------------------------------------------------

                case "4" -> {
                    System.out.println("Selecione a data de início");
                    System.out.println("----------------------------------------");
                    System.out.print("Dia: ");
                    input = leitor.next();
                    dia = Integer.parseInt(input);
                    System.out.print("Mês: ");
                    input = leitor.next();
                    mes = Integer.parseInt(input);
                    System.out.print("Ano: ");
                    input = leitor.next();
                    ano = Integer.parseInt(input);

                    //------------------------------------------------------------

                    System.out.println();
                    System.out.println("Selecione a data de fim");
                    System.out.println("----------------------------------------");
                    System.out.print("Dia: ");
                    input = leitor.next();
                    diaFim = Integer.parseInt(input);
                    System.out.print("Mês: ");
                    input = leitor.next();
                    mesFim = Integer.parseInt(input);
                    System.out.print("Ano: ");
                    input = leitor.next();
                    anoFim = Integer.parseInt(input);

                    //------------------------------------------------------------

                    System.out.println();
                    Relatorios.geraRelGanho(ganhos, dia, mes, ano, diaFim, mesFim, anoFim);
                    System.out.println();
                }

//RELATORIO MENSAL-------------------------------------------------------------

                case "5" -> {
                    System.out.println("Selecione o mês e ano");
                    System.out.println("----------------------------------------");
                    System.out.print("Mês: ");
                    input = leitor.next();
                    mes = Integer.parseInt(input);
                    System.out.print("Ano: ");
                    input = leitor.next();
                    ano = Integer.parseInt(input);

                    //------------------------------------------------------------

                    System.out.println();
                    Relatorios.geraRelMes(gastos, ganhos, mes, ano, mesFim, anoFim);
                    System.out.println();
                }
                case "6" -> loop = false;
            }
        }
    }
}
