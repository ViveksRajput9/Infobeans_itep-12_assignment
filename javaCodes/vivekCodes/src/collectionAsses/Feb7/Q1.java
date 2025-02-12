package collectionAsses.Feb7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class InvalidAge extends RuntimeException {
	public InvalidAge() {
		super("InvalidAge : age must 1 to 130");
	}
}

class Hospital {
	private int patientId;
	private String name;
	private String disease;
	private int age;

	public Hospital(int patientId, String name, String disease, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.disease = disease;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Hospital [patientId=" + patientId + ", name=" + name + ", disease=" + disease + ", age=" + age + "]";
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Q1 {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Hospital> hospitalPatientData = new ArrayList<>();

	public static String nameInput() {
		System.out.print("Name :-");
		String name = sc.nextLine().trim();

		return (name.isBlank()) ? nameInput() : name;
	}

	public static String diseaseInput() {
		System.out.println("Desease :-");
		String disease = sc.nextLine();
		return (disease.isBlank()) ? diseaseInput() : disease;
	}

	public static int ageInput() {
		int age = 0;
		boolean flag = true;
		try {
			System.out.println("Age :-");
			age = Integer.parseInt(sc.nextLine());
			if (age < 1 || age > 130) {
				flag = false;
				throw new InvalidAge();
			}
		} catch (InvalidAge e) {
			flag = false;
			System.out.println(e.getMessage());
		} catch (Exception e) {
			flag = false;
			System.out.println(e.getMessage());
		}
		return (flag) ? age : ageInput();
	}

	public static int idInput() {
		boolean flag = true;
		System.out.print("Id :-");
		int patientId = 0;
		try {
			patientId = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			flag = false;
			System.out.println("Invalid id : id must be integer value");
		}
		return (flag) ? patientId : idInput();
	}

	public static void addPatient() {
		try {

			System.out.println("Enter new patient details");

			String name = nameInput();
			int age = ageInput();
			int patientId = idInput();
			String disease = diseaseInput();
			Hospital patient =new  Hospital(patientId, name, disease, age);
			System.out.println("ReCheck details ==>");
			System.out.println(patient);
			System.out.println();
			System.out.println("Are you confirm click yes || no");
			
			hospitalPatientData.add(patient);
			System.out.println("patient Added successfully");
			
		} catch (InvalidAge e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void displayAllPatientRecords() {
		int count= 0;
		System.out.println("---------------------- Records -----------------------");
		for (Hospital patientData : hospitalPatientData) {
			count++;
			System.out.println(count+ ". "+patientData);
		}
		System.out.println("------------------------ Done ------------------------");
	}
    public static boolean Confirmation() {
    	System.out.println("click yes || No ");
    	char confirmation = sc.nextLine().charAt(0);
		if (confirmation == 'y' || confirmation == 'Y') {
			return true;
		}else if (confirmation == 'n' || confirmation == 'N') {
			return false;			
		}else {
			System.out.println("Enter valid command click Yes || No ");
			return Confirmation()? true:false;
		}
    }
	public static void findPatientName() {
		System.out.println("Enter the Name :-");
		String name = sc.nextLine();
		System.out.println("Searching... record by Patient-name");
		System.out.println("---------------------- Records -----------------------");
		int count = 1;
		for (Hospital patientData : hospitalPatientData) {
			if (name.equals(patientData.getName())) {
				System.out.println(count + ". " + patientData);
				count++;
			}
		}
		System.out.println("------------------------ Done ------------------------");

	}

	public static void findPatient(int age) {
		System.out.println("Searching... record by Patient-age");
		System.out.println("---------------------- Records -----------------------");
		int count = 1;
		for (Hospital patientData : hospitalPatientData) {
			if (age == patientData.getAge()) {
				System.out.println(count + ". " + patientData);
				count++;
			}
		}
		System.out.println("------------------------ Done ------------------------");

	}

	public static void searchPatientDisease() {
		System.out.println("Enter Disease name :-");
		String disease  =sc.nextLine();
		System.out.println("Searching... record by Patient-disease");
		System.out.println("---------------------- Records -----------------------");
		int count = 1;
		for (Hospital patientData : hospitalPatientData) {
			if (disease.equals(patientData.getDisease())) {
				System.out.println(count + ". " + patientData);
				count++;
			}

		}
		System.out.println("------------------------ Done ------------------------");

	}

	public static void searchPatientId() {
		System.out.print("Enter id:-");
		int id = sc.nextInt();
		System.out.println("Searching... record Patient-Id");
		System.out.println("---------------------- Records -----------------------");
		int count = 1;
		for (Hospital patientData : hospitalPatientData) {
			if (id == patientData.getPatientId()) {
				System.out.println(count + ". " + patientData);
				count++;
			}
		}
		System.out.println("------------------------Done------------------------");
	}

	public static void dischargedPatient() {
		System.out.print("Enter id:-");
		int id = sc.nextInt();
		Iterator<Hospital> itr = hospitalPatientData.iterator();
		System.out.println("Searching...");
		boolean flag = false;
		while (itr.hasNext()) {
			if (itr.next().getPatientId() == id) {
				System.out.println("Record found");
				System.out.println(" ==> " + itr.next());
				System.out.println("do you want to remove data");
				if(Confirmation()) {
					flag = true;
					itr.remove();
				}
			}
			System.out.println();
		}
		if (flag)
			System.out.println("remove success");
		else
			System.out.println("No record found");
	}

	public static void getYoungestPatient() {
		if (hospitalPatientData.isEmpty())
			System.out.println("No record found");
		if (hospitalPatientData.size() == 1)
			System.out.println(hospitalPatientData.get(0));
		int youngestAge = hospitalPatientData.get(0).getAge();
		int i;
		Hospital p = hospitalPatientData.get(0);
		for (i = 1; i < hospitalPatientData.size(); i++) {

			int age = hospitalPatientData.get(i).getAge();
			if (youngestAge > age) {
				youngestAge = age;
				p = hospitalPatientData.get(i);
			}
		}
		System.out.println(p);
	}
	public static void main(String[] args) {
		while(true) {
		System.out.println("Welcome to Hospital Database");
		while (true) {
			System.out.println("Do you want to add patient");
			if (!Confirmation()) {
				break;
			}
			addPatient();
		}
		System.out.println("Do you want print Records");
		if(Confirmation()) {
			displayAllPatientRecords();
			
		}
		System.out.println("Do you want Remove/discharged patient ");
		if(Confirmation()) {
			
			dischargedPatient();
		}
		System.out.println("Do you want to search youngest patient");
		if(Confirmation()) {
			getYoungestPatient();
		}
		System.out.println("Do you want to search patieants ");
		System.out.println(1 + " for id ");
		System.out.println(2 + " for  age ");
		System.out.println(3 + " for name ");
		System.out.println(4 + " for disease");
		int n = sc.nextInt();
		switch (n) {
		case 1 -> searchPatientId(); 
		case 2 -> searchPatientDisease();
		case 3 -> searchPatientName();
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		}
	}
}