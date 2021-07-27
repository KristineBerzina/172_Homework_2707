package com.company;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Integer> numbers = new TreeSet<>();
        System.out.println("Enter the scores: ");

        for (int i = 0; i< 20; i++){
            numbers.add(scanner.nextInt());
        }
        System.out.println("The maximum score is " + numbers.last() + ".");

    }
}
