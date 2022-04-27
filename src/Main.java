public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double bmi = bmiService.calculate(50, 1.61);
        System.out.println(bmi);
    }
}
