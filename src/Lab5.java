import java.util.ArrayList;
import java.util.Collection;

public class Lab5 {


    public static void main(String[] args) {

    }

    private class BinarySearch{
        Collection<Integer> collection;

        public BinarySearch() {
            collection = new ArrayList<>();
        }

       public boolean add(int num){
         return collection.add(num);
       }

       public int search(int num){

            return 0;
       }

        @Override
        public String toString() {
            return "BinarySearch{" +
                    "collection=" + collection +
                    '}';
        }

    }

}

