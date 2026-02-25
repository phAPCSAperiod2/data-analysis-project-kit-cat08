import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {

    public static void main(String[] args) throws IOException {

        // TODO: Update this with your CSV file path
        File file = new File("pokemon(1).csv");
        Scanner scanner = new Scanner(file);
        // TODO: Create an array of Data objects to store data
            Data[] dataList = new Data[151];
            int index = 0; 
        scanner.nextLine(); // Skip header
         // TODO: Read file using Scanner
        // - Skip header if needed
        // - Loop through rows
        // - Split each line by commas
        // - Convert text to numbers when needed
        // - Create new Data objects
        // - Add to your array
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            String name = columns[1];
            String type1 = columns[2];
            int hp = Integer.parseInt(columns[5]);
            int attack = Integer.parseInt(columns[6]);
            int defense = Integer.parseInt(columns[7]);
            int speed = Integer.parseInt(columns[8]);
            dataList[index] = new Data(name, type1, hp, attack, defense, speed);
            index++;
        }
       scanner.close();

        // TODO: Call your analysis methods
        // Example:
        // double maxValue = findMaxValue(dataList);
        // double average = computeAverageValue(dataList);
        for (Data pokemon : dataList) {
            System.out.println(Data.getStrongestStat(pokemon));
        }
        System.out.println("HI");
        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
       


    }


}