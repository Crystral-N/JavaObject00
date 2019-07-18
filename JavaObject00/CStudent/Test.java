package CStudent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
			Student student = new Student();
			Class Student = student.getClass();
			Field[]declaredFields = Student.getDeclaredFields();
			for (int i = 0; i < declaredFields.length; i++) {
				Field field = declaredFields[i];		
			}
			for (int j = 1; j <4; j++) {
				Scanner scan = new Scanner(System.in);
				System.out.println("请输入学生信息：");
				System.out.println("学生"+j+"    "+student.toString());
				String name = scan.nextLine();
				Integer age = scan.nextInt();
				Double score = scan.nextDouble();
				try {
					File file = new File("e:\\StudentInformation.txt");
					String s = scan.nextLine();
					BufferedWriter writer = new BufferedWriter(new FileWriter(file));
					writer.write(s);
					writer.close();
					} catch (Exception e) {
					System.out.println(e);
					}
		
			}
			
		

	}

}
