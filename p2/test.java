package p2;

public class test {
	public static void main(String[] args) throws InterruptedException {
		tic_tok t1 = new tic_tok("tic");
		t1.start();
		tic_tok t2 = new tic_tok("tok");
		t2.start();
		t1.join();
		t2.join();
	}
}
