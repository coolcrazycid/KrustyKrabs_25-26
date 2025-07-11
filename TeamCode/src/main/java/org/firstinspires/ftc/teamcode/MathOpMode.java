package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class MathOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("Right stick y", gamepad1.right_stick_y);
        telemetry.addData("Right stick x", gamepad1.right_stick_x);
        telemetry.addData("B button", gamepad1.b);
        telemetry.addData("speed Forward", speedForward);

        telemetry.addData("Difference:", (gamepad1.left_stick_y - gamepad1.right_stick_y));
        telemetry.addData("Sum:", (gamepad1.left_trigger + gamepad1.right_trigger));
    }
}
