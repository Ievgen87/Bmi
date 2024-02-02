public class BmiService {
    public int calculate(double weight , double height) {
        double total = weight / (height * height);
        int result = (int) total;

        return result;
    }
}
