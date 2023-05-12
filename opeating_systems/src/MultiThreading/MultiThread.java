package MultiThreading;

import java.util.Random;

public class MultiThread {

	public static void main(String voidParametresi[]) {
	
		
		// Tahmin Edilecek sayının oluşturulması
		 Random random = new Random();              
	     int randomNumber = random.nextInt(100);
	     
	     
	     //System.out.println("Tahmin Edilecek Sayı: : " + randomNumber);
		
		LineerSearch lineerSearch  = new LineerSearch(randomNumber,"Thread 1 Lineer Class = ");
		Thread thread = new Thread(lineerSearch);
		
		TryFindWithRandomPrediction tryFindWithRandomPrediction = new TryFindWithRandomPrediction(randomNumber , "Thread 2 Random Class = ");
		Thread thread2 = new Thread(tryFindWithRandomPrediction);
		
		WaitInput waitInput = new WaitInput(randomNumber ,"Thread 3 Input Class = ");
		Thread thread3 = new Thread(waitInput);
		
		thread.start();
		thread2.start();
		thread3.start();
	}
	
}
