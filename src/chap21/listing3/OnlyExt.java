package chap21.listing3;

import java.io.*; 
 
public class OnlyExt implements FilenameFilter { 
  String ext; 
 
  public OnlyExt(String ext) { 
    this.ext = "." + ext; 
  } 
 
  public boolean accept(File dir, String name) { 
    return name.endsWith(ext); 
  } 
}
