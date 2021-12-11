package inheritanceattributes.building;

public class BuildingMain {

    public static void main(String[] args) {

        Building building = new Building("épület", 1050.5, 3);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        SchoolBuilding schoolBuilding = new SchoolBuilding("iskola", 2674.4, 3, 15);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
