import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    List<Integer> list;

    public BinarySearch() {
        list = new ArrayList<>();
    }

    public boolean add(int num) {
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
            return false;

        if (!list.add(num))
            return false;
        Collections.sort(list);
        return true;
    }

    public int search(int num) {

     return search(num, list);

    }

    public int search(int num, List<Integer> list) {
        if (list.size() == 1)
            if (num == list.get(0)) {
                return 0;
            }else {
                System.out.println("cant find");
            }
        int mid = list.size() / 2;
        if (num == list.get(mid))
            return num;

        if (num < list.get(mid)) {
            List<Integer> sub = list.subList(0, mid - 1);
            search(num, sub);

        } else if (num > list.get(mid)) {
            List<Integer> sub = list.subList(mid + 1, list.size() - 1);
            search(num, sub);
        }
        System.out.println("cant find 2");
        return 0;
    }


    @Override
    public String toString() {
        return "BinarySearch{" +
                "List=" + list.toString() +
                '}';
    }

}