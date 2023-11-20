package ExampleClasses;

public class ExampleClass {
    // (1) INSTANCE VARIABLES
    int exampleInt = 0;
    int anInt; // declaring an int without a value;
    double exampleDub = -1.0;
    double exampleDub2 = 3.14159;
    String greeting = "Hello there";
    boolean juhaeIsTheBest = true;


    // (2) CONSTRUCTOR
    public ExampleClass(int parameter1, String parameter2) {
        this.exampleInt = parameter1;
        this.greeting = parameter2;
    }


    // (3) METHODS
    public int setAnInt(int whatHeight) {
        this.anInt = whatHeight;
        return anInt;
    }

    public int getAnInt() {
        return anInt;
    }

    public boolean anIntIsGreaterThanZero() {
        if (anInt <= 0) {
            System.out.println("falsey");
            return false;
        } else {
            System.out.println("truey");
            return true;
        }
    }

    public void doNothing() {

    }

    // EXAMPLES OF HOW TO CREATE OBJECTS AND USE THEM
    public static void main(String[] args) {
        ExampleClass object1 = new ExampleClass(4, "hello");
        ExampleClass object2 = new ExampleClass(0, "parameter2");
        ExampleClass bruhMoment = new ExampleClass(-1000, "#bruh moment");

        // CALLING METHODS OFF OF OBJECTS
        object1.setAnInt(10);
        System.out.println(object1.getAnInt());
        object1.anIntIsGreaterThanZero();
    }
}
