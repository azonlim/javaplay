/**
 * Created by iliakhov on 02/06/2017.
 */
public class BinarySearch {
    public static final int NOT_FOUND = -1;
    public static int binarySearch(double[] a, double key) {
        int low = 0;
        int high = a.length -1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] > key) {
                high = mid - 1;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return NOT_FOUND;
    }
    public static void main(String[] args) {
        double key = 10.5, index;
        double a[] ={10,5,4,10.5,30.5};
        int i;
        int l = a.length;
        int j;
        System.out.println("The array currently looks like");
        for (i=0; i<a.length; i++)
            System.out.println(a[i]);
        System.out.println("The array after sorting looks like");
        for (j=1; j < l; j++) {
            for (i=0; i < l-j; i++) {
                if (a[i] > a[i+1]) {
                    double temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for (i=0;i < l;i++) {
            System.out.println(a[i]);
        }
        System.out.println("Found " + key + " at " + binarySearch(a, key));
    }
}