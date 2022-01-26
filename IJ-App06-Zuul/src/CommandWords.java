
/**
 * This contains all the possible command words
 * for the game of Zuul
 *
 * @author Derek Peacock & Nicholas Day & Enoch Jozue Krzok
 * @version 01/01/2022
 */
public enum CommandWords
{
    GO   ("go","Exit location in <direction>"),
    TAKE ("take", "Take <item> from location"),
    USE ("use", "Use Item"),
    LOOK ("look", "Look around, at item"),
    HELP ("help", "List all available commands"),
    QUIT ("quit", "End the game");



    public final String word;
    public final String description;
    
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}
