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
//			System.out.print((i + 1) + "�� �л��� ������ �Է��ϼ��� : ");
//			score[i] = scan.nextInt();
//			sum += score[i];
//		}
//		average = sum / score.length;
//		System.out.println();
//		System.out.println("���� : "  + sum);
//		System.out.println("��� : " + average);

		//�迭 name ����, ���, ����, ����, ���� ������ �Է¹޾�, ������ ��� ���ϱ�
		int totalSum = 0; //��ü����
		int totalAverage = 0; //��ü���
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� �Է� : ");
		int num = sc.nextInt();
		
		String name[] = new String[num];
		int score[][] = new int[num][5];
		
		for(int i = 0; i < num; i++) {
			System.out.print((i + 1) + "�� �л� �̸� : ");
			name[i] = sc.next();
			
			System.out.print("���� : ");
			score[i][0] = sc.nextInt();
			System.out.print("���� : ");
			score[i][1] = sc.nextInt();
			System.out.print("���� : ");
			score[i][2] = sc.nextInt();
			
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = (int)(score[i][3] / 3);
			totalSum += score[i][3];
			totalAverage += score[i][4];
		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println("�̸�     ����       ����      ����      ����      ���");
		System.out.println("=====================================");
	for(int i = 0; i < name.length; i++) {
		System.out.print(name[i] + "\t");
		for(int j = 0 ; j < 5; j++) {
			System.out.print(score[i][j] + "\t");
			}
		System.out.println();
	}
	System.out.println("================================");
	System.out.println("��ü����: " + totalSum);
	System.out.println("��ü���: " + (int)(totalAverage/num));
		
	
	}

}
