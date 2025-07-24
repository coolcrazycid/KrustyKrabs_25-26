package org.firstinspires.ftc.teamcode;

import org.opencv.core.Rect;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import org.firstinspires.ftc.vision.VisionProcessor;
import org.opencv.core.Mat;
import org.firstinspires.ftc.robotcore.internal.camera.calibration.CameraCalibration;

public class ThreeRectanglesProcessor implements VisionProcessor {
    public Rect rectLeft = new Rect(110, 42, 40, 40);
    public Rect rectMiddle = new Rect(160, 42, 40, 40);
    public Rect rectRight = new Rect(210, 42, 40, 40);
    Selected selection = Selected.NONE;
}
