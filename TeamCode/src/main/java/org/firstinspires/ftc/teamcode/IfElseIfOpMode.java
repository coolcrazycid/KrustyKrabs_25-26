package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfElseIfOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < -0.5) {
            telemetry.addData("Left stick", " is negative and large");
        }
        else if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", " is negative and small");
        }
        else if (gamepad1.left_stick_y < 0.5){
            telemetry.addData("Left stick", " is positive and small");
        }
        else {
            telemetry.addData("Left stick", " is positive and large");
        }
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
    }
}
