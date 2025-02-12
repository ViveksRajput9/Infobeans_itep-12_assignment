package classWork;

import java.util.Objects;

class Person1 {
	private int id;
	private String name;

	public Person1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ":" + name;
	}
	public boolean equals(Person1 p) {
		
		return this.id == p.id && this.name.equals(p.name);
	}
}

class Student1 extends Person {
	private String tension;

	public Student1(int id, String name, String tension) {
		super(id, name);
		this.tension = tension;
	}

	public String toString() {
		return super.toString() + ":" + tension;
	}
    public boolean equals(Student1 p) {
		boolean result = super.equals(p);
		if(result) {
		  result =	this.tension.equals(p.tension);
		}
		return result ;
	}
}

class MastiKhor1 extends Student {
	private String party;

	public MastiKhor1(int id, String name, String tension, String party) {
		super(id, name, tension);
		this.party = party;
	}

	public String toString() {
		return super.toString() + ":" + party;
	}
	 public boolean equals(MastiKhor1 p) {
			boolean result = super.equals(p);
			if(result) {
				result = party.equals(p.party);
			}
			return result ;
		}
}
public class Q2 {
	public static void main(String[] args) {
		MastiKhor mastiKhor = new MastiKhor(101, "vivek singh rajput", "assignment", "time nahi he");
		MastiKhor mastiKhor3 = mastiKhor;

		MastiKhor mastiKhor2 = new MastiKhor(101, "vivek rajput", "Byeba", "time nahi he");
		System.out.println(mastiKhor2.equals(mastiKhor));
		System.out.println(mastiKhor.hashCode());
		System.out.println(mastiKhor2.hashCode());
		System.out.println(mastiKhor3.hashCode());
	}
}
