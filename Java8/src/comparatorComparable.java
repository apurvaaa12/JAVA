import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class comparatorComparable {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        List<String> names= new ArrayList<>();
        names.add("Apurva");
        names.add("prasanth");
        names.add("wallo");
        names.add("jello");
        num.add(67);
        num.add(43);
        num.add(21);
        num.add(65);

        Comparator<Integer> com = null;
        Collections.sort(num, com);

        //sorting based on last digit of the number

        com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10)
                    return 1;
                else
                    return -1;
            }
        };

        System.out.println(names);

    }
}
