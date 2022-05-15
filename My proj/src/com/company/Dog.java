package com.company;

class Dog  extends Animal{
private final int maxRun=100;
private final int maxSwim=12;

@Override
public void run(int lenght){
    if (lenght <= maxRun) {
        System.out.println("Dog runs " + lenght+ "m");
    } else {
        System.out.println("Dog cant runs more than" + maxRun + "m");

    }
}
    @Override
    void swim(int length) {
        if (length <= maxSwim) {
            System.out.println("Dog swim " + length + "m");
        } else {
            System.out.println("Dog cant swim more than" + maxSwim + "m");
        }
    }

}
