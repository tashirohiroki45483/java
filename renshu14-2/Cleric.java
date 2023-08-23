public class Cleric{
  String name;
  int hp = 50;
  static final int MAXHP = 50;
  int mp = 10;
  static final int MAXMP = 10;
  
  public void seilAid(){
    System.out.println(this.name + "は、セルフエイドを唱えた!");
    this.mp -= 5;
    this.hp = this.MAXHP;
    System.out.println(this.name + "のHPが最大まで回復");
  }
  public int pray(int sec){
    System.out.println(this.name + "は、" + sec + "秒祈った！");
    int r = new java.util.Random().nextInt(3);
    if (this.mp + sec + r > this.MAXMP){
      this.mp = this.MAXMP;
      System.out.println(this.name + "のMPが最大まで回復");
    }else{
      this.mp = this.mp + sec + r;
      System.out.println(this.name + "のMPが" + (sec + r) + "回復");
    }
    return r;
  }
}