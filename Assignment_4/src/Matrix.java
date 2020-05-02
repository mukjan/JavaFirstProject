
public class Matrix {
	int [][] matrix;
	
	Matrix(int a,int b){
		matrix = new int[a][b];
	}
	
	Matrix() {
		matrix = new int[3][3];
	}
	
	Matrix(int [][]a) {
		this.matrix = a;
	}
	
	Matrix (Matrix c){
		this.matrix = c.matrix;
	}
	public void read() {
		for(int []i : matrix) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public Matrix add(Matrix b) {
		Matrix c = new Matrix(b.matrix.length,b.matrix[0].length);
		for(int i=0;i<this.matrix.length;i++) {
			for(int j=0;j<this.matrix[i].length;j++) {
				c.matrix[i][j] =  b.matrix[i][j] + this.matrix[i][j];
			}
		}	
		return c;
		
	}
	
	public boolean scalar() {
		
		for(int i=0;i<this.matrix.length;i++) {
			for(int j=0;i<this.matrix[i].length;j++) {
				if(i!=j && (this.matrix[i][j] !=0)) {
					return false;
				}
			}
		}
		for(int i=0;i<this.matrix.length;i++) {
			if(this.matrix[i][i] !=this.matrix[i+1][i+1]){
				return false;
			}
		}
		return true;
		
	}
	
	public Matrix multiply(Matrix a) {
		int ans = 0;
		
		Matrix c = new Matrix(this.matrix.length,a.matrix[0].length);
		for(int i=0;i<this.matrix.length;i++ ) {
			for(int j=0;j<a.matrix[0].length;j++) {
				for(int k=0;k<a.matrix.length;k++) {
					ans = ans + this.matrix[i][k]*a.matrix[k][j];
				}
				c.matrix[i][j]=ans;
				ans=0;
			}
		}
		
		
		
		return c;
		
		
	}
	
	
	
	
	
}
