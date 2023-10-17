package ExampleClasses;

public class ExampleClass {
    // (1) FIELDS
    int exampleInt = 0;
    int height; // declaring an int without a value;
    double exampleDub = -1.0;
    double exampleDub2 = 3.14159;
    String helloThere = "Hello there";
    boolean juhaeIsTheBest = true;


    // (2) CONSTRUCTOR
    public ExampleClass(int parameter1, String parameter2) {
        this.exampleInt = parameter1;
        this.helloThere = parameter2;
    }


    // (3) METHODS
    public int setHeight(int whatHeight) {
        this.height = whatHeight;
        return height;
    }

    public int returnInteger() {
        return exampleInt;
    }

    public void exampleSetter(int setpoint) {
        exampleDub = setpoint;
    }

    public double exampleGetter() {
        return exampleDub;
    }

    public void checkHeight() {
        if (height == 0) {
            this.setHeight(1);
        } else {
            this.doNothing();
        }
    }

    public void doNothing() {

    }

    // EXAMPLES OF HOW TO CREATE OBJECTS
    public static void main(String[] args) {
        ExampleClass object1 = new ExampleClass(4, "hello");
        ExampleClass object2 = new ExampleClass(0, "parameter2");
        ExampleClass bruhMoment = new ExampleClass(-1000, "#bruh moment");
    }
}
