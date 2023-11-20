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
    public RobotArm() {

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

}
