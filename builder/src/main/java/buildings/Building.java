package buildings;

public interface Building {
    void setFloorNumber(int floorNumber);

    void setWallNumber(int wallNumber);

    void setNeedElevator(boolean needElevator);

    void setFloorSquare(int floorSquare);

    void setFloorHeight(int floorHeight);

    void setDoorSpaceNumber(int doorSpaceNumber);

    void print();
}
