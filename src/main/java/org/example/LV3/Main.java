package org.example.LV3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            double num1 = 0, num2 = 0;
            String input = "";
            ArithmeticCalculator calculator;

            // 첫 번째 숫자 입력
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                try {
                    num1 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력해주세요!");
                }
            }

            // 두 번째 숫자 입력
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                try {
                    num2 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력해주세요!");
                }
            }

            // 연산자 입력
            while (true) {
                System.out.print("사칙연산을 입력하세요 (+, -, *, /): ");
                input = scanner.nextLine();

                if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                    break;
                } else {
                    System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                }
            }


                Operator operator = Operator.fromSymbol(input);
                calculator = new ArithmeticCalculator(num1, num2, operator);
                double result = calculator.calculate();

                System.out.println("띠링!! 값을 구했어요~!~! [ " + num1 + " " + input + " " + num2 + " = " + result + " ]");

                calculator.add(result);  // 결과 저장

                // 결과 처리
                while (true) {
                    calculator.printHistory();
                    System.out.print("계속하시려면 continue, 오래된 결과 값을 삭제하시려면 remove, 그만하시려면 exit를 입력해주세요: ");
                    String choice = scanner.nextLine();

                    if (choice.equals("continue")) {
                        break;
                    } else if (choice.equals("remove")) {
                        calculator.remove(result);
                    } else if (choice.equals("exit")) {
                        System.out.println("프로그램을 종료합니다.");
                        scanner.close();
                        return;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                }
        }
    }
}

