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
    public RobotArm(double armPos, double armSize, double speed) {
        this.armPosition = armPos;
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

    public static void main(String[] args) {
        RobotArm fstpos = new RobotArm(1.6, 1.9, 4.3);
        RobotArm secpos = new RobotArm(2.8904, 2.6, 4.15);
    }

}
