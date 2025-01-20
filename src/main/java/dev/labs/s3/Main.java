package dev.labs.s3;

public class Main {
    public static void main(String[] args) {
        // Objects from blueprint Database
        Database oracle = new Database();

        // Invoke methods
        oracle.printStatus();

        // Access a field
        System.out.println(oracle.getPassword());
    }
}