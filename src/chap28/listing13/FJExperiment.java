package chap28.listing13;
 
// Demonstrate parallel execution.  
class FJExperiment {  
 
  public static void main(String args[]) {  
    int pLevel; 
    int threshold; 
 
    if(args.length !=  2) { 
      System.out.println("Usage: FJExperiment threshold parallism"); 
      return; 
    } 
 
    pLevel = Integer.parseInt(args[0]); 
    threshold = Integer.parseInt(args[1]);   
 
    // These variables are used to time the task. 
    long beginT, endT; 
 
    // Create a task pool.  Notice that the parallelsim level is set. 
    ForkJoinPool fjp = new ForkJoinPool(pLevel); 
 
    double[] nums = new double[1000000]; 
 
    for(int i = 0; i < nums.length; i++) 
      nums[i] = (double) i; 
 
    Transform task = new Transform(nums, 0, nums.length, threshold); 
 
    // Starting timing. 
    beginT = System.nanoTime(); 
 
    // Start the main ForkJoinTask. 
    fjp.invoke(task); 
 
    // End timing. 
    endT = System.nanoTime(); 
 
    System.out.println("Level of parallelism: " + pLevel); 
    System.out.println("Sequential threshold: " + threshold); 
    System.out.println("Elapsed time: " + (endT - beginT) + " ns"); 
    System.out.println(); 
  }  
}
