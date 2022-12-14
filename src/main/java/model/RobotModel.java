package model;

public class RobotModel {

    public int x_co_ordinate;
    public int y_co_ordinate;
    public String direction;

    public RobotModel(int x_co_ordinate, int y_co_ordinate, String direction) {
        this.x_co_ordinate = x_co_ordinate;
        this.y_co_ordinate = y_co_ordinate;
        this.direction = direction;
    }

    public int getX_co_ordinate() {
        return x_co_ordinate;
    }

    public void setX_co_ordinate(int x_co_ordinate) {
        this.x_co_ordinate = x_co_ordinate;
    }

    public int getY_co_ordinate() {
        return y_co_ordinate;
    }

    public void setY_co_ordinate(int y_co_ordinate) {
        this.y_co_ordinate = y_co_ordinate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "RobotModel{" +
                "x_co_ordinate=" + x_co_ordinate +
                ", y_co_ordinate=" + y_co_ordinate +
                ", direction='" + direction + '\'' +
                '}';
    }
}
