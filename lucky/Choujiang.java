package lucky;

import java.util.Scanner;

public class Choujiang {
	public static void choujiang() {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		int max=9999;
		int min=1000;
		int [] cardNumber=new int [5];
		System.out.println("请输入您的卡号：");
		int kh=input.nextInt();
		System.out.print("今日的幸运数字为：");
		for(int i=0;i<4;i++) {
			cardNumber[i]=(int)(Math.random()*(max-min))+min;
			System.out.print(cardNumber[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<5;++i) {
			if(kh==cardNumber[i]) {
				System.out.println("恭喜！您是本日的幸运会员！");
				break;
			}
			if(i==4) {
				System.out.println("抱歉！您不是本日的幸运会员！");
			}
		}
		
		
	}
}
