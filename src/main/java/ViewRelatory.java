import java.util.ArrayList;
import java.util.List;
public class ViewRelatory {

//Dados Estatísticos

//exibir relatório dos transportes cadastrados: (custo total, custo por trecho, custo médio p/ km,
//custo médio p/ produto, custo total p/ trecho, custo total para cada modalidade de transporte,
//o número total de veículos deslocados e o total de itens transportados);

//view = system.out.println("");

    /*
        public static void viewProdSent(List chosenTransports, List chosenProducts){ //criada para facilitar a funcionalidade exibir ---> exibir todos os produtos enviados em transportes

            String nameProd;
            int quantProd;

            for(int i=0; i<chosenProducts.size(); i++){ //array ou lista :  transp

                System.out.println("Product Name: "+getpro +" Quantity: "+quantProd);
            }
        }

     */

        public static void viewRelat(ArrayList<Double>totalCostList, ArrayList<String> typeTruckList, ArrayList<Double>pricesPerKmList,ArrayList<Double> productWeightList,ArrayList<String> chosenProductList ){ //função exibir relatório completo

                //imprimir dados de todos os caminhões

                //-Custo por trecho - cada caminhão tem um custo p/ trecho
                //-Custo total por trecho-

                //arrayList -> totalCostList

                double totalCostPSegment;
                double costPSegment;
                for (int i = 0; i < totalCostList.size(); i++) {
                    costPSegment = totalCostList.get(i);
                    totalCostPSegment =+ totalCostList.get(i);
                }

                double averageCostPKm;

                //-Custo Médio por produto-
                double totalcostProduct;
                int totalQuantProducts;
                int quantProd;
                for (int i = 0; i < chosenProductList.size(); i++) {
                    totalcostProduct = totalCostPSegment * quantProd; //custo por produto
                    totalQuantProducts += quantProd; //quantidade todos os produtos
                }
                double averageCostPProduct = totalcostProduct / totalQuantProducts; //custo medio por produtos

                double totalCostFTransport;

                //-Número total de veiculos-
                int vehDesl = 0;
                while (vehDesl < listaTransp.size()) {
                    vehDesl++; //calcula quantos veiculos tem cadastrados

                }

                //-Custo Total-

                double totalCost = totalCostPSegment + totalCostFTransport;


                System.out.println("\n" + "------------------------------------" +
                        "\n" + "     Report of Transports     " + "\n" +

                        "\n" + "Cost p/ Segment: " + costPSegment +
                        "\n" + "Average Cost p/KM: " + averageCostPKm +
                        "\n" + "Average Cost p/ Type of Product: " + averageCostPProduct +
                        "\n" + "Total Cost p/ Segment: " + totalCostPSegment +
                        "\n" + "Total Cost for each Transport: " + totalCostFTransport +
                        "\n" + "Total of Moved Vehicles: " + vehDesl +
                        "\n" + "Total Itens Transported: "+
                        "\n" + "Total Cost: " + totalCost +
                        + viewRelat(listOfProducts) +
                        "\n" + "------------------------------------" + "\n");

        }

    }
}
