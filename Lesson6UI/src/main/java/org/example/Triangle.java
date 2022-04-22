package org.example;


public class Triangle {

    public float checkArea(int a, int b, int c) throws Exception {
        if (a<=0 || b<=0 || c<=0){
            throw new Exception("Не валидное значение");
        }
        float p=(a+b+c)/2;
        float s;
        s= (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));

        return s;
    }

}
