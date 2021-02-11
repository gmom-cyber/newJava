package ru.mirea.ikbo1619;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();
            if (value.equals("0"))
                break;
            Consumer<String> zadacha1 = (s) -> {
                int i = 0;
                String finalStr = "";
                String[] symbols = s.split("");
                for (String subStr : symbols) {
                    i++;
                    if (i == 3) {
                        finalStr = finalStr + subStr.toUpperCase();
                        i = 0;
                    } else {
                        finalStr = finalStr + subStr;
                    }
                }

                System.out.println(finalStr);

            };
            zadacha1.accept(value);

        }
    }
}
