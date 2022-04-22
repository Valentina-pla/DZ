package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    private static Triangle tri=new Triangle();

    @Test
    @DisplayName("Невозможно построить треугольник с отр.числом")

    public void TriangleTestNegativeNumber()  {

        boolean thrown = false;
        String messege="";

        try {
            tri.checkArea(-2, 1, 3);
        } catch (Exception e) {
            thrown = true;
            messege=e.getMessage();
        }

        assertTrue(thrown);
        assertEquals("Не валидное значение", messege);



    }

    @Test
    @DisplayName("Сравнение с плавающей запятой")

    public void TriangleComma() throws Exception {
        float expected =  147.901f;
        float result = tri.checkArea(30, 30, 10);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    @DisplayName("Построить треугольник ")

    public void TriangleBuild() throws Exception {

        float expected =  147.901f;
        float result = tri.checkArea(30, 30, 10);

        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    @DisplayName("Одно из значений 0 ")

    public void TriangleTestZero(){
        boolean thrown = false;
        String messege="";

        try {
            tri.checkArea(0, 1, 3);
        } catch (Exception e) {
            thrown = true;
            messege=e.getMessage();
        }

        assertTrue(thrown);
        assertEquals("Не валидное значение", messege);




    }





}
