package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.hardware.bosch.BNO055IMU;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;



@TeleOp(name = "Sensor Test", group = "Tests")
public class SensorTestOpMode extends LinearOpMode {

    private ColorSensor colorSensor;
    private DistanceSensor distanceSensor;  // same physical sensor as colorSensor
    private RevTouchSensor touchSensor;
    private BNO055IMU imu;
    private SensorData sensorData = new SensorData();

    @Override
    public void runOpMode() throws InterruptedException {

        // Map sensors (same name for color & distance)
        colorSensor = hardwareMap.get(ColorSensor.class, "colorSensor");
        distanceSensor = hardwareMap.get(DistanceSensor.class, "colorSensor"); // same hardware name
        touchSensor = hardwareMap.get(RevTouchSensor.class, "touchSensor");
        imu = hardwareMap.get(BNO055IMU.class, "imu");

        // Initialize IMU
        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;
        imu.initialize(parameters);

        telemetry.addLine("Initialized. Press PLAY to start.");
        telemetry.update();
        waitForStart();

        while (opModeIsActive()) {
            // Read IMU orientation
            Orientation angles = imu.getAngularOrientation();
            sensorData.setGyroHeading(angles.firstAngle);  // Z axis (yaw)
            sensorData.setGyroPitch(angles.secondAngle);   // Y axis (pitch)
            sensorData.setGyroRoll(angles.thirdAngle);     // X axis (roll)

            // Update SensorData
            sensorData.setDistanceCM(distanceSensor.getDistance(DistanceUnit.CM));
            sensorData.setColorRed(colorSensor.red());
            sensorData.setColorGreen(colorSensor.green());
            sensorData.setColorBlue(colorSensor.blue());
            sensorData.setColorAlpha(colorSensor.alpha());
            sensorData.setTouchStatus(touchSensor.isPressed() ? 1 : 0);

            // Display readings
            telemetry.addData("Distance (cm)", "%.2f", sensorData.getDistanceCM());
            telemetry.addData("Color (R,G,B)", "%d, %d, %d",
                    (int) sensorData.getColorRed(),
                    (int) sensorData.getColorGreen(),
                    (int) sensorData.getColorBlue());
            telemetry.addData("Touch Pressed", sensorData.getTouchStatus() == 1 ? "YES" : "NO");
            telemetry.addData("Gyro Heading", sensorData.getGyroHeading());
            telemetry.addData("Gyro Pitch", sensorData.getGyroPitch());
            telemetry.addData("Gyro Roll", sensorData.getGyroRoll());
            telemetry.update();
        }
    }
}
