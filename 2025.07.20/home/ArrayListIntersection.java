import java.util.ArrayList;

public class ArrayListIntersection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        ArrayList<Integer> intersection = findIntersection(list1, list2);
        System.out.println("Intersection list: " + intersection);
    }

    public static ArrayList<Integer> findIntersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            Integer element = list1.get(i);

            if (list2.contains(element) && !intersection.contains(element)) {
                intersection.add(element);
            }
        }

        return intersection;
    }
}
