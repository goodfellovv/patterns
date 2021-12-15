import builders.HouseBuilder;
import builders.MarketBuilder;
import builders.SkyscraperBuilder;
import buildings.Building;

public class Main {
    public static void main(String[] args) {
        Building house = new HouseBuilder()
                .withDoorSpaceNumber(2)
                .isNeedElevator(false)
                .withFloorHeight(3)
                .withFloorSquare(100)
                .withWallNumber(10)
                .withFloorNumber(2)
                .build();
        house.print();

        Building market = new MarketBuilder()
                .withDoorSpaceNumber(6)
                .isNeedElevator(false)
                .withFloorHeight(5)
                .withFloorSquare(1000)
                .withWallNumber(4)
                .withFloorNumber(1)
                .build();
        market.print();

        Building skyscraper = new SkyscraperBuilder()
                .withDoorSpaceNumber(2)
                .isNeedElevator(true)
                .withFloorHeight(3)
                .withFloorSquare(400)
                .withWallNumber(500)
                .withFloorNumber(100)
                .build();
        skyscraper.print();
    }
}
