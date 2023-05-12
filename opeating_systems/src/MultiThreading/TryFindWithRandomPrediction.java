package MultiThreading;
import java.util.Random;

public class TryFindWithRandomPrediction implements Runnable{

	int predictionNumber;
	boolean correctAnswer = false;
	String name;
	
	public TryFindWithRandomPrediction(int number) {
		predictionNumber = number;
	} 
	public TryFindWithRandomPrediction(int number,String name) {
		predictionNumber = number;
		this.name = name;
	} 	
	@Override
	public void run() {
	
	    while(!correctAnswer){
	    	
			Random random = new Random();              
		    int randomNumber = random.nextInt(100);
		    
		    if(randomNumber == predictionNumber) {
				correctAnswer = true;
				System.out.println("Tebrikler Doğru Sayı Random Sınıfı tarafından bulundu. Doğru Cevap : " + predictionNumber);
				break;
		    }else if (randomNumber != predictionNumber) {
				try {
					System.out.println(name + ":" + randomNumber);
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	
	    }
		
		
	}
	}
}
