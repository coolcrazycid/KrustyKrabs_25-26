package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class IfOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick", " is negative");
        }
        if (gamepad1.left_stick_y < 0) {
            telemetry.addData("Left stick y", gamepad1.left_stick_y);
        }
    }
}
