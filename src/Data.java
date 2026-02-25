/**
 * This is the Data class that represents a Pokémon with attributes like name, type, HP, attack, defense, and speed. It also includes methods to analyze the data and find insights about the Pokémon.
 * @author Cathy Vo
 * @version 2/25/2026
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
    /**
     * Constructor for the Data class that initializes the attributes of a Pokémon.
     * @param name The name of the Pokémon.
     * @param type1 The primary type of the Pokémon.
     * @param hp The HP (hit points) of the Pokémon.
     * @param attack The attack stat of the Pokémon.
     * @param defense The defense stat of the Pokémon.
     * @param speed The speed stat of the Pokémon.  
     */
    public Data(String name, String type1, int hp, int attack, int defense, int speed) {
        this.name = name;
        this.type1 = type1;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    // TODO: Add getters for attributes you need
    /**
     * Getter for the name of the Pokémon.  
     * @return The name of the Pokémon.
     */
    public String getName() {
        return name;
    }
    /**
     * Getter for the primary type of the Pokémon.  
     * @return The primary type of the Pokémon.
     */
    public String getType1() {
        return type1;
    }
    /**
     * Getter for the HP of the Pokémon.  
     * @return The HP of the Pokémon.
    */
    public int getHp() {
        return hp;
    }
    /**
     * Getter for the attack stat of the Pokémon.
     * @return The attack stat of the Pokémon.
    */
    public int getAttack() {
        return attack;
    }
    /**
     * Getter for the defense stat of the Pokémon.
     * @return The defense stat of the Pokémon.
    */
    public int getDefense() {
        return defense;
    }
    /**
     * Getter for the speed stat of the Pokémon.
     * @return The speed stat of the Pokémon.
    */
    public int getSpeed() {
        return speed;
    }
    // TODO: Add other data analysis methods
    /**
     * Method to calculate the average of the Pokémon's stats (HP, attack, defense, speed).
     * @return The average of the Pokémon's stats.
    */
    public int getAverageStats() {
        return (hp + attack + defense + speed) / 4;
    }
    /**
     * Static method to find the Pokémon with the highest average stats from an array of Data objects.
     * @param pokemon   An array of Data objects representing different Pokémon.
     * @return A string describing the strongest Pokémon and its average stat value.
    */
    public static String getStrongestStat(Data[] pokemon) {
        int highestStats =0;
        String strongest = "";
        for (Data p : pokemon) {
            if (p.getAverageStats() > highestStats) {
                highestStats = p.getAverageStats();
                strongest = p.getName();
            }
        }
        return "The strongest Pokémon is: " + strongest + " with an average stat of: " + highestStats;
    }
    /**
     * Static method to find the Pokémon with the lowest HP from an array of Data objects.
     * @param pokemon   An array of Data objects representing different Pokémon. 
     * @return  A string describing the Pokémon with the lowest HP and its HP value.
    */
    public static String lowestHP (Data[] pokemon) {
        int lowestHP = Integer.MAX_VALUE;
        String weakest = "";
        for (Data p : pokemon) {
            if (p.getHp() < lowestHP) {
                lowestHP = p.getHp();
                weakest = p.getName();
            }
        }
        return "The Pokémon with the lowest HP is: " + weakest + " with an HP of: " + lowestHP;
    }
    /**
     *  Static method to find the fastest Pokémon from an array of Data objects.
     * @param pokemon   An array of Data objects representing different Pokémon.
     * @return  A string describing the fastest Pokémon and its speed value.
    */
    public static String fastestPokemon (Data[] pokemon) {
        int fastest = 0;
        String fastestPokemon = "";
        for (Data p : pokemon) {
            if (p.getSpeed() > fastest) {
                fastest = p.getSpeed();
                fastestPokemon = p.getName();
            }
        }
        return "The fastest Pokémon is: " + fastestPokemon + " with a speed of: " + fastest;
    }
    // TODO: Override toString() to return a readable representation of your object
    /**
     * Overrides the toString() method to provide a readable representation of the Data object, which includes the Pokémon's name, type, HP, attack, defense, and speed.
    */
    @Override
    public String toString() {
        return "Pokemon:" + name + ", Type: " + type1 + ", HP: " + hp + ", Attack: " + attack + ", Defense: " + defense + ", Speed: " + speed;  
    }
}