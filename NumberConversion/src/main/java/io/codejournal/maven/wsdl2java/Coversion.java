package io.codejournal.maven.wsdl2java;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class Coversion {
    // TODO ZUNAID Throwing error without handling it
    public static void main(String[] args) throws MalformedURLException {
        final String endpoint = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";
        final URL url = URI.create(endpoint).toURL();
        final NumberConversion service = new NumberConversion(url);
        // TODO ZUNAID port is not a good use for a variable name here
        final NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
        Scanner scanner = new Scanner(System.in);
        int choice=-1;


    do {
        // TODO ZUNAID Incorrect indentation here
        // TODO ZUNAID Number to words not implemented
            System.out.print("Choose:  \n1:Numbers To Dollar \n2:Numbers To Word \n3:Both \n4:Exit \n");

                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid choice. Please enter a number.");
                    continue;
                }
        // TODO ZUNAID Would be better with a switch statement and a default like in the sports example
        if (choice != 1 && choice != 2 && choice != 3 && choice != 4 ) {
            System.out.println("Invalid Choice");
        }
        if (choice == 1) {
            convertToDollar(scanner, port);
        }
        else if (choice == 2) {
            convertToDollar(scanner, port);
        }
        else if (choice == 3) {
            convertToDollar(scanner, port);
        }
        else if (choice == 4) {
            System.exit(0);
        }
       }while(choice != 4);

}
    private static void convertToDollar(Scanner scanner, NumberConversionSoapType port) {
        System.out.print("Enter Number:");
        String value = scanner.nextLine();
        String dollar = port.numberToDollars(BigDecimal.valueOf(Long.parseLong(value)));
        System.out.println("Number in Dollars: " + dollar);
    }

    // TODO ZUNAID Number to words not implemented
    private static void convertToWord(Scanner scanner, NumberConversionSoapType port) {
        System.out.print("Enter Number:");
        String value = scanner.nextLine();
        String word = port.numberToWords(BigInteger.valueOf(Long.parseLong(value)));
        System.out.println("Number in Words: " + word);
    }
}


