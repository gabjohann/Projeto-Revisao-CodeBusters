//imports

public class exibirRelatorio{

//Dados Estatísticos

//exibir relatório dos transportes cadastrados: (custo total, custo por trecho, custo médio p/ km,
//custo médio p/ produto, custo total p/ trecho, custo total para cada modalidade de transporte,
//o número total de veículos deslocados e o total de itens transportados);

//exibir = system.out.println("");

    public static void exibirProdEnviados(Transporte transp){ //criada para facilitar a funcionalidade exibir ---> exibir todos os produtos enviados em transportes

        String nomeProd;
        int quantProd;
        for(Amarelinha lista : transp){ //array ou lista :  transp
        
            System.out.println("Nome do Produto: "+nomeProd +" Quantidade: "+quantProd);
        }
    }

    public static void exibirRelatorio(Transporte transp){
        double custoTotal;
        double custoPTrecho;
        String tipoPorte;
        double custoMedioKm;
        double custoMedioProduto;
        double custoToTrecho;
        double custoToTransportes;
        int veicDesloc;
        String nomeProd;
        int quantProd;


        System.out.println("\n"+"------------------------------------"+
                            "\n"+"     Relatório dos Transportes     "+"\n"+
                            "\n"+"Caminhão: "+tipoPorte+
                            "\n"+"Custo Total: "+custoTotal+
                            "\n"+"Custo p/ Trecho: "+custoPTrecho+
                            "\n"+"Custo Médio p/KM: "+custoMedioKm+
                            "\n"+"Custo Médio por Tipo de Produto: "+custoMedioProduto+
                            "\n"+"Custo Total p/ Trecho: "+custoToTrecho+
                            "\n"+"Custo Total p/ cada Transporte: "+custoToTransportes+
                            "\n"+"Número Total de Veículos Deslocados: "+veicDesloc+
                            "\n"+"Total de Itens Transportados: "
                            +exibirProdEnviados(transp)+
                            "\n"+"------------------------------------"+"\n");
    }
}