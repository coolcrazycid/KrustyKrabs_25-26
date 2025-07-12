package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;


@TeleOp
public class DistanceColorOpMode extends OpMode {
    ProgrammingBoard7 board = new ProgrammingBoard7();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (board.getDistance(DistanceUnit.CM) < 10) {
            board.setMotorSpeed(0.0);
        } else {
            board.setMotorSpeed(0.5);
        }
        telemetry.addData("Distance (CM)", DistanceUnit.CM);
    }
}
