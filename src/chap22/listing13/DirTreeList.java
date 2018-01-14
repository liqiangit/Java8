package chap22.listing13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class DirTreeList {  
  public static void main(String args[]) {  
    String dirname = "\\MyDir";  
 
    System.out.println("Directory tree starting with " + dirname + ":\n"); 
 
    try { 
      Files.walkFileTree(Paths.get(dirname), new MyFileVisitor()); 
    } catch (IOException exc) { 
      System.out.println("I/O Error"); 
    } 
  } 
}
