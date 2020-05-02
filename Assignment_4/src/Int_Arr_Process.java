import java.util.Arrays;

public class Int_Arr_Process {
	int array[];
	Int_Arr_Process() {
		array = new int[10];
	}
	
	Int_Arr_Process(int num) {
		array = new int[num];
	}
	
	Int_Arr_Process(int[] arr) {
		array = arr;
	}
	
	Int_Arr_Process(Int_Arr_Process a){
		this.array = a.array;
	}
	
	public void display() {
		for(int element : array) {
			System.out.println(element);
		}
	}
	
	public void displayHori() {
		for(int element : array) {
			System.out.print(element+" ");
		}
	}
	
	public void displayVer() {
		display();
	}
	
	public void sort() {
		Arrays.sort(array);
	}
	
	public int[] maxMin() {
		int min = array[0],max=array[0];
		int[] Arr = new int[2];
		for(int i : array) {
			if(i>max) {
				max = i;
			}
			if(i<min) {
				min = i;
			}
		}
		Arr[0]=max;
		Arr[1]=min;
		
		return Arr;
	
	}
	
	
	public int sum() {
		int ans = 0;
		
		for(int i : array) {
			ans = ans + i;
		}
		
		return ans;
	}
	
	public int secondMax() {
		
		int max=array[0] , second = array[0];
		
		for(int i : array) {
			if(max<i) {
				second = max;
				max = i;
			}
			else if(i!=max && i>second ) {
				second = i;
			}
		}
		
		return second;
	}
	
	
	
	
	
}
