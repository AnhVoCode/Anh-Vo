import java.util.ArrayList;

public class IntegerSet {
    //fields
    ArrayList<Integer> nums;
    int size =0;

    //Constructor
    IntegerSet(){
        nums = new ArrayList<>();
    }

    //Methods

    //Requires: int
    //Modifies: this
    //Effects: insert integer into the set unless the number is already there
    public void insert(Integer num){
        if (!nums.contains(num)){
            nums.add(num);
            size++;
        }
        else{
            System.out.println("The number is already there");
        }
    }

    //Requires: int
    //Modifies: this
    //Effects: remove integer from the set unless the number is not there
    public void remove(Integer num){
        if (nums.contains(num)){
            nums.remove(num);
            size--;
        }
        else {
            System.out.println("The number is not there");
        }
    }
    public int size(){
        return size;
    }
    public boolean contain(Integer num){
        return nums.contains(num);
    }
}
