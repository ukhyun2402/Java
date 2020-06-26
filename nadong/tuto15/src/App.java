
public class App {
    public static void main(String[] args) throws Exception {
        Node one = new Node(10, 20);
        Node two = new Node(30, 40);
        Node result = one.getCenter(two);
        System.out.println(one.getX());
    }
}
