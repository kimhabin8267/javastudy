import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i <= 6; i++) {
//		System.out.println((int)(Math.random()*45) + 1);
//	}
	    int com = (int)(Math.random()*100)+1;//com = 컴퓨터가 가지고 있는 수
	    //System.out.print(com);
	    Scanner scan = new Scanner(System.in);
	    int you;//내가 입력하는 수
	    int count = 0;//입력한 횟수
	    while(true) {
	    	count++;
	    	System.out.print("1~100까지의 수 중 하나를 입력하세요: ");
	    	you = scan.nextInt();
	    	if(you < com) {
	    		System.out.println("좀 더 큰 수를 입력하세요");
	    	}else if(you > com) {
	    		System.out.println("좀 더 작은 수를 입력하세요");
	    	}else {
	    		System.out.println("정답입니다!"); break;
	    	}
	    }
	    System.out.println(count + "번 만에 맞추셨습니다!");
	    if(count <= 4) {
	    	System.out.println("great!");
	    }else if(count <= 8) {
	    	System.out.println("good!");
	    }else {
	    	System.out.println("노력하세요!");
	    }
	}

}
