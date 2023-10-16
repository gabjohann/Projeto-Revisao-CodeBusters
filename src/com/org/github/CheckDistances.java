package src.com.org.github;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckDistances {
    String filePath = "src\\DistanciasCidadesCSV.csv";
    List<String> cities = new ArrayList<>();
    int[][] distances = null;
    int countRows = 0;
    int row = 0;

    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";"); //Separa os valores

            /*
                Verifica se é a primeira linha do arquivo, contendo as cidades
                Caso seja, adiciona todas as cidades na Lista cities.
            */

                if (countRows == 0) {
                    cities.addAll(Arrays.asList(values));
                    distances = new int[cities.size()][cities.size()];
                    countRows++;
                } else {
                    //Adiciona as colunas da tabela de distancias
                    for (int col = 0; col < values.length; col++) {
                        int distance = Integer.parseInt(values[col]);
                        distances[row][col] = distance;
                    }
                    row++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<String> getCities() {
        return cities;
    }

    public int getDistance(int originCity, int destinationCity) {

        return distances[originCity][destinationCity];
    }
}
