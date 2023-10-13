//imports

public class viewRelatory {
    
//Statistical Data

//View report of registered transports: (total cost, cost per segment, average cost per km,
//average cost per product, total cost per segment, total cost for each mode of transport,
//the total number of vehicles moved and the total number of items transported);

//view = system.out.println("");

    public static void viewProdSent(Transport transp){ //created to ease the funcionality view ---> view all the products sent in transports

        String nameProd;
        int quantProd;

        for(Yellow lista : transp){ //array or list :  transp
        
            System.out.println("Product Name: "+nameProd +" Quantity: "+quantProd);
        }
    }

    
    public static void exibirRelatorio(Transport transp){
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
                            "\n"+"     Relatório dos Transportes     "+"\n"+
                            "\n"+"Caminhão: "+typeTransp+
                            "\n"+"Custo Total: "+totalCost+
                            "\n"+"Custo p/ Trecho: "+costPSegment+
                            "\n"+"Custo Médio p/KM: "+averageCostPKm+
                            "\n"+"Custo Médio por Tipo de Produto: "+averageCostPProduct+
                            "\n"+"Custo Total p/ Trecho: "+totalCostPSegment+
                            "\n"+"Custo Total p/ cada Transporte: "+totalCostFTransport+
                            "\n"+"Número Total de Veículos Deslocados: "+vehDesl+
                            "\n"+"Total de Itens Transportados: "
                            +exibirProdEnviados(transp)+
                            "\n"+"------------------------------------"+"\n");
    }

}
