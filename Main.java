import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner scan = new Scanner(System.in);

        do {
            Menu.menu();
            option = scan.nextInt();

            switch (option){
                case 1 :
                    Menu.CheckRoutesAndModalities();
                    break;

                case 2 :
                    Menu.RegisterTransport();
                    break;

                case 3 :
                    Menu.CheckAnalytics();
                    break;

                case 4 :
                    System.out.println(Menu.ANSI_RED + "Encerrando..." + Menu.ANSI_RESET);
                    break;

                default :
                    System.out.println(Menu.ANSI_RED + "Opção inválida! Digite de 1 a 3 para as opções ou 4 para sair" + Menu.ANSI_RESET);
            }
        } while (option != 4);
    }
}
