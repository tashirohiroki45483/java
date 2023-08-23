import java.util.*;

public class Main{
  public static void main(String[] args){
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    Map<Hero, Integer> sub = new HashMap<Hero, Integer>();
    sub.put(h1, 3);
    sub.put(h2, 7);
    for (Hero key : sub.keySet()){
      int value = sub.get(key);
      System.out.println(key.getName() + "が倒した敵＝" + value);
    }
  }
}

public class Hero{
  private String name;
  public Hero(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}