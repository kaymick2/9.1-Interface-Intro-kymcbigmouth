public class Subtract implements Calculator {
  private double x;
  private double y;

  public Subtract(double x, double y){
    this.x=x;
    this.y=y;
  }

  public double getAnswer() {
    return x - y;
  }
}