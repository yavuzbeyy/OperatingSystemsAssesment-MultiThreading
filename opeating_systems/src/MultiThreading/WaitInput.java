package MultiThreading;

import java.util.Scanner;

public class WaitInput implements Runnable{

	int predictionNumber;
	boolean correctAnswer = false;
	String name;
	
	public WaitInput(int sayi) {
		predictionNumber = sayi;
	}
	
	public WaitInput(int sayi,String name) {
		predictionNumber = sayi;
		this.name = name;
	}
	
	
	@Override
	public void run() {
	
		
		while(!correctAnswer){
			
			Scanner scanner = new Scanner(System.in);
			System.out.println(name + "Tahmin ettiğiniz sayıyı giriniz : ");	
			int inputNumber = scanner.nextInt();
			
			if(inputNumber == predictionNumber) {
				correctAnswer = true;
				System.out.println(name + "Tebrikler Sayıyı buldunuz. Doğru Cevap : " + predictionNumber);
				break;
			}
			else if (inputNumber != predictionNumber) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			
			
		}
	}
		
}
