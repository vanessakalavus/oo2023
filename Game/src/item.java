public class item {
    int xCoordinate;
    int yCoordinate;
    int strength;
    int Durability;
    String name;
//parem klops generate constructor ja siis valin koik
    public item(int strength, int durability, String name,int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight );
        this.strength = strength;
        this.Durability = durability;
        this.name = name;
    }
    private static int getRandomCoordinate(int worldDimension) {
        // castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldDimension - 2) + 1);
        // returni järel tuleb täisarv
    }
}
