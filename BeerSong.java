/**
 * CSE 337 - Homework 2 - "Configuration Management"
 * 
 * In this file you will find the one-hit-wonder "99 Bottles of Beer" song.
 *
 * @author Patric Abbo
 */
public class BeerSong {

    /**
     * Main method, point of entry when running the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ninetyNineBottlesOfBeer();
    }
    /**
     * The following function prints the song.
     */
    private static void ninetyNineBottlesOfBeer()
    {
        for (int i = 99; i > 0; i--) {
            // Get the current bottle's number as a string.
            String current = getBottleString(i);
            // Get the next bottle's string.
            String next = getBottleString(i - 1);
            // Print the song.
            System.out.println(current + " of beer on the wall, " + current + " of beer");
            System.out.println("take one down, pass it around, " + next + " of beer on the wall.");
        }
    }

    /**
     * This function converts the number of beers into a string for the song.
     * @param beerCount The number of beers.
     * @return A string with regards to how many bottles of beer are left.
     */
    private static String getBottleString(int beerCount)
    {
        return beerCount == 0 ? "no more bottles" : String.format("%d bottle%s", beerCount, beerCount > 1 ? "s" : "");
    }
}