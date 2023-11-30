public class Food {
    String name;
    int calories;
    int date;
    double price;

    public Food(String foodName, int cal, int dateMade, double priceTag){
        this.name = foodName;
        this.calories = cal;
        this.date = dateMade;
        this.price = priceTag;
    }

    public int getCalories(){
        return calories;
    }
    public void setCalories(int cal){
        this.calories = cal;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double priceTag){
        this.price = priceTag;
    }

    public void increasePrice(double money){
        this.price += money;
    }
    public void decreasePrice(double money){
        this.price -= money;
    }

    public static void main(String[] args) {
        Food pizzaSlice = new Food("Pizza", 310, 1792, 9.49);
        Food chicken = new Food("Chicken Wings", 245, 1968, 6.99);
        Food pasta = new Food("Pasta with Marinara", 385, 1643, 12.49);
        pizzaSlice.setCalories(360);
        System.out.println(pizzaSlice.getCalories());
        pasta.increasePrice(0.5);
        System.out.println(pasta.getPrice());
    }
}
