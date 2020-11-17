import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer [] integers = new Integer[] {4,5,-6,4,5,3,4,2,4,5,7};
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, integers);
        System.out.println(Arrays.toString(list.toArray()));
        for (Integer i : list){
            System.out.println(i + " - " + Collections.frequency(list, i));
        }

        Integer [] integer = {1, 2, 3, 4};
        CustomArrayList <Integer> custom = new CustomArrayList<>();
        Collections.addAll(custom, integer);
        System.out.println(Arrays.toString(custom.toArray()));
        custom.remove(2);
    }
}
