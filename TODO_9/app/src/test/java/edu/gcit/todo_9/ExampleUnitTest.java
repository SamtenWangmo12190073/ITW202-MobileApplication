package edu.gcit.todo_9;

import androidx.test.filters.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(JUnit4.class)
@SmallTest
public class ExampleUnitTest {
 private Calculator mCalculator; //declare method
    
    // Test case For Addition of two numbers (whole number, float, negative number)
    @Before
    public  void setUp(){
        mCalculator = new Calculator(); //initialisation
    }
    @Test
    public void addTwoNumber(){
        double result = mCalculator.add(2d, 3d);
        assertThat(result, is(equalTo(5d)));
    }
    @Test
    public void addTwoNumberFloat(){
        double result = mCalculator.add(2.222f, 3.333d);
        assertThat(result, is(closeTo(5.555d, 0.01d)));
    }
    @Test
    public void addTwoNumberNegative(){
        double result = mCalculator.add(2d, -1d);
        assertThat(result, is(equalTo(1d)));
    }


    // Test case For Subtraction of two numbers (whole number, float, negative number)
    @Test
    public void subTwoNumber(){
        double result = mCalculator.sub(3d, 1d);
        assertThat(result, is(equalTo(2d)));
    }
    @Test
    public void subTwoNumberFloat(){
        double result = mCalculator.sub(4.444f, 3.333d);
        assertThat(result, is(closeTo(1.111d, 0.01d)));
    }
    @Test
    public void subTwoNumberNegative(){
        double result = mCalculator.sub(2d, -1d);
        assertThat(result, is(equalTo(3d)));
    }

    // Test case For Multiplication of two numbers (whole number, float, negative number)

    @Test
    public void mulTwoNumber(){
        double result = mCalculator.mul(2d, 3d);
        assertThat(result, is(equalTo(6d)));
    }
    @Test
    public void mulTwoNumberFloat(){
        double result = mCalculator.mul(2.222f, 3.333d);
        assertThat(result, is(closeTo(7.406d, 0.01d)));
    }
    @Test
    public void mulTwoNumberNegative(){
        double result = mCalculator.mul(2d, -1d);
        assertThat(result, is(equalTo(-2d)));
    }

    // Test case For Division of two numbers (whole number, float, negative number)
    @Test
    public void divTwoNumber(){
        double result = mCalculator.div(3d, 3d);
        assertThat(result, is(equalTo(1d)));
    }
    @Test
    public void divTwoNumberFloat(){
        double result = mCalculator.div(3.333f, 3.333d);
        assertThat(result, is(closeTo(1.111d, 1.111d)));
    }
    @Test
    public void divTwoNumberNegative(){
        double result = mCalculator.div(2d, -1d);
        assertThat(result, is(equalTo(-2d)));
    }
}