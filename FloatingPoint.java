import java.util.regex.Pattern;

public class FloatingPoint {
  public static void main(String[] args) {
    // True means valid floating point
    // Flase means invalid floating point
    String pattern = "25E-4";
    checkIt(pattern);
    /*"15.75L"));
    "1.575E1"));
    "1575e-2"));
    "-2.5e-3F"));
    "25E-4"));*/
  }

  public static void checkIt(String s) {
    String floatRegex = "(-|\\+)?[0-9]+([.]([0-9]+))*([eE]?-?[0-9]+[LlFf]?)";

    if ((s.contains("L") || s.contains("l") || s.contains("F") || s.contains("f") || s.contains("e") || s.contains("E")) && Pattern.matches(floatRegex, s)){
      System.out.println( s + " is a valid float");
    } else {
      System.out.println( s + " is an invalid float");
    }

  }

}
