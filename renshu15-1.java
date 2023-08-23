public class Main{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 100; i++){
      int f = 0;
      f = i + 1;
      sb.append(f + ",");
    }
    System.out.println(sb);
    String[] a = sb.toString().split("[,]");
    for(String b : a){
      System.out.print(b);
    }
  }
}