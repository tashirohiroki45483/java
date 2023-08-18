public class Wand{
  private String name;
  private double power;
  public String getName(){
    return this.name;
  }
  public String setName(String name){
    if(name == null){
      throw new IllegalArgumentException ("名前がnullである。処理を中断。");
    }
    if(name.length() < 3){
      throw new IllegalArgumentException ("名前が3文字より少ない。処理を中断。");
    }
    this.name = name;
  }
  public double getPower(){
    return this.power;
  }
  public void setPower(double power){
    if(power == null){
      throw new IllegalArgumentException ("powerがnullである。処理を中断。");
    }
    if(power < 0.5 || power > 100.0 ){
      throw new IllegalArgumentException ("powerが0.5以下もしくは、100以上である。処理を中断。");
    }
    this.power = power;
  }
}