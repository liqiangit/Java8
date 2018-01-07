package chapapndxd;
// An AWT-based Applet skeleton. 
import java.awt.*; 
import java.applet.*; 
/* 
<applet code="AppletSkel" width=300 height=100> 
</applet> 
*/ 
 
public class AppletSkel extends Applet { 
  // Called first. 
  public void init() { 
    // initialization 
  } 
 
  /* Called second, after init().  Also called whenever 
     the applet is restarted. */ 
  public void start() { 
    // start or resume execution 
  } 
 
  // Called when the applet is stopped. 
  public void stop() { 
    // suspends execution 
  } 
 
  /* Called when applet is terminated.  This is the last 
     method executed. */ 
  public void destroy() { 
    // perform shutdown activities 
  } 
 
  // Called when an applet's window must be restored. 
  public void paint(Graphics g) { 
    // redisplay contents of window
    g.drawString("An AWT-based Applet Skeleton.", 20, 20); 
  } 
}

