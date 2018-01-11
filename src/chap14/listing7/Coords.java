package chap14.listing7;
 
// This class holds an array of coordinate objects. 
class Coords<T extends TwoD> { 
  T[] coords; 
 
  Coords(T[] o) { coords = o; } 
} 
