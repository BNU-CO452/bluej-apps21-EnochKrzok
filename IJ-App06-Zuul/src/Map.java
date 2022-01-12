import java.util.Random;

/**
 * This class is responsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location palmBeach, northBeach, eastBeach, village, meadow, path, dungeonEntrance, forest, valley, rockyMountainPath, mountainPeak, woodedMountainPath, crossroad, treasureHouse, hauntedHouse, sandyBeach;

    private Location currentLocation;

    private Random rand;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
        rand = new Random();
        int n = rand.nextInt(2);
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createPalmBeach();
        createNorthBeach();
        createEastBeach();
        createMeadow();
        createVillage();
        createPath();
        createDungeonEntrance();
        createForest();
        createValley();
        createRockyMountainPath();
        createMountainPeak();
        createWoodedMountainPath();
        createCrossroad();
        createTreasureHouse();
        createHauntedHouse();
        createSandyBeach();
        currentLocation = palmBeach;  // start game palmBeach
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createPalmBeach()
    {
        palmBeach = new Location("outside the main entrance of the university");
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createNorthBeach()
    {
        northBeach = new Location("in the campus pub");
        
        northBeach.setExit("south", palmBeach);
        palmBeach.setExit("north", northBeach);
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createEastBeach()
    {
        eastBeach = new Location("in a lecture theater");
        
        eastBeach.setExit("east", palmBeach);
        palmBeach.setExit("west", eastBeach);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createVillage()
    {
        village = new Location("in the computing admin office");

        village.setExit("south", northBeach);
        northBeach.setExit("north", village);
    }

    /**
     * Create the office linked to the lab
     */
    private void createMeadow()
    {
        meadow = new Location("in the computing admin office");

        meadow.setExit("south", eastBeach);
        eastBeach.setExit("north", meadow);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createPath()
    {
        // create the Locations
        path = new Location("in a computing lab");
        
        path.setExit("west", village);
        village.setExit("east", path);
        
        path.setExit("south", meadow);
        meadow.setExit("north", path);
    }

    /**
     * Create the office linked to the lab
     */
    private void createDungeonEntrance()
    {
        dungeonEntrance = new Location("in the computing admin office");

        dungeonEntrance.setExit("west", path);
        path.setExit("east", dungeonEntrance);
    }

    /**
     * Create the office linked to the lab
     */
    private void createForest()
    {
        forest = new Location("in the computing admin office");

        forest.setExit("west", dungeonEntrance);
        dungeonEntrance.setExit("east", forest);
    }

    /**
     * Create the office linked to the lab
     */
    private void createValley()
    {
        valley = new Location("in the computing admin office");

        valley.setExit("west", forest);
        forest.setExit("east", valley);
    }

    /**
     * Create the office linked to the lab
     */
    private void createRockyMountainPath()
    {
        rockyMountainPath = new Location("in the computing admin office");

        rockyMountainPath.setExit("west", valley);
        valley.setExit("east", rockyMountainPath);
    }

    /**
     * Create the office linked to the lab
     */
    private void createMountainPeak()
    {
        mountainPeak = new Location("in the computing admin office");

        mountainPeak.setExit("north", rockyMountainPath);
        rockyMountainPath.setExit("south", mountainPeak);
    }

    /**
     * Create the office linked to the lab
     */
    private void createWoodedMountainPath()
    {
        woodedMountainPath = new Location("in the computing admin office");

        woodedMountainPath.setExit("north", mountainPeak);
        mountainPeak.setExit("south", woodedMountainPath);
    }

    /**
     * Create the office linked to the lab
     */
    private void createCrossroad()
    {
        crossroad = new Location("in the computing admin office");

        crossroad.setExit("north", woodedMountainPath);
        woodedMountainPath.setExit("south", crossroad);
    }

    /**
     * Create the office linked to the lab
     */
    private void createTreasureHouse()
    {
        treasureHouse = new Location("in the computing admin office");

        if (n==0)
        {
            treasureHouse.setExit("north", crossroad);
            crossroad.setExit("south", treasureHouse);
            treasureHouse.setExit("east", sandyBeach);
            sandyBeach.setExit("west", treasureHouse);
        }
        else
        {
            treasureHouse.setExit("west", crossroad);
            crossroad.setExit("east", treasureHouse);
            treasureHouse.setExit("south", sandyBeach);
            sandyBeach.setExit("north", treasureHouse);
        }
    }

    /**
     * Create the office linked to the lab
     */
    private void createHauntedHouse()
    {
        hauntedHouse = new Location("in the computing admin office");

        if (n==1)
        {
            hauntedHouse.setExit("north", crossroad);
            crossroad.setExit("south", hauntedHouse);
            treasureHouse.setExit("east", sandyBeach);
            sandyBeach.setExit("west", treasureHouse);
        }
        else
        {
            hauntedHouse.setExit("west", crossroad);
            crossroad.setExit("east", hauntedHouse);
            treasureHouse.setExit("south", sandyBeach);
            sandyBeach.setExit("north", treasureHouse);
        }
    }

    /**
     * Create the office linked to the lab
     */
    private void createSandyBeach()
    {
        sandyBeach = new Location("in the computing admin office");
    }
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
