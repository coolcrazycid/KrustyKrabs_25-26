package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ServoGamepadOpMode extends OpMode {
    ProgrammingBoard5 board = new ProgrammingBoard5();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        board.setServoPosition(gamepad1.left_trigger);
    }
}
