package less3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Box <T extends Fruit> {
     ArrayList<T>fruit;



public Box( ArrayList<T>fruit){
    this.fruit=fruit;


}

public float getWeight(){
    float sum = 0.0f;


    for (Fruit f : fruit) {
        sum += f.getWeight();
    }
    return sum;

}

    public boolean compare(Box<?> another){
    return Math.abs(this.getWeight()-another.getWeight()) < 0.01;
    }




    public void sprinkleFromBox(Box<T> another){
        fruit.addAll(another.fruit);
        another.fruit.clear();


    }

    public void addFruit(T fruit){
        this.fruit.add(fruit);
    }
}


