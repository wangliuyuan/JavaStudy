package lucky;

import java.util.Scanner;

public class Choujiang {
	public static void choujiang() {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		int max=9999;
		int min=1000;
		int [] cardNumber=new int [5];
		System.out.println("���������Ŀ��ţ�");
		int kh=input.nextInt();
		System.out.print("���յ���������Ϊ��");
		for(int i=0;i<4;i++) {
			cardNumber[i]=(int)(Math.random()*(max-min))+min;
			System.out.print(cardNumber[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<5;++i) {
			if(kh==cardNumber[i]) {
				System.out.println("��ϲ�����Ǳ��յ����˻�Ա��");
				break;
			}
			if(i==4) {
				System.out.println("��Ǹ�������Ǳ��յ����˻�Ա��");
			}
		}
		
		
	}
}
