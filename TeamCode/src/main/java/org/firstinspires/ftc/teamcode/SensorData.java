package org.firstinspires.ftc.teamcode;

public class SensorData {

    private double distanceCM;
    private double colorRed;
    private double colorGreen;
    private double colorBlue;
    private double colorAlpha;
    private float gyroHeading;
    private float gyroPitch;
    private float gyroRoll;
    private double touchStatus;

    // Distance from Color/Distance Sensor
    public double getDistanceCM() {
        return distanceCM;
    }
    public void setDistanceCM(double distanceCM) {
        this.distanceCM = distanceCM;
    }

    // Color Sensor
    public double getColorRed() {
        return colorRed;
    }
    public void setColorRed(double colorRed) {
        this.colorRed = colorRed;
    }

    public double getColorGreen() {
        return colorGreen;
    }
    public void setColorGreen(double colorGreen) {
        this.colorGreen = colorGreen;
    }

    public double getColorBlue() {
        return colorBlue;
    }
    public void setColorBlue(double colorBlue) {
        this.colorBlue = colorBlue;
    }

    public double getColorAlpha() {
        return colorAlpha;
    }
    public void setColorAlpha(double colorAlpha) {
        this.colorAlpha = colorAlpha;
    }

    // IMU (Gyro)
    public float getGyroHeading() {
        return gyroHeading;
    }
    public void setGyroHeading(float gyroHeading) {
        this.gyroHeading = gyroHeading;
    }

    public float getGyroPitch() {
        return gyroPitch;
    }
    public void setGyroPitch(float gyroPitch) {
        this.gyroPitch = gyroPitch;
    }

    public float getGyroRoll() {
        return gyroRoll;
    }
    public void setGyroRoll(float gyroRoll) {
        this.gyroRoll = gyroRoll;
    }

    // Touch Sensor
    public double getTouchStatus() {
        return touchStatus;
    }
    public void setTouchStatus(double touchStatus) {
        this.touchStatus = touchStatus;
    }
}
