package OOP;

//Test Integer
public class TestMyInteger {
 public static void main(String[] args) {
     MyInteger num1 = new MyInteger(17);
     MyInteger num2 = new MyInteger(20);

     System.out.println("num1 value: " + num1.getValue());
     System.out.println("num1 is even? " + num1.isEven());
     System.out.println("num1 is odd? " + num1.isOdd());
     System.out.println("num1 is prime? " + num1.isPrime());

     System.out.println("num2 value: " + num2.getValue());
     System.out.println("num2 is even? " + num2.isEven());
     System.out.println("num2 is odd? " + num2.isOdd());
     System.out.println("num2 is prime? " + num2.isPrime());

     System.out.println("Static isEven(10): " + MyInteger.isEven(10));
     System.out.println("Static isOdd(11): " + MyInteger.isOdd(11));
     System.out.println("Static isPrime(13): " + MyInteger.isPrime(13));

     System.out.println("Static isEven(num1): " + MyInteger.isEven(num1));
     System.out.println("Static isOdd(num2): " + MyInteger.isOdd(num2));

     System.out.println("num1 equals 17? " + num1.equals(17));
     System.out.println("num1 equals num2? " + num1.equals(num2));

     char[] digits = {'1','2','3','4'};
     System.out.println("parseInt(char[]): " + MyInteger.parseInt(digits));

     String str = "5678";
     System.out.println("parseInt(String): " + MyInteger.parseInt(str));
 }
}
