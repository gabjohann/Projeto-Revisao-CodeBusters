import java.util.Arrays;
import java.util.Comparator;

public class TruckCostBenefitCalculator {
//Recebe os caminhões de TheBestTruck
    public static TheBestTruck findMostCostEffectiveTruck(TheBestTruck[] trucks, double distance, double weight) {
        //Retorna os caminhões e começa um filtro para encontrar um caminhão que atenda a relação capacidade x preço por km
        return Arrays.stream(trucks)
                //Funções lambda para otimizar o código.
                .filter(truck -> truck.getMaximumCapacity() >= weight)
                .min(Comparator.comparingDouble(truck -> truck.calculateCostPerKm(distance)))
                .orElse(null);
    }
}
