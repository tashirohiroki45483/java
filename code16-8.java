import java.util.*;

public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ミナト";
    List<Hero> list = new ArrayList<Hero>();
    list.add(h);
    h.name = "スガワラ";
    System.out.println(list.get(0).name);
  }
}

public class Hero{
  public String name;
}
