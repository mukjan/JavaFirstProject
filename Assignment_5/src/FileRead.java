import java.io.File;

public class FileRead {
	
	public static void main(String[] args) {
		String name = "D:";
		File dir = new File(name);
		
		
		String[] files = dir.list();
		for(String x:files) {
			System.out.println(x);
		}
	}
}
