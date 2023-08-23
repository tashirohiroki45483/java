public class SuperHero{
  String name = "ミナト";
  int hp = 100;
  boolean flying;
  
  public attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("５ポイントのダメージをあたえた！");
  }
  
  public void run(){
    System.out.println(this.name + " は逃げ出した！")
  }
  
  public void fly(){
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  
  public void land(){
    this.flying = false;
    System.out.println("着地した！");
  }
}