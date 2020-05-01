package p1;
import java.util.Arrays; 

public class Int_Arr_Process {
	int a[];
	int n = 10;
	public Int_Arr_Process() {
		this.a = new int[10];
	}
	public Int_Arr_Process(int n) {
		this.n = n;
		this.a = new int[n];
	}
	public Int_Arr_Process(Int_Arr_Process ob) {
		this.n = ob.n;
		this.a = ob.a;
	}
	void read() {
		System.out.println("Enter the numbers");
		for(int i=0;i<this.n;i++) {
			this.a[i] = Read.br.nextInt();
		}
	}
	void displayData() {
		System.out.println("Displaying numbers");
		for(int i=0;i<this.n;i++) {
			System.out.print(this.a[i] + " ");
		}
	}
	void sort() {
		Arrays.sort(this.a);
	}
	int[] maxNMin() {
		int mx = this.a[0],mi = this.a[0];
		for(int i=1;i<this.n;i++) {
			if(mx<this.a[i]) {
				mx = this.a[i];
			}
			if(mi>this.a[i]) {
				mi = this.a[i];
			}
		}
		return new int[] {mx,mi};
	}
	int sum() {
		int ans = 0;
		for(int i=0;i<this.n;i++) {
			ans += this.a[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		Int_Arr_Process x = new Int_Arr_Process();
		x.read();
		System.out.println("Sum of the numbers : " + x.sum());
		System.out.println("Max and Min of the numbers : " + x.maxNMin()[0] +" and "+ x.maxNMin()[1]);
		x.sort();
		x.displayData();
	}
}

