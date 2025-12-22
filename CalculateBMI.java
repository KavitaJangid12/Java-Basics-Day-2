public class CalculateBMI {
    public static void main(String[] args) {
        double weight = 45;
        double height = 1.53;
        double bmi = weight / (height*height);
        System.out.println("Body Mass index: "+bmi);
    }
}
