package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Excersize9_2 extends OpMode {
    ProgrammingBoard6 board = new ProgrammingBoard6();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Pot Angle", board.getPotAngle());
        board.setServoPosition(board.getPotRange());
    }
}
