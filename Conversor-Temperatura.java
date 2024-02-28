import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    double celsius = 0.0;
    double fahrenhait = 0.0;    
        
    
    System.out.println("Informe a temperatura em Celsius:");
    celsius = scanner.nextInt();
    
    
    double fahrenhait = (celsius * 9/5) + 32;
    
    System.out.println("Temperatura em Fahrenheit:" + fahrenhait);
    
    scanner.close();
    }
}
