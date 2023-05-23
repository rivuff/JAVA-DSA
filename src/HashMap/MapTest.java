package HashMap;

public class MapTest {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>();
        map.put(5, "Rivu");
        map.put(3, "Rahul");
        map.put(1, "something");

        System.out.println(map.get(5));
    }
}
