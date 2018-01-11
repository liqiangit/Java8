package chap19.listing16;

// Sort by entire name when last names are equal.
class CompThenByFirstName implements Comparator<String> {
  public int compare(String aStr, String bStr) {
    int i, j;  

    return aStr.compareToIgnoreCase(bStr);  
  }  
}
