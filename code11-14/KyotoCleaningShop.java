public class KyotoCleaningShop implements CleaningService{
  String ownerName;
  String address;
  String phone;
  //シャツを洗う
  public Shirt washShirt(Shirt s){
    //大型洗濯機１５分
    return s;
  }
  //タオルを洗う
  public Towl washTowl(Towl t){
    //大型洗濯機１０ 分
    return t;
  }
  //コートを洗う
  public Coat washCoat(Coat c){
    //ドライ２０分
    return c;
  }
}