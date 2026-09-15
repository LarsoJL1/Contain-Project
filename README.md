# Containerized Java CLI Tool

## What This Program Does

This is a simple Java command-line program that asks the user for information about two customers.

For each customer, the program asks for:
- Name
- Email
- Phone number

The information is stored in `Customer` objects and then placed into an `ArrayList`. After both customers are entered, the program prints their information.

## How to Run the Program

The program can be run normally in IntelliJ IDEA by running `CustomerApp.java`.

## How to Run with Docker

First, build the Docker image:

```bash
docker build -t customer-java-cli .
