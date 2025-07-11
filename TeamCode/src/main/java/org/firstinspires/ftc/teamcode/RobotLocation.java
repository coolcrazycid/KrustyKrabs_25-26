package org.firstinspires.ftc.teamcode;

public class RobotLocation {

    double angle;
    double x;



    double y;

    public RobotLocation(double angle) {
        this.angle = angle;
    }

    public double getHeading () {
        double angle = this.angle;

        while ( angle > 180) {
            angle -= 360;
        }
        while (angle < -180) {
            angle += 360;
        }
        return angle;
    }


    @Override
    public String toString() {
        return "RobotLocation: angle (" + angle +") pos (" + x + "," + y + ")";
    }

    public void turn(double angleChange) {
        angle += angleChange;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void changeX(double change) {
        x += change;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void changeY(double change) {
        y += change;
    }


}
