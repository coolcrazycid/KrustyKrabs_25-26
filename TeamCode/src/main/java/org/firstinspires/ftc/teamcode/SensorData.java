package org.firstinspires.ftc.teamcode;

public class SensorData {

    private double distanceCM;
    private double colorRed;
    private double colorGreen;
    private double colorBlue;
    private double colorAlpha;
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

    // Touch Sensor
    public double getTouchStatus() {
        return touchStatus;
    }
    public void setTouchStatus(double touchStatus) {
        this.touchStatus = touchStatus;
    }
}
