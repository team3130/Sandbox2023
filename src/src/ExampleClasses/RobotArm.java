package ExampleClasses; 

/*
NOTE: THIS IS AN INACCURATE AND SIMPLIFIED VERSION OF WHAT OUR FRC ROBOT CODE LOOKS LIKE
JUST READ IT OVER AND BECOME FAMILIAR WITH THE IDEA OF FRC ROBOT CLASSES, OBJECTS, METHODS ETC
 */

public class RobotArm {
    public int w;
    public double l;

    public RobotArm(int weight, double length){
        this.w = weight;
        this.l = length;
    }

    public static void main (String arg[]){
        RobotArm energizerrArm = new RobotArm(8, 5.6);
        RobotArm outreacherrArm = new RobotArm(69, 5.84);

        System.out.println(energizerrArm.w);
    }
}