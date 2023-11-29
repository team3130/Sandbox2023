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
    public RobotArm(double Position, double Size, double armSpeed) {
        this.armPosition = Position;
        this.armSize = Size;
        this.speed = armSpeed;
    }


        // METHODS
    public RobotArm( int armSize){
            this.armSize = armSize;
        }

        public void extendArm ( int extendBy){
            this.armPosition += extendBy;
        }

        public void retractArm ( int retractBy){
            this.armPosition -= retractBy;
        }

        public void extendArmSafely ( int extendBy){
            if (armPosition + extendBy > armSize) {
                armPosition = armSize;
            } else {
                armPosition += extendBy;
            }
        }

        public void setSpeed ( double newSpeed){
            speed = newSpeed;
        }

        public double getSpeed () {
            return speed;
        }

        public double getArmPosition () {
            return this.armPosition;
        }

        public static void main (String[]args){
        RobotArm cooliosis = new RobotArm(6, 99,54);
        RobotArm coolio = new RobotArm(9,10,99);
}}
