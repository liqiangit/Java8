package chap21.listing23;

// A serialization demo. 
 
import java.io.*; 
 
public class SerializationDemo { 
  public static void main(String args[]) { 
 
    // Object serialization 
 
    try ( ObjectOutputStream objOStrm = 
            new ObjectOutputStream(new FileOutputStream("serial")) ) 
    { 
      MyClass object1 = new MyClass("Hello", -7, 2.7e10); 
      System.out.println("object1: " + object1); 
 
      objOStrm.writeObject(object1); 
    } 
    catch(IOException e) { 
      System.out.println("Exception during serialization: " + e); 
    } 
 
    // Object deserialization 
 
    try ( ObjectInputStream objIStrm = 
            new ObjectInputStream(new FileInputStream("serial")) ) 
    { 
      MyClass object2 = (MyClass)objIStrm.readObject(); 
      System.out.println("object2: " + object2); 
    } 
    catch(Exception e) { 
      System.out.println("Exception during deserialization: " + e); 
    } 
  } 
} 
