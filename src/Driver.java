
public class Driver {

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(10);
        System.out.println(myArray);
        myArray.add(20);
        myArray.add(30);
        myArray.add(99, 0);
        System.out.println(myArray);
        myArray.remove(1);
        System.out.println(myArray);
        myArray.set(101, 1);
        System.out.println(myArray);
        myArray.get(0);

    }
}
