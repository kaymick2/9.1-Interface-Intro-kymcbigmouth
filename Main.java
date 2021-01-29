import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the A value: ");
    double z = input.nextDouble();
    System.out.println("Enter a B value:");
    double s = input.nextDouble();
    Calculator mult = new Multiply(z, s);
    System.out.println("multiplication: " + mult.getAnswer());
    Calculator addPog = new Add(z, s);
    System.out.println("addition: " + addPog.getAnswer());
    Calculator subPog = new Subtract(z, s);
    System.out.println("subtraction: " + subPog.getAnswer());
    Calculator divPog = new Divide(z, s);
    System.out.println("division: " + divPog.getAnswer());

  }
}