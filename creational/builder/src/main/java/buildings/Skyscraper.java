package buildings;

public class Skyscraper implements Building {
    int floorNumber;
    int wallNumber;
    boolean needElevator;
    int floorSquare;
    int floorHeight;
    int doorSpaceNumber;

    @Override
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public void setWallNumber(int wallNumber) {
        this.wallNumber = wallNumber;
    }

    @Override
    public void setNeedElevator(boolean needElevator) {
        this.needElevator = needElevator;
    }

    @Override
    public void setFloorSquare(int floorSquare) {
        this.floorSquare = floorSquare;
    }

    @Override
    public void setFloorHeight(int floorHeight) {
        this.floorHeight = floorHeight;
    }

    @Override
    public void setDoorSpaceNumber(int doorSpaceNumber) {
        this.doorSpaceNumber = doorSpaceNumber;
    }

    @Override
    public void print() {
        System.out.println("Skyscraper{" +
                "floorNumber=" + floorNumber +
                ", wallNumber=" + wallNumber +
                ", needElevator=" + needElevator +
                ", floorSquare=" + floorSquare +
                ", floorHeight=" + floorHeight +
                ", doorSpaceNumber=" + doorSpaceNumber +
                '}');
    }
}
