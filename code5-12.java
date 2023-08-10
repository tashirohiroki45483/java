public class main{
  public static void printArray(int[] array){
    for(int element : array){
      System.out.print(element);
    }
  }
  public static void main(String[] args){
    int[] array = {1, 2, 3};
    printArray(array);
  }
}