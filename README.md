# Java Logger Intro [![Gayanuka Bulegoda][grb-shield]][grb-url]

This project demonstrates Java's built-in logger capabilities through a simple Spring Boot REST controller. It serves as a practical example for configuring and using various logging levels within a Spring Boot application.

## Overview

The Java Logger Intro Sample project is designed to help developers understand how to implement and configure Java’s inbuilt logging framework within a Spring Boot environment. It illustrates the usage of multiple logging levels to provide insights into system operations, warnings, errors, and detailed debugging information.

## Features
- **Spring Boot REST Controller**: Provides an endpoint to trigger logging.
- **Multiple Logging Levels**: Demonstrates INFO, WARN, ERROR, FATAL, DEBUG, and TRACE levels.
- **Configurable Logging**: Easy-to-customize logging settings using `application.properties`.

## Prerequisites
- Java JDK 17 or later
- Maven build tool
- Basic understanding of Spring Boot

## Installation

1. **Clone the repository:**

   ```bash
   https://github.com/GRB-Workspace/Java-Logger-Intro.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd Java-Logger-Intro
   ```

3. **Build and run the application:**

   ```bash
   mvn spring-boot:run
   ```

## Usage

Once the application is running, you can access the sample REST endpoint at:

```bash
http://localhost:8085/log
```

Triggering the endpoint will log messages using the different logging levels as configured.

## Configuration

The logging behavior is controlled through the `application.properties` file. For example, you can adjust the root logging level:

```properties
logging.level.root=INFO
logging.level.com.example=DEBUG
```

Modify these settings to increase or decrease log verbosity as needed.

## Logging Levels

- **INFO**: Logs general system information.
- **WARN**: Logs warnings about non-critical issues.
- **ERROR**: Logs critical errors.
- **FATAL**: Logs fatal errors that may cause the system to crash.
- **DEBUG**: Logs detailed information for debugging purposes.
- **TRACE**: Logs very detailed, step-by-step trace information.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your improvements.

## License

This project is distributed under the [MIT License](LICENSE).

## Contact

Gayanuka Bulegoda  
[Website](https://grbulegoda.me/) • [GitHub](https://github.com/gayanukabulegoda)

---

<div align="center">
  <p>
    &copy; 2025 Gayanuka Bulegoda
  </p>
</div>

---

[grb-shield]: https://img.shields.io/badge/GRB-000000?style=for-the-badge&logo=github&logoColor=white
[grb-url]: https://grbulegoda.me/
