import java.util.Random;
import java.util.Arrays;
import java.lang.reflect.Array;
public class IntArray{
    private int length;
    private int[] myArray;
    //constructor
    public IntArray(int l){
        length = l;
        myArray = new int [l];
        toString();
    }
    //set
    void set(int element, int newValue){
        Array.set(this.myArray, element, newValue);
    }
    //get
    public int get(int element){
        return this.myArray[element];
    }
    public int size(){
        return this.length;
    }
    public boolean isEmpty(){
        for (int i = 0; i < this.myArray.length; i++){
            if (this.myArray[i] > 0){
                return false;
            }
        }
        return true;
    }
    //method
    public void sort(){
        Arrays.sort(this.myArray);
    }
    public void clear(){
        for (int i = 0; i < this.myArray.length; i++){
            if (this.myArray[i] > 0){
                set(i, 0);
            }
        }
    }
    public void fillRand(){
        Random random = new Random();
        for (int i = 0; i < this.myArray.length; i++){
            int randomNum = random.nextInt(6) + 1;
            this.myArray[i] = randomNum;
        }
    }
    public String toString(){
        String output = Arrays.toString(this.myArray);
        return output;
    }

}