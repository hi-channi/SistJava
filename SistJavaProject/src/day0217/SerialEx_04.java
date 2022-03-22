package day0217;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Apple implements Serializable {
	String name;
	int age;

	public Apple(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public void write() {
		System.out.println("이름:" + name + ",나이:" + age);
	}
}

public class SerialEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일에 Object 통째로 생성
		Apple a1 = new Apple("수지", 23);

		FileOutputStream fs = null;
		ObjectOutputStream ob = null;

		try {
			fs = new FileOutputStream("C:\\sist0117\\javawork\\SistJavaProject\\apple.txt");
			ob = new ObjectOutputStream(fs);

			// 객체를 저장
			ob.writeObject(a1);

			System.out.println("Apple파일에 저장됨");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {

		} finally {
			try {
				fs.close();
				ob.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}