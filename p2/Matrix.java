package p2;

public class Matrix {
	int a[][];
	int n = 3,m = 3;
	public Matrix() {
		this.a = new int[3][3];
	}
	public Matrix(int n,int m) {
		this.n = n;
		this.m = m;
		this.a = new int[n][m];
	}
	public Matrix(Matrix ob) {
		this.n = ob.n;
		this.m = ob.m;
		this.a = ob.a;
	}
	void read() {
		System.out.println("Enter the numbers");
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.m;j++) {
				this.a[i][j] = Read1.scant.nextInt();
			}
		}
	}
	void displayData() {
		System.out.println("Displaying Matrix");
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.m;j++) {
				System.out.print(this.a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void printMatrix(int n,int m,int c[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	boolean isScalar() {
		if(this.n!=this.m)
			return false;
		int d = this.a[0][0];
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.m;j++) {
				if(i!=j && this.a[i][j]!=0) {
					return false;
				}
				if(i==j && this.a[i][j]!=d) {
					return false;
				}
			}
		}
		return true;
	}
	int[][] sum() {
		System.out.println("Give another matrix : n m [][]");
		int p = Read1.scant.nextInt();
		int q = Read1.scant.nextInt();
		int b[][] = new int[p][q];
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.m;j++) {
				b[i][j] = Read1.scant.nextInt();
			}
		}
		if(n!=p || m!=q) {
			return new int [][] {};
		}
		int[][] ans = new int[this.n][this.m];
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.m;j++) {
				ans[i][j] = this.a[i][j] + b[i][j];
			}
		}
		return ans;
	}
	int[][] multiply() {
		System.out.println("Give another matrix : n m [][]");
		int p = Read1.scant.nextInt();
		int q = Read1.scant.nextInt();
		int b[][] = new int[p][q];
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<this.m;j++) {
				b[i][j] = Read1.scant.nextInt();
			}
		}
		if(m!=p) {
			return new int [][] {};
		}
		int[][] ans = new int[this.n][q];
		for(int i=0;i<this.n;i++) {
			for(int j=0;j<q;j++) {
				ans [i][j] = 0;
				for(int k = 0;k<this.m;k++) {
					ans[i][j] += this.a[i][k]*b[k][j];
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Matrix x = new Matrix();
		x.read();
		x.printMatrix(x.n,x.m,x.sum());
		x.printMatrix(x.n,x.m,x.multiply());
		System.out.println(x.isScalar());
		x.displayData();
	}
}
