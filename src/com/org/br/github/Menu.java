import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    //Using pseudocode to use ANSI colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";


    public void menu() {

        boolean loop = true;
        String option = "";

        System.out.println("\nSeja bem vindo(a) a Amarelinha! A empresa com transporte mais rápido do planeta.");

        do {

            System.out.println("\n\n" + ANSI_YELLOW + "#########################################");
            System.out.println("|--Sistema de Transporte da Amarelinha--|");
            System.out.println("#########################################");
            System.out.println("|--1. Consultar Trechos e Modalidades---|");
            System.out.println("|--2. Cadastrar Transporte--------------|");
            System.out.println("|--3. Dados Estatísticos----------------|");
            System.out.println("|--4. Finalizar o Programa--------------|");
            System.out.println("#########################################");
            System.out.print("Digite a opção desejada: " + ANSI_RESET);


            if (option.equalsIgnoreCase("sair")) {
                System.out.println(ANSI_RED + "Programa encerrado!" + ANSI_RESET);
                loop = false;
            }

            option = scanner.nextLine();

            switch (option) {
                case "1" -> CheckRoutesAndModalities();
                case "2" -> RegisterTransport();
                case "3" -> CheckAnalytics();
                case "4" -> {
                    System.out.println(ANSI_RED + "Programa encerrado!" + ANSI_RESET);
                    loop = false;
                }
                default ->
                        System.out.println(ANSI_RED + "Opção inválida! Digite de 1 a 3 para as opções ou 4 para sair" + ANSI_RESET);
            }

            if (loop) {
                System.out.print("Digite 'sair' para encerrar o programa: ");
            }


        } while (loop);

    }

    public void CheckRoutesAndModalities() {
        String toReturn;

        do {

            CheckRoutes.checkRoutes();

            System.out.println(ANSI_RED + "\n\nPara retornar ao menu, aperte 'ENTER'" + ANSI_RESET);
            toReturn = scanner.nextLine();
        } while (!toReturn.isEmpty());
    }

    public void RegisterTransport() {

        String toReturn;


        do {

              RegisterTransport.transportRegister();

            System.out.println(ANSI_RED + "\n\nPara retornar ao menu, aperte 'ENTER'" + ANSI_RESET);
            toReturn = scanner.nextLine();
        } while (!toReturn.isEmpty());
    }

    public void CheckAnalytics() {
        String toReturn;
        Scanner scanner = new Scanner(System.in);

        do {

            //Insert here the third case method


            System.out.println(ANSI_RED + "\n\nPara retornar ao menu, aperte 'ENTER'" + ANSI_RESET);
            toReturn = scanner.nextLine();
        } while (!toReturn.isEmpty());
    }


}
