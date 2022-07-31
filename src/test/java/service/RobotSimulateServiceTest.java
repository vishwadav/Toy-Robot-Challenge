package service;

import model.RobotModel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class RobotSimulateServiceTest {

    RobotSimulateService roboService = new RobotSimulateService();


    @Test
    public void testPlaceCommandValidationSuccess() {
        Assert.assertTrue(roboService.validateRobotCommand("PLACE 1,1,NORTH"));
    }

    @Test
    public void testPlaceCommandValidationFailure() {
        Assert.assertFalse(roboService.validateRobotCommand("PLACE NORTH 1,1"));
        Assert.assertFalse(roboService.validateRobotCommand("PLACE NORTH 1"));

    }

    @Test
    public void testMoveCommandValidationSuccess() {
        Assert.assertTrue(roboService.validateRobotCommand("MOVE"));

    }

    @Test
    public void testMoveCommandsValidationFailure() {
        Assert.assertFalse(roboService.validateRobotCommand("MOVE LEFT"));
        Assert.assertFalse(roboService.validateRobotCommand(" move"));

    }
    @Test
    public void testLeftCommandValidationSuccess() {
        Assert.assertTrue(roboService.validateRobotCommand("LEFT"));
    }

    @Test
    public void testLeftCommandValidationFailure() {
        Assert.assertFalse(roboService.validateRobotCommand("MOVE LEFT"));
        Assert.assertFalse(roboService.validateRobotCommand("left 1 "));

    }

    @Test
    public void testRightCommandValidationSuccess() {
        Assert.assertTrue(roboService.validateRobotCommand("RIGHT"));

    }

    @Test
    public void testRightCommandValidationFailure() {
        Assert.assertFalse(roboService.validateRobotCommand("MOVE right"));
        Assert.assertFalse(roboService.validateRobotCommand(" RIGHT"));

    }


    @Test
    public void placeRobotTestValidate_X_Position() {
        RobotModel robotModel = new RobotModel(1, 1, "NORTH");
        robotModel = roboService.placeRobot("1,1,NORTH");
        Assert.assertEquals(robotModel.getX_co_ordinate(), 1);

    }

    @Test
    public void placeRobotTestValidate_Y_Position() {
        RobotModel robotModel = new RobotModel(1, 1, "NORTH");
        robotModel = roboService.placeRobot("1,2,NORTH");
        Assert.assertEquals(robotModel.getY_co_ordinate(), 2);

    }

    @Test
    public void placeRobotTestValidate_Direction() {
        RobotModel robotModel = new RobotModel(1, 1, "NORTH");
        robotModel = roboService.placeRobot("1,1,SOUTH");
        Assert.assertEquals(robotModel.getDirection().toString(), "SOUTH");

    }

    @Test
    public void moveRobotNorthSuccess() {
        RobotModel robotModelNorthSuccess = new RobotModel(2, 2, "NORTH");
        roboService.moveRobot(robotModelNorthSuccess);
        Assert.assertEquals(robotModelNorthSuccess.getY_co_ordinate(), 3);
    }


    @Test
    public void moveRobotNorthFailure() {
        RobotModel robotModelNorthFailure = new RobotModel(2, 4, "NORTH");
        roboService.moveRobot(robotModelNorthFailure);
        Assert.assertEquals(robotModelNorthFailure.getY_co_ordinate(), 4);
    }


    @Test
    public void moveRobotSouthSuccess() {
        RobotModel robotModelSouthSuccess = new RobotModel(2, 2, "SOUTH");
        roboService.moveRobot(robotModelSouthSuccess);
        Assert.assertEquals(robotModelSouthSuccess.getY_co_ordinate(), 1);
    }


    @Test
    public void moveRobotSouthFailure() {
        RobotModel robotModelSouthFailure = new RobotModel(2, 0, "SOUTH");
        roboService.moveRobot(robotModelSouthFailure);
        Assert.assertSame(robotModelSouthFailure.getY_co_ordinate(), 0);

    }


    @Test
    public void moveRobotEastSuccess() {
        RobotModel robotModelEastSuccess = new RobotModel(2, 2, "EAST");
        roboService.moveRobot(robotModelEastSuccess);
        Assert.assertEquals(robotModelEastSuccess.getX_co_ordinate(), 3);

    }


    @Test
    public void moveRobotEastFailure() {
        RobotModel robotModelEastFailure = new RobotModel(4, 2, "EAST");
        roboService.moveRobot(robotModelEastFailure);
        Assert.assertSame(robotModelEastFailure.getX_co_ordinate(), 4);
    }

    @Test
    public void moveRobotWestSuccess() {
        RobotModel robotModelWestSuccess = new RobotModel(2, 2, "WEST");
        roboService.moveRobot(robotModelWestSuccess);
        Assert.assertEquals(robotModelWestSuccess.getX_co_ordinate(), 1);
    }


    @Test
    public void moveRobotWestFailure() {
        RobotModel robotModelWestFailure = new RobotModel(0, 2, "WEST");
        roboService.moveRobot(robotModelWestFailure);
        Assert.assertSame(robotModelWestFailure.getX_co_ordinate(), 0);

    }



    @Test
    public void testMoveLeftFromNorth() {
        RobotModel robotModelNorth = new RobotModel(2, 2, "NORTH");
        roboService.moveLeft(robotModelNorth);
        Assert.assertEquals(robotModelNorth.getDirection(), "WEST");
    }

    @Test
    public void testMoveLeftFromSouth() {
        RobotModel robotModelSouth = new RobotModel(2, 2, "SOUTH");
        roboService.moveLeft(robotModelSouth);
        Assert.assertEquals(robotModelSouth.getDirection(), "EAST");
    }

    @Test
    public void testMoveLeftFromEast() {
        RobotModel robotModelEast = new RobotModel(2, 2, "EAST");
        roboService.moveLeft(robotModelEast);
        Assert.assertEquals(robotModelEast.getDirection(), "NORTH");
    }

    @Test
    public void testMoveLeftFromWest() {
        RobotModel robotModelWest = new RobotModel(2, 2, "WEST");
        roboService.moveLeft(robotModelWest);
        Assert.assertEquals(robotModelWest.getDirection(), "SOUTH");
    }


    @Test
    public void testMoveRightFromNorth() {
        RobotModel robotModelNorth = new RobotModel(2, 2, "NORTH");
        roboService.moveRight(robotModelNorth);
        Assert.assertEquals(robotModelNorth.getDirection(), "EAST");
    }

    @Test
    public void testMoveRightFromSouth() {
        RobotModel robotModelSouth = new RobotModel(2, 2, "SOUTH");
        roboService.moveRight(robotModelSouth);
        Assert.assertEquals(robotModelSouth.getDirection(), "WEST");
    }

    @Test
    public void testMoveRightFromEast() {
        RobotModel robotModelEast = new RobotModel(2, 2, "EAST");
        roboService.moveRight(robotModelEast);
        Assert.assertEquals(robotModelEast.getDirection(), "SOUTH");
    }

    @Test
    public void testMoveRightFromWest() {
        RobotModel robotModelWest = new RobotModel(2, 2, "WEST");
        roboService.moveRight(robotModelWest);
        Assert.assertEquals(robotModelWest.getDirection(), "NORTH");
    }

    @Test
    public void testReport() {
        RobotModel robotModel = new RobotModel(2, 2, "WEST");
        roboService.report(robotModel);
    }

}
