public class Hero{
  String name = "ミナト";
  int hp = 100;
  
  public attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("５ポイントのダメージをあたえた！");
  }
  public void run(){
    System.out.println(this.name + " は逃げ出した！")
  }
}