package chap21.listing13;
 
class SequenceInputStreamDemo { 
  public static void main(String args[]) { 
    int c; 
    Vector<String> files = new Vector<String>(); 
 
    files.addElement("file1.txt"); 
    files.addElement("file2.txt"); 
    files.addElement("file3.txt"); 
    InputStreamEnumerator ise = new InputStreamEnumerator(files); 
    InputStream input = new SequenceInputStream(ise); 
 
    try { 
      while ((c = input.read()) != -1) 
        System.out.print((char) c); 
    } catch(NullPointerException e) { 
      System.out.println("Error Opening File."); 
    } catch(IOException e) { 
      System.out.println("I/O Error: " + e); 
    } finally { 
      try { 
        input.close(); 
      } catch(IOException e) { 
        System.out.println("Error Closing SequenceInputStream"); 
      } 
    } 
  } 
}
