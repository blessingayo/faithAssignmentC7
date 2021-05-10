package africa.semicolon.classexercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testThatCalculatorCanAdd(){
        //given
   Calculator myCalculator = new Calculator();
   //when
      int sum = myCalculator.add(2,6);
      //check /assert
        assertEquals(8, sum);

    }
    @Test
    public void testThatCalculatorCanMultiply(){
        //given
        Calculator loveCalculator = new Calculator();
        //when
        int result = loveCalculator.multiply(3,4);
        //confirm
        assertEquals(12, result);
    }
    @Test
    public void testThatCalculatorCanSubtract(){
        //given
        Calculator loveCalculator = new Calculator();
        //when
        int result = loveCalculator.subtract(9,4);
        //confirm
        assertEquals(5, result);
    }
          @Test
    public void testThatCalculatorCanDivide(){
        //given
         Calculator loveCalculator = new Calculator();
         //when
        double result = loveCalculator.divide(10, 2);
         //confirm
         assertEquals(5, result);
     }
     @Test
    public void testThatCalculatorCanDivideByZero(){
        //given
         Calculator blessingCalculator = new Calculator();
         //when
         double endResult = blessingCalculator.divide(5,0);
         //confirm
         assertEquals(0, endResult);
     }
}




