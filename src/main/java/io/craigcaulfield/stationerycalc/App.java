package io.craigcaulfield.stationerycalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> orders = new ArrayList<>();
        String orderLine;

        System.out.println("Please enter your orders. Press ctrl-D to see a summary of your orders ");
        while (scanner.hasNextLine()) {
            orderLine = scanner.nextLine();
            if (orderLine == null) break;
            orders.add(orderLine);
        }

        Calculator calculator = new Calculator();
        calculator.process(orders);
    }
}
