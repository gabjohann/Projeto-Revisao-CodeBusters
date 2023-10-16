import java.util.Arrays;
import java.util.Scanner;

public class TypesAndWeight {
    public static void main(String[] args) {
        Product cellphone = new Product("Celular",0.7);
        Product fridge = new Product("Geladeira", 50);
        Product airFryer = new Product("Air Fryer", 3.5);
        Product chair = new Product("Cadeira", 5);
        Product lum = new Product("Luminária", 0.8);
        Product washingMachine = new Product("Lavadora de Roupa", 15);
        Product playStation5 = new Product("PlayStation 5", 3.9);
        Product nintendoSwitch = new Product("Nintendo Switch", 0.3);

        Product[] options = {cellphone, fridge, airFryer, chair, lum, washingMachine, playStation5, nintendoSwitch};
        int total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos tipos de produtos serão: ");
        int listLen = scan.nextInt();

        for (int x = 0; x < listLen; x++){
            for (int i = 0; i < Arrays.stream(options).count(); i++) {
                System.out.println(i + ". " + options[i].getProductName());
            }
            System.out.println("Escolha o produto: ");
            int chosen = scan.nextInt();
            System.out.println("Digite a quantidade: ");
            int amount = scan.nextInt();

            double totalEach = options[chosen].getProductWeight() * amount;
            total += totalEach;
        }

        System.out.println(total);
    }
}
