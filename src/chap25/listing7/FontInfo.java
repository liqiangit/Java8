package chap25.listing7;

// Display font info.
import java.awt.event.*;
import java.awt.*;

public class FontInfo extends Frame {

  public FontInfo() {
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void paint(Graphics g) {
    Font f = g.getFont();
    String fontName = f.getName();
    String fontFamily = f.getFamily();
    int fontSize = f.getSize();
    int fontStyle = f.getStyle();

    String msg = "Family: " + fontName;

    msg += ", Font: " + fontFamily;
    msg += ", Size: " + fontSize + ", Style: ";

    if((fontStyle & Font.BOLD) == Font.BOLD)
      msg += "Bold ";
    if((fontStyle & Font.ITALIC) == Font.ITALIC)
      msg += "Italic ";
    if((fontStyle & Font.PLAIN) == Font.PLAIN)
      msg += "Plain ";

    g.drawString(msg, 10, 60);
  }

  public static void main(String[] args) {
    FontInfo appwin = new FontInfo();

    appwin.setSize(new Dimension(300, 100));
    appwin.setTitle("FontInfo");
    appwin.setVisible(true);
  }
}
