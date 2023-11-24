package Collection.Comparator;

public class Squirrel {
    private int weight;
    private String Species;

    public Squirrel(int weight, String species) {
        this.weight = weight;
        Species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    @Override
    public String toString() {
        return "Squirrel{" +
                "weight=" + weight +
                ", Species='" + Species + '\'' +
                '}';
    }


}
