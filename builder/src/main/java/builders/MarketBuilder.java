package builders;

import buildings.Building;
import buildings.Market;

public class MarketBuilder implements Builder {
    private Market market;

    public MarketBuilder() {
        this.market = new Market();
    }

    @Override
    public Builder withFloorNumber(int floorNumber){
        market.setFloorNumber(floorNumber);
        return this;
    }

    @Override
    public Builder withWallNumber(int wallNumber){
        market.setWallNumber(wallNumber);
        return this;
    }

    @Override
    public Builder isNeedElevator(boolean needElevator){
        market.setNeedElevator(needElevator);
        return this;
    }

    @Override
    public Builder withFloorSquare(int floorSquare){
        market.setFloorSquare(floorSquare);
        return this;
    }

    @Override
    public Builder withFloorHeight(int floorHeight){
        market.setFloorHeight(floorHeight);
        return this;
    }

    @Override
    public Builder withDoorSpaceNumber(int doorSpaceNumber) {
        market.setDoorSpaceNumber(doorSpaceNumber);
        return this;
    }

    @Override
    public Building build() {
        return market;
    }
}
