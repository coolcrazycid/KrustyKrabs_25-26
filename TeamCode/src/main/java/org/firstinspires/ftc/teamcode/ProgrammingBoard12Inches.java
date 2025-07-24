package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class ProgrammingBoard12Inches {
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private DistanceSensor distanceSensor;
    private ColorSensor colorSensor;

    public void init(HardwareMap hardwareMap) {
        leftDrive = hardwareMap.get(DcMotor.class, "LeftDrive");
        rightDrive = hardwareMap.get(DcMotor.class, "RightDrive");

        distanceSensor = hardwareMap.get(DistanceSensor.class, "distanceSensor");
        colorSensor = hardwareMap.get(ColorSensor.class, "distanceSensor"); // for REV combo sensor

        rightDrive.setDirection(DcMotor.Direction.REVERSE);
    }

    public void setDrivePower(double left, double right) {
        leftDrive.setPower(left);
        rightDrive.setPower(right);
    }

    public void stopMotors() {
        setDrivePower(0, 0);
    }

    public double getDistanceInches() {
        return distanceSensor.getDistance(DistanceUnit.INCH);
    }

    public DistanceSensor getDistanceSensor() {
        return distanceSensor;
    }

    public ColorSensor getColorSensor() {
        return colorSensor;
    }
}
