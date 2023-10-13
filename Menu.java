import java.util.Scanner;

public class Menu {

    //Using pseudocode to use ANSI colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";


    public static void menu() {
        System.out.println("\n\n" + ANSI_YELLOW + "#########################################");
        System.out.println("|--Sistema de Transporte da Amarelinha--|");
        System.out.println("#########################################");
        System.out.println("|--1. Consultar Trechos e Modalidades---|");
        System.out.println("|--2. Cadastrar Transporte--------------|");
        System.out.println("|--3. Dados Estatísticos----------------|");
        System.out.println("|--4. Finalizar o Programa--------------|");
        System.out.println("#########################################");
        System.out.println("Digite a opção desejada:" + ANSI_RESET);
    }

    public static void CheckRoutesAndModalities(){
        String toReturn = "x";
        Scanner scan = new Scanner(System.in);

        do {

            //Insert here the first case method


            System.out.println(ANSI_RED + "\n\nPara retornar ao menu, aperte 'ENTER'" + ANSI_RESET);
            toReturn = scan.nextLine();
        } while (!toReturn.isEmpty());
    }

    public static void RegisterTransport(){
        String toReturn = "x";
        Scanner scan = new Scanner(System.in);

        do {

            //Insert here the second case method


            System.out.println(ANSI_RED + "\n\nPara retornar ao menu, aperte 'ENTER'" + ANSI_RESET);
            toReturn = scan.nextLine();
        } while (!toReturn.isEmpty());
    }

    public static void CheckAnalytics(){
        String toReturn = "x";
        Scanner scan = new Scanner(System.in);

        do {

            //Insert here the third case method


            System.out.println(ANSI_RED + "\n\nPara retornar ao menu, aperte 'ENTER'" + ANSI_RESET);
            toReturn = scan.nextLine();
        } while (!toReturn.isEmpty());
    }


    //Main class of menu
    public static void main(String[] args) {
        int option;
        Scanner scan = new Scanner(System.in);

        do {
            menu();
            option = scan.nextInt();

            switch (option){
                case 1 :
                    CheckRoutesAndModalities();
                    break;

                case 2 :
                    RegisterTransport();
                    break;

                case 3 :
                    CheckAnalytics();
                    break;

                case 4 :
                    System.out.println(ANSI_RED + "Encerrando..." + ANSI_RESET);
                    break;

                default :
                    System.out.println(ANSI_RED + "Opção inválida! Digite de 1 a 3 para as opções ou 4 para sair" + ANSI_RESET);
            }
        } while (option != 4);
    }
}
