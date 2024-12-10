import org.code.theater.*;
import org.code.media.*;
/**
 * Represents a Bird with a name, scientific name, and a color
 */
public class Bird {

  private String name;     // name of the bird
  private String sciName; //scientific name of the bird
  private String color; // color of the bird

  /** Constructor */
  public Bird( String name, String sciName, String color) {
    this.name = name;
    this.sciName = sciName;
    this.color = color;
  }

  /**
  *Accessor Method for name
  */
  public String getName() {
    return name;
  }
  /**
  *Accessor Method for scientific name
  */
  public String getSciName() {
    return sciName;
  }
  /**
  *Accessor Method for color
  */
  public String getColor() {
    return color;
  }
  
 /*
 *To String Method 
 */
  public String toString() {
    return "Name: "+ name + "\nScientific Name: "+ sciName + "\nColor: "+ color;
  }
  
}