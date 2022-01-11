package builders;

import buildings.Building;
import buildings.Skyscraper;

public class SkyscraperBuilder implements Builder {
    private Skyscraper skyscraper;

    public SkyscraperBuilder() {
        this.skyscraper = new Skyscraper();
    }

    @Override
    public Builder withFloorNumber(int floorNumber) {
        skyscraper.setFloorNumber(floorNumber);
        return this;
    }

    @Override
    public Builder withWallNumber(int wallNumber) {
        skyscraper.setWallNumber(wallNumber);
        return this;
    }

    @Override
    public Builder isNeedElevator(boolean needElevator) {
        skyscraper.setNeedElevator(needElevator);
        return this;
    }

    @Override
    public Builder withFloorSquare(int floorSquare) {
        skyscraper.setFloorSquare(floorSquare);
        return this;
    }

    @Override
    public Builder withFloorHeight(int floorHeight) {
        skyscraper.setFloorHeight(floorHeight);
        return this;
    }

    @Override
    public Builder withDoorSpaceNumber(int doorSpaceNumber) {
        skyscraper.setDoorSpaceNumber(doorSpaceNumber);
        return this;
    }

    @Override
    public Building build() {
        return skyscraper;
    }
}
