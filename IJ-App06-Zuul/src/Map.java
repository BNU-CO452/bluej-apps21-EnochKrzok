import java.util.Random;

/**
 * This class is responsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Village]    <---->   [Path] <----> [Dungeon Entrance] <----> [Forest] <----> [Valley] <----> [Rocky Mountain Path]
 *      |                   |                                                                               |
 *[North Beach]         [Meadow]                                                                      [Mountain Peak]
 *      |                  |                                                                                |
 *[Palm Beach] <----> [East Beach]                                                               [Wooded Mountain Path]
 *                                                                                                          |
 *                                                                                                     [Crossroad] <----> [?]
 *                                                                                                          |              |
 *                                                                                                        [?] <----> [Sandy Beach]
 *
 * @author Derek Peacock and Nicholas Day & Enoch Jozue Krzok
 * @version 01/01/2022
 */
public class Map
{
    // Need to add a list of exits
    
    public Location palmBeach, northBeach, eastBeach, village, meadow, path, dungeonEntrance, forest, valley, rockyMountainPath, mountainPeak, woodedMountainPath, crossroad, treasureHouse, hauntedHouse, sandyBeach;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
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
        palmBeach = new Location("on a beach with some palms");

        palmBeach.setItem(new Item("snack","adds 100 hp"));
        palmBeach.setItem(new Item("plank1","help you build raft"));
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createNorthBeach()
    {
        northBeach = new Location("on a beach to the north");
        
        northBeach.setExit("south", palmBeach);
        palmBeach.setExit("north", northBeach);

    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createEastBeach()
    {
        eastBeach = new Location("on a beach to the east");
        
        eastBeach.setExit("east", palmBeach);
        palmBeach.setExit("west", eastBeach);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createVillage()
    {
        village = new Location("in a village");

        village.setExit("south", northBeach);
        northBeach.setExit("north", village);

        village.setItem(new Item("map ","\n" +
                "  [Village]    <---->   [Path] <----> [Dungeon Entrance] <----> [Forest] <----> [Valley] <----> [Rocky Mountain Path]\n" +
                "       |                   |                                                                               |\n" +
                " [North Beach]         [Meadow]                                                                      [Mountain Peak]\n" +
                "      |                  |                                                                                |\n" +
                " [Palm Beach] <----> [East Beach]                                                               [Wooded Mountain Path]\n" +
                "                                                                                                           |\n" +
                "                                                                                                      [Crossroad] <----> [?]\n" +
                "                                                                                                           |              |\n" +
                "                                                                                                         [?] <----> [Sandy Beach]"));
    }

    /**
     * Create the office linked to the lab
     */
    private void createMeadow()
    {
        meadow = new Location("in a meadow");

        meadow.setExit("south", eastBeach);
        eastBeach.setExit("north", meadow);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createPath()
    {
        // create the Locations
        path = new Location("on a path");
        
        path.setExit("west", village);
        village.setExit("east", path);
        
        path.setExit("south", meadow);
        meadow.setExit("north", path);

        path.setItem(new Item("glasses","you can see the enemy's health and strength"));
    }

    /**
     * Create the office linked to the lab
     */
    private void createDungeonEntrance()
    {
        dungeonEntrance = new Location("at a dungeon entrance but the entrance seems locked");

        dungeonEntrance.setExit("west", path);
        path.setExit("east", dungeonEntrance);
    }

    /**
     * Create the office linked to the lab
     */
    private void createForest()
    {
        forest = new Location("in a forest");

        forest.setExit("west", dungeonEntrance);
        dungeonEntrance.setExit("east", forest);

        forest.setItem(new Item("plank2","help you build raft"));
    }

    /**
     * Create the office linked to the lab
     */
    private void createValley()
    {
        valley = new Location("in a valley");

        valley.setExit("west", forest);
        forest.setExit("east", valley);
    }

    /**
     * Create the office linked to the lab
     */
    private void createRockyMountainPath()
    {
        rockyMountainPath = new Location("on a rockey path");

        rockyMountainPath.setExit("west", valley);
        valley.setExit("east", rockyMountainPath);
    }

    /**
     * Create the office linked to the lab
     */
    private void createMountainPeak()
    {
        mountainPeak = new Location("on the mountain peak");

        mountainPeak.setExit("north", rockyMountainPath);
        rockyMountainPath.setExit("south", mountainPeak);

        mountainPeak.setItem(new Item("key","A mysterious key"));
    }

    /**
     * Create the office linked to the lab
     */
    private void createWoodedMountainPath()
    {
        woodedMountainPath = new Location("in a wooded rocky place");

        woodedMountainPath.setExit("north", mountainPeak);
        mountainPeak.setExit("south", woodedMountainPath);

        woodedMountainPath.setItem(new Item("plank3","help you build raft"));
    }

    /**
     * Create the office linked to the lab
     */
    private void createCrossroad()
    {
        crossroad = new Location("on a crossroad (pick correctly or you die)");

        crossroad.setExit("north", woodedMountainPath);
        woodedMountainPath.setExit("south", crossroad);
    }

    /**
     * Create the office linked to the lab
     */
    private void createTreasureHouse()
    {
        treasureHouse = new Location("in a treasure house");

        treasureHouse.setItem(new Item("plank4","help you build raft"));
    }

    /**
     * Create the office linked to the lab
     */
    private void createHauntedHouse()
    {
        hauntedHouse = new Location("dead");
    }

    /**
     * Create the office linked to the lab
     */
    private void createSandyBeach()
    {
        sandyBeach = new Location("on a sandy beach");
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n==0)
        {
            crossroad.setExit("south", treasureHouse);
            crossroad.setExit("east", hauntedHouse);
            treasureHouse.setExit("north", crossroad);
            treasureHouse.setExit("east", sandyBeach);
            hauntedHouse.setExit("west", crossroad);
            hauntedHouse.setExit("south", sandyBeach);
            sandyBeach.setExit("west", treasureHouse);
            sandyBeach.setExit("north", treasureHouse);
        }
        else
        {
            crossroad.setExit("east", treasureHouse);
            crossroad.setExit("south", hauntedHouse);
            treasureHouse.setExit("west", crossroad);
            treasureHouse.setExit("south", sandyBeach);
            hauntedHouse.setExit("north", crossroad);
            hauntedHouse.setExit("east", sandyBeach);
            sandyBeach.setExit("north", treasureHouse);
            sandyBeach.setExit("west", treasureHouse);
        }
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
