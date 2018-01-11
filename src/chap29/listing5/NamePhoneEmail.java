package chap29.listing5;

// Use map() to create a new stream that contains only 
// selected aspects of the original stream. 
 
import java.util.*; 
import java.util.stream.*; 
 
class NamePhoneEmail { 
  String name;   
  String phonenum; 
  String email; 
 
  NamePhoneEmail(String n, String p, String e) { 
    name = n; 
    phonenum = p; 
    email = e; 
  } 
} 
