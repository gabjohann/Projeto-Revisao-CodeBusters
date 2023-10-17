//imports

public class viewRelatory {
    
//Dados Estatísticos

//exibir relatório dos transportes cadastrados: (custo total, custo por trecho, custo médio p/ km,
//custo médio p/ produto, custo total p/ trecho, custo total para cada modalidade de transporte,
//o número total de veículos deslocados e o total de itens transportados);

//view = system.out.println("");

    public static void viewProdSent(Transport transp){ //criada para facilitar a funcionalidade exibir ---> exibir todos os produtos enviados em transportes

        String nameProd;
        int quantProd;

        for(Yellow lista : transp){ //array ou lista :  transp
        
            System.out.println("Product Name: "+nameProd +" Quantity: "+quantProd);
        }
    }

    
    public static void viewRelat(Transport transp){ //função exibir relatório completo
        double totalCost;
        double costPSegment;
        String typeTransp;
        double averageCostPKm;
        double averageCostPProduct;
        double totalCostPSegment;
        double totalCostFTransport;
        int vehDesl;
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
                            +viewRelat(transp)+
                            "\n"+"------------------------------------"+"\n");
    }

}
