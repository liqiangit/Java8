package chap28.listing07;

// Extend Phaser and override onAdvance() so that only a specific 
// number of phases are executed. 
  
import java.util.concurrent.*;  
 
// Extend MyPhaser to allow only a specific number of phases 
// to be executed. 
class MyPhaser extends Phaser { 
  int numPhases; 
 
  MyPhaser(int parties, int phaseCount) { 
    super(parties); 
    numPhases = phaseCount - 1; 
  } 
 
  // Override onAdvance() to execute the specified  
  // number of phases. 
  protected boolean onAdvance(int p, int regParties) { 
    // This println() statement is for illustration only. 
    // Normally, onAdvance() will not display output. 
    System.out.println("Phase " + p + " completed.\n"); 
 
    // If all phases have completed, return true 
    if(p == numPhases || regParties == 0) return true; 
 
    // Otherwise, return false. 
    return false;  
  } 
} 
