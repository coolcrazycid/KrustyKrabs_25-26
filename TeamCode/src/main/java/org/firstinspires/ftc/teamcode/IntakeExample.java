package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;



import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Config
@TeleOp (name = "IntakeExample", group = "Examples")
public class IntakeExample extends LinearOpMode {
    public DcMotorEx motor;
    public static double POWER = 0.0;
    public static boolean isRunning = false;

    @Override
    public void runOpMode() throws InterruptedException {
        motor = hardwareMap.get(DcMotorEx.class, "intakeMotor");
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor.setDirection(DcMotorEx.Direction.FORWARD);
        waitForStart();
        while (opModeIsActive()) {
            if(gamepad1.right_bumper) {
                isRunning = true;
            } else {
                //skibidi
            }
            if (isRunning) {
                motor.setPower(POWER);
            }
        }
    }
}
