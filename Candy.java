/**
* @author Suraj Shah, Tiernan Hull, Lou Rahm
* @version 2020-10-27
* This program has 2 constructors that have paramaters that print out Candy name. 
* @return cName
*/

//new class called candy
class Candy {
  private String cName;
  //private class
  //defalut constructor
  Candy() {
    cName = "";
  }

  //  2nd constructor 
  Candy(String aName) {
    cName = aName;
  }
  //  mutator
  void setName(String theName) {
    cName = theName;
  }

  //  accessor
  String getName() {
    return cName;
  }

  //  print candy's name
  void print() {
    System.out.println(cName);
  }
}




