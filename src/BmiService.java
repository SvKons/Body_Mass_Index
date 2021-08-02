public class BmiService {

    public double calculate(int weight, double height) {
        double growth = Math.pow(height, 2);
        double bodyMassIndex = weight / growth;

        return bodyMassIndex;
    }
}
