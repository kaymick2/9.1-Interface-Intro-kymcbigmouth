public class Divide implements Calculator {
  private double x;
  private double y;

  public Divide(double x, double y){
    this.x=x;
    this.y=y;
  }

  public double getAnswer() {
    return x / y;
  }
}