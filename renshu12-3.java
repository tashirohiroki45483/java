public class Main{
  public static void main(String[] args){
    Y[] y = new Y[2];
    Y[0] = new A();
    Y[1] = new B();
    for(Y y : y){
      y.b();
    }
  }
}