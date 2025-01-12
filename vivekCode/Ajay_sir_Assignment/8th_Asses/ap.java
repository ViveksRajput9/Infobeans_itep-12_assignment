package vivekCode;

class TestA {

public void start() { 

System.out.println("TestA"); }

}

public class ap extends TestA {

public void start() { 

System.out.println("TestB"); }//overridden method

public static void main(String[] args) {

((ap)new ap()).start();

}

}