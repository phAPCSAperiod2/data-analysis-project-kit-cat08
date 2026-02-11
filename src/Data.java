/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class Data {

    // TODO: Add at least 3 private attributes
    // Example:
    private String name;
    private String type1;
    private int hp;
    private int attack;
    private int defense;
    private int speed;



    // TODO: Create a constructor that takes all attributes as parameters
    public Data(String name, String type1, int hp, int attack, int defense, int speed) {
        this.name = name;
        this.type1 = type1;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    // TODO: Add getters for attributes you need
    public String getName() {
        return name;
    }
    public String getType1() {
        return type1;
    }

    public int getHp() {
        return hp;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getSpeed() {
        return speed;
    }
    // TODO: Add other data analysis methods
    public int getAverageStats() {
        return (hp + attack + defense + speed) / 4;
    }
    public String getStrongestStat(Data pokemon) {
        int highestStats =0;
        String strongest = "";
        if (pokemon.getAverageStats() > highestStats) {
            highestStats = pokemon.getAverageStats();
            strongest = pokemon.getName();
        }
        return "The strongest Pokémon is: " + strongest + " with an average stat of: " + highestStats;
    }
    public String lowestHP (Data pokemon) {
        int lowestHP = Integer.MAX_VALUE;
        String weakest = "";
        if (pokemon.getHp() < lowestHP) {
            lowestHP = pokemon.getHp();
            weakest = pokemon.getName();
        }
        return "The Pokémon with the lowest HP is: " + weakest + " with an HP of: " + lowestHP;
    }
    public String fastestPokemon (Data pokemon) {
        int fastest = 0;
        String fastestPokemon = "";
        if (pokemon.getSpeed() > fastest) {
            fastest = pokemon.getSpeed();
            fastestPokemon = pokemon.getName();
        }
        return "The fastest Pokémon is: " + fastestPokemon + " with a speed of: " + fastest;
    }
    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                '}';    

}