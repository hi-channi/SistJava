package day0211;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class FileReadWrite_05 {
	
	static final String FILENAME="C:\\Users\\admin\\Desktop\\sist0117\\javawork\\txt\\grade.txt";
	
	FileWriter fw;
	FileReader fr;
	BufferedReader br;
	Scanner sc=new Scanner(System.in);
	
	// main 메소드에서 메뉴 선택
	public int getMenu() {
		int num=0;
		System.out.println("1. 추가\t2. 전체출력\t0. 종료");
		num=Integer.parseInt(sc.nextLine());
		return num;
		}

	   
	// Write
	public void gradeIn() {
		// 이름, 점수
		System.out.println("학생명을 입력하세요: ");
		String name=sc.nextLine();
		System.out.println("점수를 입력하세요: ");
		int score=Integer.parseInt(sc.nextLine());
		
		// 파일 저장
		try {
			fw=new FileWriter(FILENAME,true);
			// 입력 내용 파일 저장
			fw.write(name+"\n");
			fw.write(score+"\n");
			System.out.println("학생 점수가 저장됨");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// Read
	public void fileRead() {
		// 제목부터 출력
		System.out.println("\t***학생 정보***");
		System.out.println("빈호\t이름\t점수\t학점");
		System.out.println("----------------------------------");
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			int cnt=0;
			while(true) {
				String name=br.readLine();
				
				if(name==null) {
					break;
				}
				
				int score=Integer.parseInt(br.readLine());
				
				// 학점 산출은 getGrade 메소드로 만들어 이곳에 호출
				char grade=getGrade(score);
				System.out.println(++cnt+"\t"+name+"\t"+score+"\t"+grade);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 학점 >> 점수를 인자로 넘겨서 char로 반환(String도 가능)
	public char getGrade(int score) {
		char ch;
		if(score>=90) {
			ch='A';
		} else if(score>=80) {
			ch='B';
		} else if(score>=70) {
			ch='C';
		} else if(score>=60) {
			ch='D';
		} else {
			ch='F';
		}
		return ch;
	}
	
	public static void main(String[] args) {
	      FileReadWrite_05 frw=new FileReadWrite_05();
	      
	      while(true)
	      {
	         int num=frw.getMenu();
	         
	         switch(num)
	         {
	         case 1:
	            System.out.println("학생 정보를 입력: ");
	            frw.gradeIn();
	            break;
	         case 2:
	            System.out.println("전체 학생정보를 출력");
	            frw.fileRead();
	            break;
	         case 0:
	            System.out.println("** 프로그램을 종료합니다. **");
	            System.exit(0);
	         default:
	            System.out.println("번호를 다시 한번 확인해주세요");
	         }
	      }
	   }
	}
