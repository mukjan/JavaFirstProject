
public class Main {

	public static void main(String[] args) {
		int [][] array = {{1,3},{1,2}};
		Matrix a = new Matrix(array);
		Matrix b = new Matrix(a);
		Matrix c = new Matrix(2,2);
		a.read();
		a.read();
		c = a.multiply(b);
		c.read();
	}

}
