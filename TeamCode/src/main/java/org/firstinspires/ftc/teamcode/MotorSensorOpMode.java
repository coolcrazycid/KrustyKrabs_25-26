package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class MotorSensorOpMode extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(board.isTouchSensorPressed()) {
            board.setMotorSpeed(0.5);
        }
        else {
            board.setMotorSpeed(0.0);
        }
        telemetry.addData("Motor rotation", board.getMotorRotations());
    }
}
