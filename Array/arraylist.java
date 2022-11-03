package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>();

               list.add(43);
               list.add(76);
               list.add(23);
               list.add(32);
               list.add(12);
               list.add(7766);
               list.add(87);
               list.add(796);

               System.out.println(list);

               ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

               for (int i = 0; i < 3; i++) {
                    list2.add(new ArrayList<>());
               }

               for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        list2.get(i).add(sc.nextInt());
                    }
               }

               System.out.println(list2);
        }
    }
}
