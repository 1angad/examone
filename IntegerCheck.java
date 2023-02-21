import java.util.regex.Pattern;
public class IntegerCheck {
  public static void main(String[] args) {
    String regex = "2000000022l";
    checkIt(regex);
  }
  public static void checkIt(String regex) {
    String intRegex = "(0[xX][0-9a-fA-F]+|0[0-7]*|[1-9][0-9]*)(l|u|I|Ui)?(64)?";
    if (Pattern.matches(intRegex, regex)){
      System.out.println(regex + " is a valid integer.");
    }
    else {
      System.out.println(regex + " is not a valid integer.");
    }
  }
}

  /* Decimal Constants
  int dec_int = 28;
  unsigned dec_uint = 4000000024u;
    long dec_long = 2000000022l;
    /* Octal Constants
    int oct_int = 024;
    unsigned oct_uint = 04000000024u;
    long oct_long = 02000000022l;
    /* Hexadecimal Constants
    int hex_int = 0x2a;
    __int64 hex_i64 = 0x4a44000000000020I64;
    unsigned __int64 hex_ui64 = 0x8a44000000000040Ui64
*/