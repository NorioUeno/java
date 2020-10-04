package practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import practice.section1.CalculatorTest;
import practice.section4CustomMather.IsDateTest;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class,IsDateTest.class})
public class AllTests {

}
