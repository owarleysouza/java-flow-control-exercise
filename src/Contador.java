import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner userInput  = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int firstNumber = Integer.parseInt(userInput.nextLine());

        System.out.println("Digite o segundo número");
        int secondNumber = Integer.parseInt(userInput.nextLine());

        try {
            count(firstNumber, secondNumber);
        } catch (InvalidParametersException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void count(int firstNumber, int secondNumber) throws InvalidParametersException{
        if(firstNumber > secondNumber) {
            throw new InvalidParametersException();
        }

        int numberToCount = secondNumber - firstNumber;
        for (int i = 1; i <= numberToCount; i++) {
            System.out.println(i);
        }

    }

}

class InvalidParametersException extends Exception {
    public InvalidParametersException() {
    }
}