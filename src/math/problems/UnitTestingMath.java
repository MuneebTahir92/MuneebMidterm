package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Factorial fac = new Factorial();
        Assert.assertEquals(120, fac.factorial(5));


    }
}
