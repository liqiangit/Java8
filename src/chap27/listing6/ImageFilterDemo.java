package chap27.listing6;

// Demonstrate image filters.
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
import java.lang.reflect.*;

public class ImageFilterDemo extends Frame implements ActionListener {
  Image img;
  PlugInFilter pif;
  Image fimg;
  Image curImg;
  LoadedImage lim;
  Label lab;
  Button reset;

  // Names of the filters.
  String[] filters = { "Grayscale", "Invert", "Contrast",
                       "Blur", "Sharpen" };

  public ImageFilterDemo() {
    Panel p = new Panel();
    add(p, BorderLayout.SOUTH);

    // Create Reset button.
    reset = new Button("Reset");
    reset.addActionListener(this);
    p.add(reset);

    // Add the filter buttons.
    for(String fstr: filters) {
      Button b = new Button(fstr);
      b.addActionListener(this);
      p.add(b);
    }

    // Create the top label.    
    lab = new Label("");
    add(lab, BorderLayout.NORTH);

    // Load the image.
    try {
      File imageFile = new File("Lilies.jpg");

      // Load the image.
      img = ImageIO.read(imageFile); 
    } catch (IOException exc) {
      System.out.println("Cannot load image file.");
      System.exit(0);
    }

    // Get a LoadedImage and add it to the center.      
    lim = new LoadedImage(img);
    add(lim, BorderLayout.CENTER);   

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent ae) {
    String a = "";

    try {
      a = ae.getActionCommand();
      if (a.equals("Reset")) {
        lim.set(img);
        lab.setText("Normal");
      }
      else {
        // Get the selected filter.
        pif = (PlugInFilter)
                (Class.forName(a)).getConstructor().newInstance();
        fimg = pif.filter(this, img);
        lim.set(fimg);
        lab.setText("Filtered: " + a);
      }
      repaint();
    } catch (ClassNotFoundException e) {
      lab.setText(a + " not found");
      lim.set(img);
      repaint();
    } catch (InstantiationException e) {
      lab.setText("could't new " + a);
    } catch (IllegalAccessException e) {
      lab.setText("no access: " + a);
    } catch (NoSuchMethodException | InvocationTargetException e) {
      lab.setText("Filter creation error: " + e);
    } 
  } 

  public static void main(String[] args) {
    ImageFilterDemo appwin = new ImageFilterDemo();

    appwin.setSize(new Dimension(420, 420));
    appwin.setTitle("ImageFilterDemo");
    appwin.setVisible(true);
  } 
}
