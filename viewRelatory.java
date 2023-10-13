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

    
    public static void viewRelat(Transport transp){
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
