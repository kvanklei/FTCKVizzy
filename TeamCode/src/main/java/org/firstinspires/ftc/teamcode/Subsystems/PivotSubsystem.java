package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Constants;

public class PivotSubsystem {
    DcMotorEx pivot1;
    DcMotorEx pivot2;

    public PivotSubsystem (HardwareMap hm) {
        pivot1 = hm.get(DcMotorEx.class,"pivot1");
        pivot2 = hm.get(DcMotorEx.class, "pivot2");

        pivot1.setDirection(DcMotorSimple.Direction.FORWARD);
        pivot2.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void p1(){
        pivot1.setTargetPosition(Constants.pivot1_p1);
        pivot1.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
        pivot1.setPower(0.5);

        pivot2.setTargetPosition(Constants.pivot2_p1);
        pivot2.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
        pivot2.setPower(0.5);

    } public void p2(){
        pivot1.setTargetPosition(Constants.pivot1_p2);
        pivot1.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
        pivot1.setPower(0.5);

        pivot2.setTargetPosition(Constants.pivot2_p2);
        pivot2.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
        pivot2.setPower(0.5);

    } public void p3(){
        pivot1.setTargetPosition(Constants.pivot1_p3);
        pivot1.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
        pivot1.setPower(0.5);

        pivot2.setTargetPosition(Constants.pivot2_p3);
        pivot2.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
        pivot2.setPower(0.5);
    }
}
