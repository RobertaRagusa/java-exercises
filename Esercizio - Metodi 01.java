public class Start {

    public static double calculatePrice(double price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        int apples = 3;
        int oranges = 4;
        double appleCost = 1.4;
        double orangeCost = 2.4;

        double result = calculatePrice(appleCost, apples) + calculatePrice(orangeCost, oranges);
        System.out.println("The result is " + result);
    }
}
