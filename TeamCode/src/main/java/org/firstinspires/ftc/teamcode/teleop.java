package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.ArmSubsystem;
import org.firstinspires.ftc.teamcode.Subsystems.DriveSubsystem;

@TeleOp
public class teleop extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        DriveSubsystem dt = new DriveSubsystem(hardwareMap);
        ArmSubsystem arm = new ArmSubsystem(hardwareMap);


        waitForStart();
        while (opModeIsActive()) {
            double left_y = gamepad1.left_stick_y;
            double right_x = gamepad1.right_stick_x;

            //drivetrain drive in arcade
            dt.arcade_drive(left_y, right_x);

            if (gamepad1.a) {
                arm.p1();

            } else if (gamepad1.b) {
                arm.p2();

            } else if (gamepad1.y) {
                arm.p3();
            }

        }
    }
}
