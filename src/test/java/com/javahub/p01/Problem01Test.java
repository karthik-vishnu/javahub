package com.javahub.p01;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Problem01Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public void testProblem01(){
    	Problem01 problem = new Problem01();
    	problem.groupBySize();
    }
    
}
