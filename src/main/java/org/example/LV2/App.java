package org.example.LV2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double num1 = 0, num2 = 0;

            // 첫 번째 숫자 입력
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                try {
                    num1 = Double.parseDouble(scanner.nextLine()); // 만약 한글,영어를 넣어버리면 오류가 떠서 예외처리
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력해주세요!");
                }
            }

            // 두 번째 숫자 입력
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                try {
                    num2 = Double.parseDouble(scanner.nextLine());  // 만약 한글,영어를 넣어버리면 오류가 떠서 예외처리
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력해주세요!");
                }
            }

            // 연산자 입력
            String operator;
            while (true) {
                System.out.print("사칙연산을 입력하세요(+, -, *, / 중에 써주세요): ");
                operator = scanner.nextLine();

                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    break;
                } else {
                    System.out.println("잘못된 사칙연산입니다. 다시 입력해주세요.");
                }
            }

            double result = 0;
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println(" 0으로 나눌수 없습니다. ");
                        continue;
                    }
                    break;
            }

            System.out.println("띠링!! " + "값을 구했어요~!~! " + "[ " + num1 + " " + operator + " " + num2 + " = " + result + " ]" );
            calculator.add(result);


            while (true) {
                calculator.printHistory();
                System.out.print("계속하시려면 continue, 오래된 결과 값을 삭제하시려면 remove, 그만하시려면 exit를 입력해주세요: ");
                String choice = scanner.nextLine();

                // 다시 처음으로
                if (choice.equals("continue")) {
                    break;
                } else if (choice.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close(); // 스캐너를 끝낸다.
                    return;
                } else if (choice.equals("remove")) {
                    calculator.remove(result);
                } else { // Null, 다른 내용을 입력했을 경우
                    System.out.println("잘못입력하셨습니다.");
                }
            }
        }
    }
}