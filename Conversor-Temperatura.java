import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int celsius = 0;
    
    System.out.println("Informe a temperatura em Celsius:");
    celsius = scanner.nextInt();
    
    
    double fahrenhait = (celsius * 9/5) + 32;
    
    System.out.println("Temperatura em Fahrenheit:" + fahrenhait);
    
    scanner.close();
    }
}
