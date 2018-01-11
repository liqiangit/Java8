package chap16.listing09;

// Module definition for appfuncs. 
module appfuncs { 
  // Exports the package appfuncs.simplefuncs. 
  exports appfuncs.simplefuncs; 
 
  // Requires appsupport and makes it public 
  requires transitive appsupport; 
}
