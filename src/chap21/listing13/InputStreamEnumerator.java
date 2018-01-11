package chap21.listing13;

// Demonstrate sequenced input. 
 
import java.io.*; 
import java.util.*; 
 
class InputStreamEnumerator implements Enumeration<FileInputStream> { 
  private Enumeration<String> files; 
 
  public InputStreamEnumerator(Vector<String> files) { 
    this.files = files.elements(); 
  } 
 
  public boolean hasMoreElements() { 
    return files.hasMoreElements(); 
  } 
 
  public FileInputStream nextElement() { 
    try { 
      return new FileInputStream(files.nextElement().toString()); 
    } catch (IOException e) { 
      return null; 
    } 
  } 
} 
