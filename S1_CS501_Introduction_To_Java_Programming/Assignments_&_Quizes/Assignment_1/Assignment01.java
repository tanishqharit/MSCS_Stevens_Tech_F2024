package Assignments.Assignment_1;
/*
* Assignment01
* Name: Tanishq Harit
* CWID: 20031876
*/
public class Assignment01 {
  public static double calculateTriArea(double a, double b, double c) {
    double s = (a + b + c)/2.0;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return area;
  }

  public static String switchCase(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);

      if (Character.isLowerCase(ch)){
        result += Character.toUpperCase(ch);
      }
      else if (Character.isUpperCase(ch)) {
        result += Character.toLowerCase(ch);
      }
      else{
        result += ch;
      }
    }
    return result;
  }

  public static String reverse(String str) {
    String result = "";
    for (int i = str.length() - 1; i >= 0; i--){
      result += str.charAt(i);
    }
    return result;
  }

  public static long fib(int ith) {
    long x = 0, y = 1;

    for (int i = 0; i < ith; i++){
      long temp = x + y;
      x = y;
      y = temp;
    }
    return x;
  }

  public static void main(String[] args) {
    
    System.out.println(calculateTriArea(3, 3, 3));
    System.out.println(calculateTriArea(3, 4, 3));
    System.out.println(calculateTriArea(3, 4, 5));

    System.out.println(switchCase("abc"));
    System.out.println(switchCase("ABC"));
    System.out.println(switchCase("123"));

    System.out.println(reverse("Tanishq"));
    System.out.println(reverse("20031876"));

    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
    System.out.println(fib(5));
    System.out.println(fib(10));
  }
}
