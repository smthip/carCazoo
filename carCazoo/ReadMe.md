# Project Title


crCazoo is a Java-based  test automation project that uses Selenium WebDriver, TestNG, and Page Object Model to test the car valuation functionality of https://www.cazoo.co.uk/value-my-car/. 

##Build Status 
Build is success without any error.

##Code Style

Maven & TestNG automation framework is used.

## Test Scenario

The test automation is designed to perform the following tasks:
1. Reads given input file: car_input.txt 
2. Extracts vehicle registration numbers. 
3. Each number extracted from the input file is fed to https://www.cazoo.co.uk/value-my-car/ (Perform vehicle details search car valuation page) 
4. Compare the output returned by https://www.cazoo.co.uk/value-my-car/ with the given car_output.txt 
5. Highlight/fail the test for any mismatches. 

## Getting Started

### Prerequisites
1. Java Development Kit 8 or above should be installed on your machine.
2. Eclipse IDE
3. Maven should be installed in your system
4. Selenium WebDriver jar files
5. TestNG jar files

### Installing

1. Clone the Car Valuation Project repository from https://github.com/<your-github-username>/carCazoo.
3. Make sure all the required dependencies are added in the `pom.xml` file.
4. Open the project in Eclipse and run the `CarValuationTest.java` as a TestNG test.

## Built With

* [Java SE Development Kit 8]
* [Selenium WebDriver]
* [TestNG]
* [Maven]
* [GitHub]

## Author

* **Prashant Kulshresha** - [GitHub]()
