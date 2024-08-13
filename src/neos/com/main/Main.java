package neos.com.main;

import neos.com.stringchecker.StringChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringChecker stringChecker = new StringChecker();

        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        try {
            String result = stringChecker.checkStringType(input);
            System.out.println("Chuỗi này là: " + result);
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }

        scanner.close();
    }
}