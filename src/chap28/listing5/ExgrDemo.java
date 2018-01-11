package chap28.listing5;

// An example of Exchanger. 
 
import java.util.concurrent.Exchanger; 
 
class ExgrDemo { 
  public static void main(String args[]) { 
    Exchanger<String> exgr = new Exchanger<String>(); 
 
    new Thread(new UseString(exgr)).start(); 
    new Thread(new MakeString(exgr)).start(); 
  } 
} 
