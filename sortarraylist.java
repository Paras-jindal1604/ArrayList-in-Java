import java.util.*;
public class sortarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(9);
        list.add(1);
        list.add(99);
        list.add(3);
        list.add(13);


        System.out.println(list);
        Collections.sort(list);                                     // ascending order
        System.out.println(list);


        Collections.sort(list, Collections.reverseOrder());         // descending order
        System.out.println(list);
    }
    
}
