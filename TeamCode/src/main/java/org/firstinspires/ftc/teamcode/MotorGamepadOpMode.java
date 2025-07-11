package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MotorGamepadOpMode extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            board.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            telemetry.addData("Zero", "Brake");
        }
        else{
            board.setMotorZeroBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
            telemetry.addData("Zero", "Float");
        }
        telemetry.addData("Motor rotations", board.getMotorRotations());
    }
}
