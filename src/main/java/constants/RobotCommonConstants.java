package constants;

public class RobotCommonConstants {

    public static final String CAUTION_MESSAGE ="CAUTION:: Robot may fall from table top if you move it in the current direction: ";
    public static final Integer TABLE_MAX_SIZE = 5;
    public static final Integer TABLE_MIN_SIZE = 0;
    public static final String PLACE_COMMAND_REGEX = "^PLACE\\s[0-4],[0-4],(NORTH|SOUTH|EAST|WEST)$";
    public static final String DISPLAY_MENU = "Welcome to the Robot Simulation!! \n" +
            "You can simulate robot using the following commands \n" +
            "1. PLACE X,Y,F --> where X,Y are positions on table top and F is direction(i.e NORTH,EAST,WEST,SOUTH) \n" +
            "2. MOVE    --> moves the robot one step forward in the direction it is facing \n" +
            "3. LEFT    --> rotates the robot in 90 degrees towards left without changing position \n" +
            "4. RIGHT   --> rotates the robot in 90 degrees towards right without changing position \n" +
            "5. REPORT  --> Displays the current position of the robot \n" +
            "6. STOP    --> To Stop and Exit from the program \n\n";
    public static final String DISPLAY_MENU_AFTER_PLACE = "Hurray!!Now you can enjoy simulating your robot using any of the below commands\n" +
            "PLACE X.Y,F \n" +
            "MOVE \n" +
            "LEFT \n" +
            "RIGHT \n" +
            "REPORT \n" +
            "STOP\n";


}
