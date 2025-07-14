package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.ProgrammingBoard9;
import org.firstinspires.ftc.teamcode.TestItem;

import java.util.ArrayList;

@TeleOp
public class TestWiring extends OpMode {
    ProgrammingBoard9 board = new ProgrammingBoard9();
    ArrayList<TestItem> tests;
    boolean wasDown, wasUp;
    int testNum;

    @Override
    public void init() {
        board.init(hardwareMap);
        tests = board.getTests();
    }

    @Override
    public void loop() {
        //move up in the list of test
        if (gamepad1.dpad_up && !wasUp) {
            testNum--;
            if (testNum < 0) {
                testNum = tests.size() - 1;
            }
        }
        wasUp = gamepad1.dpad_up;

        // move down in the list of tests
        if (gamepad1.dpad_down && !wasDown) {
            testNum++;
            if (testNum >= tests.size()) {
                testNum = 0;
            }
        }
        wasDown = gamepad1.dpad_down;

        //Put instructions on the telemetry
        telemetry.addLine("Use Up and down on D-pad to cycle through choices");
        telemetry.addLine("Press A to run test");
        //put the test on the telemetry
        TestItem currTest = tests.get(testNum);
        telemetry.addData("Test: ", currTest.getDescription());
        //run or dont run based on a
        currTest.run(gamepad1.a, telemetry);

    }
}
