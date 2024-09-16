import java.util.HashSet;
import java.util.Set;

public class hash{
    public static void main(String[] args) {
        Set<Integer> set1= new HashSet<>();
        set1.add(12);
        set1.add(11);
        set1.add(12);
        System.out.println(set1.toString());


        Set<Integer> set2= new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        Set<Integer> unionSet= new HashSet<>(set1);
        unionSet.addAll(set2);

        Set<Integer> intersectionSet= new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        Set<Integer> complementSet= new HashSet<>(set1);
        complementSet.removeAll(set2);


        System.out.println(complementSet.toString());








    }
}