public class Start {
    public static double calculatePrice(FruitBasket[] fruitBasket){
        if(fruitBasket == null) return 0;
        System.out.println("There are " + fruitBasket.length + " fruits");
        double totalPrice = 0;
        for (int i = 0 ; i<fruitBasket.length;i++){
            FruitBasket single = fruitBasket[i];
            double singlePrice = single.quantity * single.fruit.price;
            System.out.println("The price for " + single.quantity + " " + single.fruit.name + " is " + singlePrice);
            totalPrice += single.quantity * single.fruit.price;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 1.2);
        Fruit orange = new Fruit("Orange", 1.2);

        FruitBasket basketApple = new FruitBasket(apple, 3);
        FruitBasket basketOrange = new FruitBasket(orange, 2);

        FruitBasket fruitBasket[] = new FruitBasket[]{basketApple, basketOrange};
        double totalPrice = calculatePrice(fruitBasket);
        System.out.println("The total price for all the fruits is " + totalPrice);
    }
}


public class Fruit {
    public String name;
    public double price;

    Fruit(String name, double price){
        this.name = name;
        this.price = price;
    }
}


public class FruitBasket {
    public Fruit fruit;
    public int quantity;

    public FruitBasket(Fruit fruit, int quantity){
        this.fruit = fruit;
        this.quantity = quantity;
    }
}


