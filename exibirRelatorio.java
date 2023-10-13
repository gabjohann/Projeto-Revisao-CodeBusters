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
}