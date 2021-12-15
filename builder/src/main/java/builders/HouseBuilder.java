package builders;

import buildings.Building;
import buildings.House;

public class HouseBuilder implements Builder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    @Override
    public Builder withFloorNumber(int floorNumber) {
        house.setFloorNumber(floorNumber);
        return this;
    }

    @Override
    public Builder withWallNumber(int wallNumber) {
        house.setWallNumber(wallNumber);
        return this;
    }

    @Override
    public Builder isNeedElevator(boolean needElevator) {
        house.setNeedElevator(needElevator);
        return this;
    }

    @Override
    public Builder withFloorSquare(int floorSquare) {
        house.setFloorSquare(floorSquare);
        return this;
    }

    @Override
    public Builder withFloorHeight(int floorHeight) {
        house.setFloorHeight(floorHeight);
        return this;
    }

    @Override
    public Builder withDoorSpaceNumber(int doorSpaceNumber) {
        house.setDoorSpaceNumber(doorSpaceNumber);
        return this;
    }

    @Override
    public Building build() {
        return house;
    }
}
