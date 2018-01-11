package chap28.listing9;

// An example that uses a Callable. 
 
import java.util.concurrent.*; 
 
class CallableDemo { 
  public static void main(String args[]) { 
    ExecutorService es = Executors.newFixedThreadPool(3); 
    Future<Integer> f; 
    Future<Double> f2; 
    Future<Integer> f3; 
 
    System.out.println("Starting"); 
 
    f = es.submit(new Sum(10)); 
    f2 = es.submit(new Hypot(3, 4)); 
    f3 = es.submit(new Factorial(5)); 
 
    try { 
      System.out.println(f.get()); 
      System.out.println(f2.get()); 
      System.out.println(f3.get()); 
    } catch (InterruptedException exc) { 
      System.out.println(exc); 
    } 
    catch (ExecutionException exc) { 
      System.out.println(exc); 
    } 
 
    es.shutdown(); 
    System.out.println("Done"); 
  } 
} 
