
public class TicToc extends Thread {
	private String name;
	
	public TicToc(String a) {
		
		this.name = a;
	}
	
	public void run() {
		System.out.print(this.name);
	}
}
