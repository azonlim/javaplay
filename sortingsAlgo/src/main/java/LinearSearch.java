/**
 * Created by iliakhov on 02/06/2017.
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] values = {50, 25, 75, 100, 42, 64, 86};
        int searchedValue = 100;
        int pos = 0;
        boolean found = false;
        while (pos < values.length && !found) {
 if (values[pos] == searchedValue){
     found = true;
 }
 else{
        pos++;
 }
    }
    if (found) {
        System.out.println("Found at position: "+pos);
        }
    }

}
