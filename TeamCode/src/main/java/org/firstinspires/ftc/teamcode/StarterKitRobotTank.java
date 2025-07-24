package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class StarterKitRobotTank extends OpMode {

    private DcMotor LeftDrive;
    private DcMotor RightDrive;

    @Override
    public void init() {
        LeftDrive = hardwareMap.get(DcMotor.class, "LeftDrive");
        RightDrive = hardwareMap.get(DcMotor.class, "RightDrive");

        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {
        double leftAxis = -gamepad1.left_stick_y;
        double rightAxis = -gamepad1.right_stick_y;

        double leftPower = -leftAxis;
        double rightPower = rightAxis;

        LeftDrive.setPower(leftPower);
        RightDrive.setPower(rightPower);
    }
}

