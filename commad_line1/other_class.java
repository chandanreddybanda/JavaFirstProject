

class other_class{
	public static void main(String args[]){
		Command_line1 c = new Command_line1();
		int ar[] = c.setData(args);
		int cr[] = c.calData(ar);
		c.disData(ar,cr);
	}
}