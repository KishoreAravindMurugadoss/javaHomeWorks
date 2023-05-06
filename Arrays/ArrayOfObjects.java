class Student{
	int rollno;
	String name;
	int marks;
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollno = 001;
		s1.name = "A";
		s1.marks = 67;
		Student s2 = new Student();
		s2.rollno = 002;
		s2.name = "B";
		s2.marks = 56;
		Student s3 = new Student();
		s3.rollno = 003;
		s3.name = "C";
		s3.marks = 79;
		Student stud []= new Student[3];
		stud [0] = s1;
		stud [1] = s2;
		stud [2] = s3;
		for (Student stu : stud) { //using enhanced for loop
			System.out.println(stu.rollno+":"+stu.name+":"+stu.marks);
		}
		//for (int i = 0; i<stud.length;i++){ // normal for loop
		//System.out.println(stud[i].rollno+":"+stud[i].name+":"+stud[i].marks);
		//}
	}
	

}
