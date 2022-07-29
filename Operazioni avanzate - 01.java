public class Start {
    public static void main(String[] args) {
        int apples = 3;
        int oranges = 4;
        double costSingleOrange = 1.5;
        double costSingleApple = 2.1;
        double appleTotalCost = apples * costSingleApple;
        double orangesTotalCost = oranges * costSingleOrange;
        double basketTotalCost = appleTotalCost + orangesTotalCost;
        System.out.println("The sum of apples and oranges is " + basketTotalCost);
    }
}
