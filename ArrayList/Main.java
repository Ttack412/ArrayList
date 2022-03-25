import java.util.*;

class Main {
  public static void main(String[] args) {
    
    // 1. Follow along through the code and finish the code using the instructions starting at step 2!
    
    // Arraylists are created using
    ArrayList<String> instruments = new ArrayList<>();

    // You can create a string with a name then add it to the arraylist.
    String drums = "Drums";
    instruments.add(drums);
    String violin = "Violin";
    instruments.add(violin);

    // You can also create the string while adding it to the arraylist as well
    instruments.add("Guitar");
    instruments.add(new String("Piano"));

    // You can loop through the arraylist using a for each loop.
    for (String s : instruments){
      System.out.println(s);
    }

    // You can also use a regular for loop with the size of the arraylist as the ending condition.

    for (int i = 0; i < instruments.size(); i++){
      System.out.println(instruments.get(i));
    }

    // You can sort the arraylist into alphabetical order using the collections sort method. It sorts numbers into ascending order as well.

    Collections.sort(instruments);

    for (String s : instruments){
      System.out.println(s);
    }

    // You can use other data types as well. As long as they are not in their primitive form.

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(9);
    numbers.add(2);
    Collections.sort(numbers);
    for (Integer n : numbers){
      System.out.println(n);
    }

    // 2. Now create an arraylist of your own and fill it with the following string colors: Red, Green, Blue.
    ArrayList<String> myColors = new ArrayList<>();

    myColors.add("Red");
    myColors.add("Green");
    myColors.add("Blue");

    // 3. Sort the arraylist and using a loop print out each string on a new line!

    Collections.sort(myColors);

    for(int i = 0; i < myColors.size(); i++)
      {
        System.out.println(myColors.get(i));
      }
        

    // 4. Now use a regular for loop and print out each value in the new arraylist backwards.
    for(int i = myColors.size() - 1; i >= 0; i--)
      {
        System.out.println(myColors.get(i));
      }

    
  }
}