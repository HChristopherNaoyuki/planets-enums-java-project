package Solution;

// Enum to represent the Planets in our solar system
enum Planets
{
    // Each planet is given a name and a corresponding number.
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9); // We include Pluto, despite it being debated as a planet, to show inclusion.

    // Each planet has a unique number associated with it.
    int number;

    // Constructor to initialize the planet with its number
    Planets(int number)
    {
        this.number = number; // The constructor assigns the number to the planet.
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // Enum usage: We assign a specific planet (EARTH) to the variable `myPlanets`.
        // Here, we use the Planets enum to assign a value to `myPlanets`.
        Planets myPlanets = Planets.EARTH;

        // Calling the method `canILiveHere` to check if living on the specified planet is possible.
        canILiveHere(myPlanets);
    }

    // Method to check if it's possible to live on a given planet.
    // This method uses the Planets enum type as a parameter.
    static void canILiveHere(Planets myPlanets)
    {
        // Switch statement that checks the specific planet provided as input.
        switch (myPlanets)
        {
            // If the input planet is EARTH, we output a positive message about living there.
            case EARTH:
                System.out.println("You can live here.");
                // Display the number of Earth (which is 3 in our enum).
                System.out.println("Planet #" + myPlanets.number);
                break; // Break out of the switch block once we have processed EARTH.

            // Default case: If it's any planet other than EARTH, output a message saying it's not possible to live there.
            // This case is triggered for all other planets that don't match EARTH.
            default:
                System.out.println("You can not live here.");
                // Display the planet number for the current planet (even though you can't live there).
                System.out.println("Planet #" + myPlanets.number);
                break; // End of switch block.
        }
    }
}
