import java.util.ArrayList;
public class ArrayLis {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(10);
    list.add(2);
    list.add(4);
    list.add(5);

        System.out.println(list);

        list.set(0,6);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

       
    }



}
