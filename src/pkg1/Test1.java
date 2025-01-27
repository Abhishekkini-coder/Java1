package pkg1;

public class Test1 {
	String name;
    String course;
    public String getName() {
    	return name;
    }
    Test1(){
    	
    }
    Test1(String name,String course){
    	this.name = name;
    	this.course = course;
    }
	public static void main(String[] args) {
		Test1 t1 = new Test1("Abhishek","BTech");
		t1.name = "Ashish";
		System.out.println(t1.getName());

	}

}
