package ExampleClasses; 

/*
NOTE: THIS IS AN INACCURATE AND SIMPLIFIED VERSION OF WHAT OUR FRC ROBOT CODE LOOKS LIKE
JUST READ IT OVER AND BECOME FAMILIAR WITH THE IDEA OF FRC ROBOT CLASSES, OBJECTS, METHODS ETC
 */

public class RobotArm {
    // INSTANCE VARIABLES
    double armPosition;
    double armSize;
    double speed;

    // CONSTRUCTOR
    public RobotArm(int armPosition, int armSize, int speed) {
        this.armPosition = armPosition;
        this.armSize = armSize;
        this.speed = speed;

    }

    // METHODS
    public RobotArm(int armSize) {
        this.armSize = armSize;
    }

    public void extendArm(int extendBy) {
        this.armPosition += extendBy;
    }

    public void retractArm(int retractBy) {
        this.armPosition -= retractBy;
    }

    public void extendArmSafely(int extendBy) {
        if (armPosition + extendBy > armSize) {
            armPosition = armSize;
        } else {
            armPosition += extendBy;
        }
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public double getArmPosition() {
        return this.armPosition;
    }
    public static void main(String [] args) {
        RobotArm bigboi = new RobotArm(1,100,1);
        RobotArm smallboi = new RobotArm(10, 10, 100);
    }
}
