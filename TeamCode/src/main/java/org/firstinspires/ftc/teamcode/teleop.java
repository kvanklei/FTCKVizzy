package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Subsystems.DriveSubsystem;

public class teleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        DriveSubsystem dt = new DriveSubsystem(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            double left_y = gamepad1.left_stick_y;
            double right_x = gamepad1.right_stick_x;

            //drivetrain drive in arcade
            dt.arcade_drive(left_y, right_x);


        }
    }
}
