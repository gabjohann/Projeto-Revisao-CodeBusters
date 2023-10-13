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

    
}
