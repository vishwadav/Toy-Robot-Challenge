import constants.RobotCommonConstants;
import model.RobotModel;
import service.RobotSimulateService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToyRobotSimulationApplication {

    public static void main(String[] args) throws IOException {
        RobotSimulateService robotService = new RobotSimulateService();
        int robotCount = 0;
        RobotModel robotModel = null;
        System.out.println(RobotCommonConstants.DISPLAY_MENU);
        while (true) {
            //Read the input commands from console.
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            String input = reader.readLine();
            //validate the input command
            boolean validateCommandResult = robotService.validateRobotCommand(input);
            //Once command validation is successful, implement the input command accordingly.
            if (validateCommandResult) {
               /*Split the input command string and store into array.
                 Use zero index element in array for verifying the input commands type and execute its methods subsequently.*/
                String[] commands = input.split(" ");

                switch (commands[0]) {
                    case "PLACE":
                        robotModel = robotService.placeRobot(commands[1]);
                        robotCount++;
                        //Displaying a message whenever the 1st Robot is placed on table to start the simulation
                        if(robotCount == 1) {
                            System.out.println(RobotCommonConstants.DISPLAY_MENU_AFTER_PLACE);
                        }
                        break;
                    case "MOVE":
                        robotService.moveRobot(robotModel);
                        break;
                    case "LEFT":
                        robotService.moveLeft(robotModel);
                        break;
                    case "RIGHT":
                        robotService.moveRight(robotModel);
                        break;
                    case "REPORT":
                        robotService.report(robotModel);
                        break;
                    case "STOP":
                        System.out.println("Terminating the program!!");
                        System.exit(0);
                        break;

                }
            }else {
                System.out.println("ERROR:: Invalid command.Please try again with the valid commands mentioned in the menu.\n");
            }

        }
    }

}
