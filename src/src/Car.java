public class Car {
    //Instance Variables
    String brand;
    double price;
    int yearMade;
    int howManyMade;
    boolean rarity;

    //Constructor
    public Car(String brand, double price, int yearMade, int howManyMade, boolean rarity){
        this.brand = brand;
        this.price = price;
        this.yearMade = yearMade;
        this.howManyMade = howManyMade;
        this.rarity = rarity;
    }

    //Methods
        //Getters
    public String getBrand(){return brand;}
    public double getPrice(){return price;}
    public int getYearMade(){return yearMade;}
    public int getHowManyMade(){return howManyMade;}
    public boolean isCarRare(){return rarity;}

        //Setters
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void setYearMade(int newYearMade){
        this.yearMade = newYearMade;
    }
    public void setHowManyMade(int newHowManyMade){
        this.howManyMade = newHowManyMade;
    }
    public void setRarity(boolean newRarity){
        this.rarity = newRarity;
    }

        //Printing Methods
    public void printBrand(){
        System.out.println(getBrand());
    }
    public void printPrice(){
        System.out.println(getPrice());
    }
    public void printYearMade(){
        System.out.println(getYearMade());
    }
    public void printAmountMade(){
        System.out.println(getHowManyMade());
    }
    public void printCarRarity(){
        System.out.println(isCarRare());
    }
    
    public static void main(String[] args){
        //Objects
        Car Porsche911 = new Car("Porsche", 107777.00,2020,5152,true);
        Car Enclave = new Car("Buick", 35000.00,2010,696288,false);
        Car C250 = new Car("Mercedes",25000.00,2013,2400000,false);

        //Printing
        System.out.println("Porsche911");
        Porsche911.printBrand();
        Porsche911.printPrice();
        Porsche911.printYearMade();
        Porsche911.printAmountMade();
        Porsche911.printCarRarity();

        System.out.println("Enclave");
        Enclave.printBrand();
        Enclave.printPrice();
        Enclave.printYearMade();
        Enclave.printAmountMade();
        Enclave.printCarRarity();

        System.out.println("C250");
        C250.printBrand();
        C250.printPrice();
        C250.printYearMade();
        C250.printAmountMade();
        C250.printCarRarity();
    }
}
