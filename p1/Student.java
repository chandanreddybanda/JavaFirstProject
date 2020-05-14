package p1;
import java.util.Arrays; 

public class Student {
	public Student() {}
	private int n;
	private int id[];
	private String name[];
	private String city[];
	void readN(int n) {
		this.n = n;
		id = new int[n];
		name = new String[n];
		city = new String[n];
	}
	void readDetailsOfStudent(int i,int id,String name,String city) {
		this.id[i] = id;
		this.name[i] = name;
		this.city[i] = city;
	}
	void displayStudent(int id) {
		for(int i=0;i<this.n;i++) {
			if(this.id[i] == id) {
				System.out.println(this.id[i] + " " + this.name[i] + " " + this.city[i]);
				break;
			}
		}
	}
	void displayStudentsFromCity(String city) {
		for(int i=0;i<this.n;i++) {
			if(this.city[i] == city) {
				System.out.println(this.id[i] + " " + this.name[i] + " " + this.city[i]);
			}
		}
	}
	void sortedNamewise() {
		String sortedNames[] = new String[this.n];
		sortedNames = this.name;
		Arrays.sort(sortedNames);
		for(int i=0;i<this.n;i++) {
			System.out.print(sortedNames[i] + " ");
		}
		System.out.println();
	}
	void studentDetails(int id) {
		for(int i=0;i<this.n;i++) {
			if(this.id[i] == id) {
				System.out.println(this.id[i] + " " + this.name[i] + " " + this.city[i]);
				break;
			}
		}
		System.out.println("Student Not Found");
	}
}
