package OOP;

//Test program
public class TestMyPoint {
 public static void main(String[] args) {
     MyPoint p1 = new MyPoint(0, 0);
     MyPoint p2 = new MyPoint(10, 30.5);

     System.out.println("Distance (using object method): " + p1.distance(p2));
     System.out.println("Distance (using static method): " + MyPoint.distance(p1, p2));
 }
}