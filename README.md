# E-Commerce Automation Testing

This project contains automated test cases for validating critical user journeys on an e-commerce website, including product search, adding items to the cart, and completing a purchase. The tests are built using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** design pattern, with **Maven** for dependency management. The project incorporates **data-driven testing** using TestNG DataProviders, separates page actions and assertions for improved reliability and reusability, and supports **parallel execution** across multiple threads.

## Setup Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Ahmedelhamzawy/Ecommerce-Automation-Task.git
   ```
2. **Open in IDE**:
   - Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3. **Wait for Maven Dependencies**:
   - Maven will automatically download and resolve all dependencies defined in the `pom.xml` file. Ensure your IDE is configured to auto-import Maven dependencies.
   - If dependencies do not load, run:
     ```bash
     mvn clean install
     ```

## Execution Instructions

You can execute the tests in multiple ways:

1. **Using Maven from Terminal**:
   - Run all tests:
     ```bash
     mvn test
     ```
   - Run a specific test class (e.g., `AddToCartTest`):
     ```bash
     mvn test -Dtest=AddToCartTest
     ```

2. **Using IntelliJ IDEA**:
   - Locate the `testng.xml` file in the project.
   - Right-click on `testng.xml` and select **Run**.
   - Alternatively, run individual tests by clicking the green "Run" button next to each test method in the IDE.

3. **Running Individual Tests**:
   - From the IDE: Click the green "Run" button beside the desired test method.
   - From the CLI: Use the Maven command with the specific test class, as shown above.

## Test Reports

After running the tests using `mvn test`, detailed test reports are generated in the following directory:
- **Location**: `target/surefire-reports`
- The reports include HTML and XML files summarizing test execution results, such as pass/fail status, execution time, and any errors or failures encountered.
