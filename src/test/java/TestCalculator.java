/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 5im15juroesch
 */
public class TestCalculator {
    
    public TestCalculator() {
    }
    
    private Calculator calc;
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BEFORECLASS");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        
        System.out.println("BEFORE");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAddition(){
        calc.addition(2, 3);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
