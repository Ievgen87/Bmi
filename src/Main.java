public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kilograms = 110;
        double meters = 1.9;

        int bmi = service.calculate(kilograms , meters);

        System.out.println("Индекс массы тела равен");

        System.out.println(bmi);
    }
}