public class Car {
    private int year;
    private int numberOfTires;
    private String model;
    private double mileage;
    public Car(String m, double ml, int y, int nt){
        model = m;
        mileage = ml;
        year = y;
        numberOfTires = nt;
    }
    public int getYear(){
        return  year;
    }
    public double getMileage(){
        return mileage;
    }
    public void setYear(int y){
        year = y;
    }
    public void setMileage(int ml){
        mileage = ml;
    }
    public void printMileage(){
        System.out.println(mileage);
    }
    public void printYear(){
        System.out.println(year);
    }

    public static void main(String[] args) {
        Car escape = new Car("Ford Escape",21000,2089,1);
        Car subaru = new Car("Subaru Outback",328487, 2002,4);
        Car plane = new Car("American Airlines", 911, 2001,2);
        System.out.println("Mileage: " + plane.getMileage());
        System.out.println("Year: " + plane.getYear());
        plane.setYear(2012);
        System.out.println("Year: " + plane.getYear());

    }
}
