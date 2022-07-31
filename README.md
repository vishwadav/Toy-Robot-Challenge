# Toy-Robot-Challenge
This project simulates a toy robot on a square tabletop of dimensions 5 units x 5 units.

# Description
This application can read the below commands:

1.PLACE X,Y,F --> where X,Y are position coordinates and F is the direction facing(NORTH,SOUTH,EAST,WEST)
  PLACE is always the first command to put the robot on the table and start the simulation.
  Application discards all other commands until a valid PLACE command is issued.
      
2.MOVE --> Moves the robot one step forward in the same direction it is facing
3.LEFT --> Turns the robot 90 degrees towards left from the direction it is facing 
4.RIGHT --> Turns the robot 90 degrees towards right from the direction it is facing
5.REPORT --> Displays the position and direction of the robot
6.STOP --> To terminate the program

# Prerequisites
1. Java 17.0.1
2. Maven 3.8.4

# Build and Run application
1.In home directory m2 folder, add settings.xml file pointing to the public maven repository to download all dependencies required.
2.Run the command 'mvn clean install' to download all libraries/dependencies in the pom.xml.
3.Run the application using ToyRobotSimulationApplication main class

# Locally tested output

# Output 1
Welcome to the Robot Simulation!! 
You can simulate robot using the following commands 
1. PLACE X,Y,F --> where X,Y are positions on table top and F is direction(i.e NORTH,EAST,WEST,SOUTH) 
2. MOVE    --> moves the robot one step forward in the direction it is facing 
3. LEFT    --> rotates the robot in 90 degrees towards left without changing position 
4. RIGHT   --> rotates the robot in 90 degrees towards right without changing position 
5. REPORT  --> Displays the current position of the robot 
6. STOP    --> To Stop and Exit from the program 


PLACE 1,1,NORTH
Hurray!!Now you can enjoy simulating your robot using any of the below commands
PLACE X.Y,F 
MOVE 
LEFT 
RIGHT 
REPORT 
STOP

MOVE
LEFT
REPORT
******ROBOT STATUS REPORT******
Output: 1,2,WEST 

PLACE 3,4,NORTH
MOVE
CAUTION:: Robot may fall from table top if you move it in the current direction:  NORTH
LEFT
MOVE
MOVE
REPORT
******ROBOT STATUS REPORT******
Output: 1,4,WEST 

MOVE
MOVE
CAUTION:: Robot may fall from table top if you move it in the current direction:  WEST
RIGHT
REPORT
******ROBOT STATUS REPORT******
Output: 0,4,NORTH 

# Output 2
Welcome to the Robot Simulation!! 
You can simulate robot using the following commands 
1. PLACE X,Y,F --> where X,Y are positions on table top and F is direction(i.e NORTH,EAST,WEST,SOUTH) 
2. MOVE    --> moves the robot one step forward in the direction it is facing 
3. LEFT    --> rotates the robot in 90 degrees towards left without changing position 
4. RIGHT   --> rotates the robot in 90 degrees towards right without changing position 
5. REPORT  --> Displays the current position of the robot 
6. STOP    --> To Stop and Exit from the program 


MOVE
ERROR:: Invalid command. Please position the robot on table using PLACE command
LEFT
ERROR:: Invalid command. Please position the robot on table using PLACE command
PLACE 1,2
ERROR:: Invalid command.Please try again with the valid commands mentioned in the menu.

PLACE 1,2,SOUTH
Hurray!!Now you can enjoy simulating your robot using any of the below commands
PLACE X.Y,F 
MOVE 
LEFT 
RIGHT 
REPORT 
STOP

RIGHT
REPORT
******ROBOT STATUS REPORT******
Output: 1,2,WEST 
