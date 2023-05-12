package MultiThreading;

public class LineerSearch extends Thread{

	int predictionNumber;
	boolean correctAnswer = false;
	String name;
	
	public  LineerSearch(int number) {
		predictionNumber = number;
	}
	public  LineerSearch(int number, String name) {
		predictionNumber = number;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i =0 ; i <= 100; i++) {
			
		if(i==predictionNumber){
			System.out.println("Tebrikler LineerSearch sınıfı sayıyı buldu , Sayı : " + predictionNumber);
			break;
		}
		else {
			try {
				System.out.println(name + ":" + i);
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			continue;
		}
		}
	}	
}
