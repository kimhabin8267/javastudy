import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i <= 6; i++) {
//		System.out.println((int)(Math.random()*45) + 1);
//	}
	    int com = (int)(Math.random()*100)+1;//com = ��ǻ�Ͱ� ������ �ִ� ��
	    //System.out.print(com);
	    Scanner scan = new Scanner(System.in);
	    int you;//���� �Է��ϴ� ��
	    int count = 0;//�Է��� Ƚ��
	    while(true) {
	    	count++;
	    	System.out.print("1~100������ �� �� �ϳ��� �Է��ϼ���: ");
	    	you = scan.nextInt();
	    	if(you < com) {
	    		System.out.println("�� �� ū ���� �Է��ϼ���");
	    	}else if(you > com) {
	    		System.out.println("�� �� ���� ���� �Է��ϼ���");
	    	}else {
	    		System.out.println("�����Դϴ�!"); break;
	    	}
	    }
	    System.out.println(count + "�� ���� ���߼̽��ϴ�!");
	    if(count <= 4) {
	    	System.out.println("great!");
	    }else if(count <= 8) {
	    	System.out.println("good!");
	    }else {
	    	System.out.println("����ϼ���!");
	    }
	}

}
