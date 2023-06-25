package week1.day1;

public class Fabbinocci {
	public static void main(String[] args) {
		int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;

        System.out.println(firstNumber); 
        for (int i = 1; i <= 11; i++) {
        	sum = firstNumber + secondNumber ;
        	firstNumber = secondNumber;
        	secondNumber=sum;
        	System.out.println(sum);
			
		}
        
        }

	}


