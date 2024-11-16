package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DriveSubsystem {
    DcMotor bl;
    DcMotor br;

    public DriveSubsystem(HardwareMap hm) {
        bl = hm.get(DcMotor.class, "bl");
        br = hm.get(DcMotor.class, "br");

        bl.setDirection(DcMotorSimple.Direction.REVERSE);
        br.setDirection(DcMotorSimple.Direction. REVERSE);
    }

    public void arcade_drive(double y, double x) {
        bl.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        br.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        bl.setPower(y+x);
        br.setPower(y-x);
    }




}
