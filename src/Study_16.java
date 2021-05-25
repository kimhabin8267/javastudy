import java.util.Scanner;

public class Study_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score[] = new int[10];
//		Scanner scan = new Scanner(System.in);
//		double sum = 0.0;
//		double average = 0.0;
//		
//		for(int i = 0; i < score.length; i++) {
//			System.out.print((i + 1) + "번 학생의 점수를 입력하세요 : ");
//			score[i] = scan.nextInt();
//			sum += score[i];
//		}
//		average = sum / score.length;
//		System.out.println();
//		System.out.println("총점 : "  + sum);
//		System.out.println("평균 : " + average);

		//배열 name 생성, 몇명, 국어, 영어, 수학 점수를 입력받아, 총점과 평균 구하기
		int totalSum = 0; //전체총점
		int totalAverage = 0; //전체평균
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 입력 : ");
		int num = sc.nextInt();
		
		String name[] = new String[num];
		int score[][] = new int[num][5];
		
		for(int i = 0; i < num; i++) {
			System.out.print((i + 1) + "번 학생 이름 : ");
			name[i] = sc.next();
			
			System.out.print("국어 : ");
			score[i][0] = sc.nextInt();
			System.out.print("영어 : ");
			score[i][1] = sc.nextInt();
			System.out.print("수학 : ");
			score[i][2] = sc.nextInt();
			
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = (int)(score[i][3] / 3);
			totalSum += score[i][3];
			totalAverage += score[i][4];
		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println("이름     국어       영어      수학      총점      평균");
		System.out.println("=====================================");
	for(int i = 0; i < name.length; i++) {
		System.out.print(name[i] + "\t");
		for(int j = 0 ; j < 5; j++) {
			System.out.print(score[i][j] + "\t");
			}
		System.out.println();
	}
	System.out.println("================================");
	System.out.println("전체총점: " + totalSum);
	System.out.println("전체평균: " + (int)(totalAverage/num));
		
	
	}

}
