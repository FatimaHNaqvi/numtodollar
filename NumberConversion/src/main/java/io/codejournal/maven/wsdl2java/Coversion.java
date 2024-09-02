package io.codejournal.maven.wsdl2java;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class Coversion {
    // TODO ZUNAID Throwing error without handling it
<<<<<<< HEAD
    // FIXME Nadia: remove redundant throw from method
    //Fatima- Throw method removed
    // Fatima-with try-catch
    public static void main(String[] args) {
        final String endpoint = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";
        // FIXME Nadia: Redundant initializer. Make use of warnings
        //Fatima-Done
        URL url;
=======
    // Fatima-with try-catch
    public static void main(String[] args) throws MalformedURLException {
        final String endpoint = "https://www.dataaccess.com/webservicesserver/numberconversion.wso";
        URL url = null;
>>>>>>> 24e8ac83edefcc16844d11d87bcaaa0f496d0e4c
        try {
            url = URI.create(endpoint).toURL();
        } catch (MalformedURLException e) {
            System.err.println("Invalid URL: " + e.getMessage());
            return; // Exit the program gracefully if URL creation fails
        }
        // TODO ZUNAID port is not a good use for a variable name here
<<<<<<< HEAD
        // FIXME Nadia: Variable names need to be descriptive
        //Fatima-Changed the name of variable and made it more descriptive
        final NumberConversion service = new NumberConversion(url);
        final NumberConversionSoapType NumberConversionPort = service.getPort(NumberConversionSoapType.class);
        Scanner scanner = new Scanner(System.in);
        int choice;
=======
        //Fatima-Changed the name of variable
        final NumberConversion service = new NumberConversion(url);
        final NumberConversionSoapType NCD = service.getPort(NumberConversionSoapType.class);
        Scanner scanner = new Scanner(System.in);
        int choice;


>>>>>>> 24e8ac83edefcc16844d11d87bcaaa0f496d0e4c
        do {
            // TODO ZUNAID Incorrect indentation here
            // TODO ZUNAID Number to words not implemented
            // Fatima- Indentation corrected and  Number to words implemented
            System.out.print("Choose:  \n1:Numbers To Dollar \n2:Numbers To Word \n3:Both \n4:Exit \n");
            choice = Integer.parseInt(scanner.nextLine());
            // TODO ZUNAID Would be better with a switch statement and a default like in the sports example
            // Fatima- Switch has been used instead of if/else
            switch (choice) {
                case 1:
<<<<<<< HEAD
                    convertToDollar(scanner, NumberConversionPort);
                    break;
                case 2:
                    convertToWord(scanner, NumberConversionPort);
                    break;
                case 3:
                    convertToDollar(scanner, NumberConversionPort);
                    convertToWord(scanner, NumberConversionPort);
=======
                    convertToDollar(scanner, NCD);
                    break;
                case 2:
                    convertToWord(scanner, NCD);
                    break;
                case 3:
                    convertToDollar(scanner, NCD);
                    convertToWord(scanner, NCD);
>>>>>>> 24e8ac83edefcc16844d11d87bcaaa0f496d0e4c
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

<<<<<<< HEAD
        } while (choice != 4);
        // FIXME Nadia: remove whitespace
        //Fatima- Done
=======
        }while(choice != 4);
        scanner.close();

>>>>>>> 24e8ac83edefcc16844d11d87bcaaa0f496d0e4c
    }
    private static void convertToDollar(Scanner scanner, NumberConversionSoapType NCD) {
        System.out.print("Enter Number:");
        String value = scanner.nextLine();
        String dollar = NCD.numberToDollars(BigDecimal.valueOf(Long.parseLong(value)));
        System.out.println("Number in Dollars: " + dollar);
    }
<<<<<<< HEAD

=======
>>>>>>> 24e8ac83edefcc16844d11d87bcaaa0f496d0e4c
    // TODO ZUNAID Number to words not implemented
    // Fatima-Number to words implemented
    private static void convertToWord(Scanner scanner, NumberConversionSoapType NCD) {
        System.out.print("Enter Number:");
        String value = scanner.nextLine();
        String word = NCD.numberToWords(BigInteger.valueOf(Long.parseLong(value)));
        System.out.println("Number in Words: " + word);
    }
}


