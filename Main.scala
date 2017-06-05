/**
  * Created by Fraser on 05/06/2017.
  */
object Main {

  //Any allows any data type to be passed in
  def displayVariableType(value : Any) = {

    //.getClassTag displays the type of the data
    printf(value.getClass().toString() + "\n")
  }

  def main(args : Array[String]) : Unit = {
    //Double
    displayVariableType(3.14)
    //String
    displayVariableType("Text")
    //Boolean
    displayVariableType(false)
    //Integer
    displayVariableType(3)
  }
}
