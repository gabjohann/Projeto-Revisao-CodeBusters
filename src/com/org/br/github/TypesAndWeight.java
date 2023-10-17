import java.util.Arrays;
import java.util.Scanner;

public class TypesAndWeight {
    private double totalWeight; // Variável de instância para armazenar o peso total

    public double calculateTotalWeight() {
        Product[] options = {
                new Product("Celular", 0.7),
                new Product("Geladeira", 50),
                new Product("Air Fryer", 3.5),
                new Product("Cadeira", 5),
                new Product("Luminária", 0.8),
                new Product("Lavadora de Roupa", 15),
                new Product("PlayStation 5", 3.9),
                new Product("Nintendo Switch", 0.3)
        };

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos tipos de produtos serão: ");
        int listLen = scan.nextInt();


        for (int x = 0; x < listLen; x++) {
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + ". " + options[i].getProductName());
            }
            System.out.print("Escolha o produto: ");
            int chosen = scan.nextInt();
            System.out.print("Digite a quantidade: ");
            int amount = scan.nextInt();

            double totalEach = options[chosen].getProductWeight() * amount;
            totalWeight += totalEach; // Atualize a variável totalWeight
        }
        return totalWeight;
    }


}
