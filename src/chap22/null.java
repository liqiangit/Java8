package chap22;
for(int h=0; h < 3; h++) { 
  // Write some bytes to the buffer. 
  for(int i=0; i<26; i++) 
    mBuf.put((byte)('A' + i)); 
 
  // Rewind the buffer so that it can be written. 
  mBuf.rewind(); 
 
  // Write the buffer to the output file. 
  fChan.write(mBuf); 
 
  // Rewind the buffer so that it can be written to again. 
  mBuf.rewind(); 
}

