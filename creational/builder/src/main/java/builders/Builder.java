package builders;

import buildings.Building;

public interface Builder {
    Builder withFloorNumber(int floorNumber);

    Builder withWallNumber(int wallNumber);

    Builder isNeedElevator(boolean needElevator);

    Builder withFloorSquare(int floorSquare);

    Builder withFloorHeight(int floorHeight);

    Builder withDoorSpaceNumber(int doorSpaceNumber);

    Building build();
}
