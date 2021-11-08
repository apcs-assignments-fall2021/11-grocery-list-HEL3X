import java.util.Arrays;

public class GroceryList {
    private String[] arr;

    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        arr = new String[10];
    }
    int count = 0;
    // Adds an item to the grocery list
    public void add(String item) {
        if (count < 10){
            arr[count] = item;
            count++;
        }else{
            System.out.println("Error; Cannot list more than 10 items.");
        }
    }

    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        for (int i = 0; i < 10; i++) {
            if (arr[i]==item){
                arr[i] = null;
            }
        }
    }

    //public String[] printOut(){
      //  int numOfNonNull = 0;
        //String[] arrOut = new String[numOfNonNull];
        //for (int i = 0; i < 10; i++) {
          //  if (arr[i] == "null"){
            //    numOfNonNull++;
            //}else{
              //  arrOut[numOfNonNull] = arr[i];
            //}
        //}
        //return arrOut;
    //}
    
    public static String printOut(String[] arr){
        int count = 0;
        int listNum = 0;
        for (int i = 0; i < 10; i++) {
            if(arr[i] == null){
                count++;
            }
        }
        String[] arrOut = new String[10-count];
        for (int i = 0; i < 10; i++) {
            if(arr[i] != null){
                arrOut[listNum] = arr[i];
                listNum++;
            }
        }
        return Arrays.toString(arrOut);
    }
    
    
    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {
        return "Grocery List: " + printOut(arr);
    }
}
