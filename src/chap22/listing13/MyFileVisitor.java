package chap22.listing13;

// A simple example that uses walkFileTree( ) to display a directory tree. 
  
import java.io.*;  
import java.nio.file.*;  
import java.nio.file.attribute.*;  
 
// Create a custom version of SimpleFileVisitor that overrides 
// the visitFile( ) method. 
class MyFileVisitor extends SimpleFileVisitor<Path> { 
  public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) 
    throws IOException 
  { 
    System.out.println(path); 
    return FileVisitResult.CONTINUE; 
  } 
} 
