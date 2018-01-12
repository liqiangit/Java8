package chap21.listing04;

// Directory of .HTML files. 
import java.io.*;

import chap21.listing03.OnlyExt;
class DirListOnly { 
  public static void main(String args[]) { 
    String dirname = "/java"; 
    File f1 = new File(dirname); 
    FilenameFilter only = new OnlyExt("html"); 
    String s[] = f1.list(only);
    for (int i=0; i < s.length; i++) { 
      System.out.println(s[i]); 
    } 
  } 
}
