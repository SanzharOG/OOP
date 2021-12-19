import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<Integer>(Arrays.asList(new Integer[]{0,2,4,5,6,8,10}));
        Set<Integer> b = new TreeSet<Integer>(Arrays.asList(new Integer[]{5,6,7,8,9,10}));
        System.out.println("first set: "+a);
        System.out.println("second set: "+b);
        //intersection
        Set<Integer> d = new TreeSet<Integer>(a);
        d.retainAll(b);
        System.out.println("intersection: "+d);
        //difference
        Set<Integer> e = new TreeSet<Integer>(a);
        e.removeAll(b);
        System.out.println("difference: "+e);
    }
}