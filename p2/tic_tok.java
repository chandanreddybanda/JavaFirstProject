package p2;

public class tic_tok extends Thread {
	 private Thread t;
	 private String st;
	 private static Object object = new Object();

	 tic_tok(String s){
		 this.st = s;
	 }
	 public void run() {
	       for(int i = 0; i <10; i++) {
	    	   synchronized (object) {
	                System.out.println(st);
	                object.notify();
	                try {
	                    object.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	            }
	       }
	    }
	   
	 public void start () {
	    if (t == null) {
	       t = new Thread (this);
	       t.start ();
	    }
	 }
}

