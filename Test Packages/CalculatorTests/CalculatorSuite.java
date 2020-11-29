/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Producer
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CalculatorTests.MultiplyTest.class, 
    CalculatorTests.DivideTest.class, 
    CalculatorTests.CalculatorTest.class, 
    CalculatorTests.SubtractTest.class, 
    CalculatorTests.SumTest.class})
public class CalculatorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
