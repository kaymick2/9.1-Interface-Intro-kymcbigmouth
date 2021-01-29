public class Add implements Calculator {
  private double x;
  private double y;

  public Add(double x, double y){//you have to either use 2 different variable names as shown on the assignment sheet or use this.x=x and y (for each method)
    this.x=x;
    this.y=y;
  }

  public double getAnswer() {
    return x + y;
  }
}