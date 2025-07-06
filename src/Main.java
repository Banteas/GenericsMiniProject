public class Main {
    public static void main(String[] args) {


        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();


        box1.setItem("apple");
        box2.setItem(345);


        System.out.println(box1.getItem());
        System.out.println(box2.getItem());

        Product<String,Double> product1 = new Product<>("banana",1.50);
        Product<String,Integer> product2 = new Product<>("apple",1);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());


    }
}
