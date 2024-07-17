import java.util.ArrayList;
public class operations{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // ADD - O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // GET - O(1)

        System.out.println(list.get(0));
        System.out.println(list.get(2));
       

        // REMOVE - O(n)
        /* 
        list.remove(1);
        System.out.println(list);

        */

        // SET - O(n)
        /* 
        list.set(3,11);
        System.out.println(list);

        */

        // CONTAINS - O(n)

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


        list.add(2,99);
        System.out.println(list);


        // SIZE - it is a method

        System.out.println(list.size());



        // TRAVERSE ArrayList  and print elements

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
