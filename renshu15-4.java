import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main{
  public static void main(String[] args){
    //現在の日付をDate型で取得
    Date now = new Date();
    System.out.println(now);
    //取得した日時情報をCalenderにセット
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    System.out.println(c);
    //Calenderから「日」の数値を取得
    int day = c.get(Calendar.DAY_OF_MONTH);
    //取得した値に100を足した値をCalenderの「日」にセット
    c.set(Calendar.DAY_OF_MONTH,day + 100);
    //Calenderの日時情報をDate型に変換
    Date d = c.getTime();
    //SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(d));
  }
}