# Containerized Java Customer CLI

## Description

This program is a simple Java command-line application that collects information for two customers.

The program asks the user for each customer's:

* Name
* Email
* Phone number

Each customer is stored as a `Customer` object. The objects are stored in an `ArrayList<Customer>`. After entering both customers, the program prints all of the stored customer information.

## How to Run in IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Open `CustomerApp.java`.
3. Run the `CustomerApp` class.
4. Enter the information for the two customers when prompted.

## How to Run the Unit Test

The project includes a JUnit test in `CustomerTest.java`.

The test creates a Customer object and checks that its name, email, and phone number are stored correctly.

## How to Build the Docker Image

Make sure Docker Desktop is running.

Open a terminal in the root folder of the project and run:

```bash
docker build -t customer-java-cli .
```

## How to Run the Docker Container

Run:

```bash
docker run -it --rm customer-java-cli
```

The `-it` option allows the user to type information into the command-line program.

## Example

Example input:

```text
Customer Information Program
----------------------------

Enter information for Customer 1
Name: John Smith
Email: john@example.com
Phone: 555-123-4567

Enter information for Customer 2
Name: Jane Doe
Email: jane@example.com
Phone: 555-987-6543
```

Example output:

```text
Stored Customer Information
---------------------------
Name: John Smith, Email: john@example.com, Phone: 555-123-4567
Name: Jane Doe, Email: jane@example.com, Phone: 555-987-6543
```
