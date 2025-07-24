package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class MoveUntil12InchesFromWallOpMode extends OpMode {

    private ProgrammingBoard12Inches robot = new ProgrammingBoard12Inches();
    private boolean shouldDrive = true;

    @Override
    public void init() {
        robot.init(hardwareMap);
        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {
        double distance = robot.getDistanceInches();

        if (shouldDrive && distance > 12.0) {
            robot.setDrivePower(0.3, 0.3);
            telemetry.addData("Driving", "Distance > 12 in");
        } else {
            robot.stopMotors();
            shouldDrive = false; // prevent re-driving
            telemetry.addData("Stopped", "At or under 12 in");
        }

        telemetry.addData("Distance (in)", distance);
    }
}