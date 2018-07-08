package Test;


class Course implements Cloneable{
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}
	
	 protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
	
}
public class Cloning implements Cloneable{ 
	 private String name;
	 private String myShoe;
	 private Course course;
	 public Cloning(String name,String myShoe,Course course){
		 this.name=name;
		 this.myShoe=myShoe;
		 this.course=course;
	 }
	 
	 
	 
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		Cloning test= (Cloning) super.clone();
		test.course=(Course) course.clone();
		return test;
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		Course course=new Course("Java");
		Cloning test1=new Cloning("Ganda","Cellotape",course);
		Cloning test2=(Cloning) test1.clone();
		
		System.out.println(test1);
		System.out.println(test2);
		
		
		test2.setName("Ganda11");
		 
		test2.getCourse().setCourseName("Java Updated");
		System.out.println(test1);
		System.out.println(test2);
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMyShoe() {
		return myShoe;
	}



	public void setMyShoe(String myShoe) {
		this.myShoe = myShoe;
	}



	@Override
	public String toString() {
		return "Test [name=" + name + ", myShoe=" + myShoe + ", course=" + course + "]";
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	 
	
	 
}