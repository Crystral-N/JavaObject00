package CStudent;

public class Student {
		private String name;
		private int age;
		private double score;
		public Student() {
			
		}
		public Student(String name,int age,double score) {
			this.name = name;
			this.age = age;
			this.score = score;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}
		
		public String toString() {
			return "–’√˚£∫"+name+"-"+"ƒÍ¡‰£∫"+age+"-"+"≥…º®£∫"+score;
		}
	
}
