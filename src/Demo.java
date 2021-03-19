import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sum of money and currency -  ");
        String exchange = scanner.nextLine();
        String[] string = exchange.split(" ");
        double sumOfMoney = Double.parseDouble(string[0]);

        switch (string[1]){
            case "EUR":
                EUR euro = new EUR();
                System.out.printf(exchange + " = %.2f UAH", euro.convert(sumOfMoney));
                break;
            case "USD":
                USD dollar = new USD();
                System.out.printf(exchange + " = %.2f UAH", dollar.convert(sumOfMoney));
        }
        scanner.close();
    }
}

