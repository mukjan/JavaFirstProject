import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		ArrayList<Students> business = new ArrayList<>();

		for(int i=0;i<10;i++) {
			TicToc t1 = new TicToc("Tic-");
			TicToc t2 = new TicToc("Toc");
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			System.out.println(" ");
		}
		
	}
	
	

}
