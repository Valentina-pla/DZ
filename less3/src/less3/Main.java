package less3;

import java.util.ArrayList;

public class Main {

    public static <T> void arrayElement(T[] a, int i, int j) {
        T arr = a[i];
        a[i] = a[j];
        a[j] = arr;
    }


    public static void main(String[] args) {

        Integer [] arr2={15,85,96,97,12};
        arrayElement(arr2,0,1);

        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        Box<Orange> orangeBox=new Box<Orange>(oranges);

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        Box<Apple>appleBox=new Box<Apple>(apples);

        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));


        appleBox.sprinkleFromBox(appleBox);
        orangeBox.sprinkleFromBox(orangeBox);

        orangeBox.addFruit(new Orange());
        appleBox.addFruit(new Apple());












    }

}
