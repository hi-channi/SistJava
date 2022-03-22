package day0127;

public class ArraysSortEx_05 {
	public static void main(String[] args) {
		String[] name= {"이효리","강호동","김태희","유재석","하하"};
		int[] age= {39,45,33,38,32};
		/*
		 * 번호	이름
		 * 1	강호동
		 * 2	김태희
		 * 
		 * 이름의 오름차순으로 출력하시오
		 */
		
		for(int i=0;i<name.length-1;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].compareTo(name[j])>0) {
					String temp=name[i];
					name[i]=name[j];
					name[j]=name[i];
				}
			}
		}
		System.out.println("번호\t이름\t나이");
		for(int i=0;i<name.length;i++) {
			System.out.println(i+1+"\t"+name[i]+"\t"+age[i]);
			
		}
	}
}
