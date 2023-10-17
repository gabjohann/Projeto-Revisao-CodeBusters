//imports

import java.util.List;

public class viewRelatory {
    
//Dados Estatísticos

//exibir relatório dos transportes cadastrados: (custo total, custo por trecho, custo médio p/ km,
//custo médio p/ produto, custo total p/ trecho, custo total para cada modalidade de transporte,
//o número total de veículos deslocados e o total de itens transportados);

//view = system.out.println("");

    public static void viewProdSent(List chosenTransports, List chosenProducts){ //criada para facilitar a funcionalidade exibir ---> exibir todos os produtos enviados em transportes

        String nameProd;
        int quantProd;

        for(int i=0; i<chosenProducts.size(); i++){ //array ou lista :  transp
        
            System.out.println("Product Name: "+nameProd +" Quantity: "+quantProd);
        }
    }

    
    public static void viewRelat(List listaTransp){ //função exibir relatório completo
        
        //-Custo Total-
        double totalCost = totalCostPSegment+totalCostFTransport;
        
        //-Custo por trecho-
        double costPSegment ;
        for(int i=0; i<listaTransp.size(); i++){
           costPSegment = costKm * distanceKm;
        }
        
        String typeTransp;
        double averageCostPKm;
        
        //-Custo Médio por produto-
        double totalcostProduct ;
        int totalQuantProducts ;
        int quantProd;
        for(int i=0; i<listProducts.size(); i++){
        totalcostProduct = weight * quantProd; //custo por produto
        totalQuantProducts += quantProd; //quantidade todos os produtos
        }
        double averageCostPProduct = totalcostProduct/ totalQuantProducts; //custo medio por produtos
        
         //-Custo total por trecho-
        double totalCostPSegment;
        for(int i=0; i<listaTransp.size(); i++){

            int quantMovedSegment = 0;
            quantMovedSegment += 1;
            totalCostPSegment = costPSegment * quantMovedSegment;
        }
        
        double totalCostFTransport;

        //-Número total de veiculos-
            int vehDesl=0;
            while(vehDesl<listaTransp.size()){
                vehDesl++; //calcula quantos veiculos tem cadastrados

            }

        
        String nameProd;
        int quantProd;


        System.out.println("\n"+"------------------------------------"+
                            "\n"+"     Report of Transports     "+"\n"+
                            "\n"+"Truck: "+typeTransp+
                            "\n"+"Total Cost: "+totalCost+
                            "\n"+"Cost p/ Segment: "+costPSegment+
                            "\n"+"Average Cost p/KM: "+averageCostPKm+
                            "\n"+"Average Cost p/ Type of Product: "+averageCostPProduct+
                            "\n"+"Total Cost p/ Segment: "+totalCostPSegment+
                            "\n"+"Total Cost for each Transport: "+totalCostFTransport+
                            "\n"+"Total of Moved Vehicles: "+vehDesl+
                            "\n"+"Total Itens Transported: "
                            +viewRelat(listOfProducts)+
                            "\n"+"------------------------------------"+"\n");
    }

}
