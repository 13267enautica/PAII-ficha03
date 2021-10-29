import java.util.Scanner;

public class FazCalculos {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        System.out.println("Sum = " + calc.sum(5.2, 2.7));
        System.out.println("Minus = " + calc.subtract(5.2, 2.7));
        System.out.println("Multiply = " + calc.multiply(5.2, 2.7));
        System.out.println("Divide = " + calc.divide(5.2, 2.7));
        double num1, num2, num3;
        Scanner entrada = new Scanner(System.in); //Crie uma instância da classe “Calculadora” e faça a soma e multiplicação de 3 números >>a sua escolha.<<
        System.out.println("num1? ");
        num1 = entrada.nextDouble();
        System.out.println("num2? ");
        num2 = entrada.nextDouble();
        System.out.println("num3? ");
        num3 = entrada.nextDouble();
        System.out.println("Multiply by 3 = " + calc.multiplyThree(num1,num2,num3));
        System.out.println("Sum by 3 = " + calc.sumThree(num1,num2,num3));
    }
}

