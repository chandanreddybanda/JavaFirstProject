
class Command_line1{
	static int[] setData(String args[]){
		int n = Integer.parseInt(args[0]);
		int ar[] = new int[n];
		for(int i=0;i<n;i++){
			ar[i] = Integer.parseInt(args[i+1]);
		}
		return ar;
	}
	static int[] calData(int ar[]){
		int sum = 0;
		int avg = 0;
		int max = ar[0],min = ar[0];
		int n = ar.length;
		for(int i=0;i<n;i++){
			sum += ar[i];
			if(max<ar[i]){
				max = ar[i];
			}
			if(min>ar[i]){
				min = ar[i];
			}
		}
		avg = sum/n;
		return new int[]{sum,avg,max,min};
	}
	static void disData(int ar[],int cr[]){
		int n = ar.length;
		System.out.println(n);
		for(int i=0;i<n;i++){
			System.out.print(ar[i] + " ");
		}
		System.out.println("\nSUM "+cr[0]);
		System.out.println("AVG "+cr[1]);
		System.out.println("MAX "+cr[2]);
		System.out.println("MIN "+cr[3]);
	}
}