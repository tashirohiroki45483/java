import java.io.*;

public class Main{
  public static void main(String[] args){
    try{
      FileWriter fw = new FileWriter("data.txt");
      fw.write("hello!");
      fw.close();
      throw new Exception(); 
    }catch(Exception e){
      System.out.println("何らかの例外が発生しました");
    }
  }
}