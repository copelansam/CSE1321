class BuildingBlueprint{
    private int stories;
    private int apartments;
    private float occupancy;
    private boolean full;

    BuildingBlueprint(){
        stories = 10;
        apartments = 20;
        occupancy = 1.0f;
        full = true;

    }
    BuildingBlueprint(int a, int b, float c){
        stories = a;
        apartments = b;
        occupancy = c;
        if (occupancy == 1.0f){
            full = true;
        }
        else{
            full = false;
        }

    }

    int storyStat(){
        return stories;
    }

    int apartmentsStat(){
        return apartments;
    }

    int occupancyStat(){
        float rate = occupancy * 100;
        int rateInt = (int) rate;
        return rateInt;
    }

    boolean fullStat(){

        return full;

    }

    void occupancyChange(float a){
        occupancy = a;
    }

    void fullChange(){
        if (occupancy == 1.0f){
            full = true;
        }
        else {
            full = false;
        }
    }


}
public class Lab13A {
    public static void main (String [] args) {
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75f);
        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.storyStat() + " floors, " + buildingOne.apartmentsStat() + " apartments, and is " + buildingOne.occupancyStat() + "% occupied. Full? " + buildingOne.fullStat());
        System.out.println("Building 2 has " + buildingTwo.storyStat() + " floors, " + buildingTwo.apartmentsStat() + " apartments, and is " + buildingTwo.occupancyStat() + "% occupied. Full? " + buildingTwo.fullStat());
        System.out.println();
        System.out.println("Many years pass.");
        System.out.println();
        buildingOne.occupancyChange(0.0f);
        buildingTwo.occupancyChange(1.0f);
        buildingOne.fullChange();
        buildingTwo.fullChange();
        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + buildingOne.storyStat() + " floors, " + buildingOne.apartmentsStat() + " apartments, and is " + buildingOne.occupancyStat() + "% occupied. Full? " + buildingOne.fullStat());
        System.out.println("Building 2 has " + buildingTwo.storyStat() + " floors, " + buildingTwo.apartmentsStat() + " apartments, and is " + buildingTwo.occupancyStat() + "% occupied. Full? " + buildingTwo.fullStat());
        System.out.println();
        System.out.println("Looks like people prefer taller buildings.");
    }
}
