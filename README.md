# Swaglabs Selenium Automation Framework

## Overview

Welcome to the Selenium Automation Framework! This framework is designed to simplify and streamline the process of automating web applications using Selenium WebDriver. It provides a structured foundation for writing and executing automated tests efficiently.

## Features

- **Page Object Model (POM)**: The framework follows the Page Object Model design pattern, enhancing test maintainability and reusability by encapsulating web elements and page interactions.

- **Test Data Management**: Easily manage test data through external data sources such as CSV, Excel, property file or databases.

- **Logging and Reporting**: Comprehensive test execution logs and detailed test reports are generated to track test results effectively.

- **Test Configuration**: Easily configure test parameters, such as browser choice and test environment, through configuration files.

- **Parallel Execution**: Execute tests in parallel for faster feedback and optimized test execution.

- **Customizable and Extensible**: The framework is highly customizable and extensible, allowing you to add custom utilities and modules as needed.

## Prerequisites

Before using this framework, ensure that you have the following installed:

- [Java](https://www.java.com) (version 20 or higher)
- [Maven](https://maven.apache.org) (for project management)
- [WebDriver](https://www.selenium.dev/downloads/) (WebDriver compatible with your browser choice)
- [TestNG](https://testng.org) (for test execution)

## Getting Started

1. Clone this repository to your local machine.

   ```shell
   git clone https://github.com/yourusername/selenium-automation-framework.git
   ```

2. Configure the project settings in the `config.properties` file located in the `src/main/resources` directory.

3. Create test scripts in the `src/test/java` directory using the Page Object Model structure.

4. Run tests using Maven or your preferred IDE. To run tests in parallel, configure the `testng.xml` file accordingly.

## Usage

The following steps outline how to use this framework effectively:

1. **Page Objects**: Create page objects for web pages you intend to automate. These objects should extend the `BasePage` class and contain methods to interact with web elements.

2. **Test Scripts**: Write your test scripts using TestNG annotations. Inject page objects where necessary to perform interactions.

3. **Test Data**: Manage test data using the data-driven approach. Configure data sources and use the `DataProvider` class to fetch data.

4. **Execution**: Execute tests either through Maven or your preferred IDE. Monitor logs and review test reports in the `test-output` directory.

## Customization

This framework is highly customizable to fit your specific needs. You can extend the existing classes or add custom utilities and modules as required.

## Reporting

Test execution reports can be found in the `test-output` directory. These reports provide detailed insights into test results and can be customized to meet your reporting requirements.

## Contributions

Contributions to this Selenium Automation Framework are welcome! If you have suggestions, bug reports, or would like to add new features, please feel free to open an issue or submit a pull request.


