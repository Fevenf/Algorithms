import java.util.Arrays;

class App {

  static void bubbleSort(int array[]) {
    int size = array.length;
    for (int i = 0; i < (size-1); i++) {
      boolean swapped = false;
      for (int j = 0; j < (size-i-1); j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = true;
        }
      }
      if (!swapped)
        break;
    }
  }
  public static void main(String args[]) {
      
    int[] data = {4, 1, 3, 9, 7};
    App.bubbleSort(data);
    System.out.println(Arrays.toString(data));
  }
}



