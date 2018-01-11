package chap27.listing1;
// Load and display an image.
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class SimpleImageLoad extends Frame {
  Image img;

  public SimpleImageLoad() {

    try {
      File imageFile = new File("Lilies.jpg");

      // Load the image.
      img = ImageIO.read(imageFile);
    } catch (IOException exc) {
      System.out.println("Cannot load image file.");
      System.exit(0);
    }
 
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    g.drawImage(img, getInsets().left, getInsets().top, null);
  }

  public static void main(String[] args) {
    SimpleImageLoad appwin = new SimpleImageLoad();

    appwin.setSize(new Dimension(400, 365));
    appwin.setTitle("SimpleImageLoad");
    appwin.setVisible(true);
  } 
}
