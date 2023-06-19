package test;

import java.io.BufferedReader;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CarValuationTest extends BaseTestClass
{
	
	@Test
	public void readData() throws Exception 
	{
	    List<String> carOutputList = new ArrayList<String>();

        // Read the car output file and save the data in the List
        BufferedReader outputReader = new BufferedReader(new FileReader("src/test/resources/car_output.txt"));
        String line = outputReader.readLine();
        while (line != null) {
            carOutputList.add(line);
            line = outputReader.readLine();
        }
        outputReader.close();

        //Read Car Input file and data one by one
        BufferedReader inputReader = new BufferedReader(new FileReader("src/test/resources/car_input.txt"));
        String carRegNumber;
        int i = 0;
        String expectedOutput, actualOutput;
        while ((carRegNumber = inputReader.readLine()) != null) {
            driver.get("https://www.cazoo.co.uk/value-my-car/");

            //Input car registration number fetched from file
            
            carHomePage.verifyCookies();
            carHomePage.setCarReg(carRegNumber);
            carHomePage.startValuation();
            
            
            //Extract Car Details text and compare the output with expected output
            expectedOutput = carOutputList.get(i);
            actualOutput = carDetailsPage.getCarInfo();

            Assert.assertEquals(expectedOutput, actualOutput);
            i++;
        }
        inputReader.close();
	}
}	