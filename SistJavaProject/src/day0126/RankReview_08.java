package day0126;

public class RankReview_08 {
	public static void main(String[] args) {
		/*
		 * 각 학생들의 점수에 대한 총점, 평균, 등수를 구해 출력
		 * 번호, 이름, 자바, 오라클, 총점, 평균, 등수
		 */
		
		String[] student= {"강나리","곽경태","김은비","김종민","김주찬"};
		int[] java= {99,78,89,67,100};
		int[] oracle= {77,66,88,99,56};
		int[] tot=new int[5];
		int[] rank=new int[5];
		double[] avg=new double[5];
		
		// 총점, 평균 구하기
		for(int i=0;i<student.length;i++) {
			tot[i]=java[i]+oracle[i];
			avg[i]=tot[i]/2;
			}
		// 등수 구하기
		for(int i=0;i<student.length;i++) {
			rank[i]=1; // for문이 돌 때마다 i값을 1로 초기화
			for(int j=0;j<student.length;j++) {
				if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
		}
		// 출력
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균\t등수");
		for(int i=0;i<student.length;i++) {
			System.out.println(i+1+"\t"+student[i]+"\t"+java[i]+
					"\t"+oracle[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+rank[i]);
		}
	}
}

