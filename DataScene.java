import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a chosen dataset
 */
public class DataScene extends Scene {

    private Bird[] birds; // 1D array of Bird objects

    /** Constructor */
    public DataScene() {
        birds = createBirds();
    }

    /**
     * Returns a 1D array of Bird objects using the txt files
     */
    public Bird[] createBirds() {
        String[] nameArray = FileReader.toStringArray("Name.txt");
        String[] sciNameArray = FileReader.toStringArray("SciName.txt");
        String[] colorArray = FileReader.toStringArray("Color.txt");

        Bird[] tempArray = new Bird[nameArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = new Bird(nameArray[i], sciNameArray[i], colorArray[i]);
        }

        return tempArray;
    }

/*
*Gets a random bird and gets all of its data
*/
  public int randomBird(){
int randomIndex = (int) (Math.random() * birds.length);

    // Get the random Bird object and return its toString representation
    return randomIndex;
      
    }
  
  /*
*Draw the Scene 
*/
  public void drawScene() { 
    int randomBird = randomBird();
    System.out.println("Random bird: \n" + randomBird);
 for (int i = 5; i >= 0; i--) {  
    clear("white"); // Clear the screen with a white background
    
   drawText("-----Random Bird----- ", 90, 45);
    drawText("Name: "+ birds[randomBird].getName(), 30, 100);
    drawText("Scientific Name: "+ birds[randomBird].getSciName(), 30, 150);
    drawText("Color: "+ birds[randomBird].getColor(), 30, 200);
    
    setTextColor(Color.BLACK); // Set text color to black for visibility
    drawText(String.valueOf(i), 200, 300); // Draw the current number
    pause(1); // Pause for 1 second
}

    
  }
}