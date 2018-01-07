package chap33;
// Now, create a Debug menu that goes under the Options 
// menu bar item.  Use the actions to create the items. 
JMenu jmDebug = new JMenu("Debug"); 
JMenuItem jmiSetBP = new JMenuItem(setAct); 
JMenuItem jmiClearBP = new JMenuItem(clearAct); 
JMenuItem jmiResume = new JMenuItem(resumeAct); 
jmDebug.add(jmiSetBP); 
jmDebug.add(jmiClearBP); 
jmDebug.add(jmiResume); 
jmOptions.add(jmDebug);

