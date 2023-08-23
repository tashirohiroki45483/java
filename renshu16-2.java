import java.util.*;

public class Main{
  public static void main(String[] args){
    ArrayList<Hero> heros = new ArrayList<Hero>(); 
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    heros.add(h1);
    heros.add(h2);
    for (Hero h : heros){
      System.out.println(h.getName());
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