package lucky;

import java.util.Scanner;

public class Caidan {
	public static void xianshi() {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.println("\t1.ע��");
		System.out.println("\t2.��½");
		System.out.println("\t3.�齱");
		System.out.println("*****************************\n");
		System.out.println("��ѡ��˵���");
		int cd=input.nextInt();
		switch (cd) {
		case 1:
			System.out.println("[���͸���ϵͳ > ע��]");
			Zhuce.zhuce();
			break;
		case 2:
			System.out.println("[���͸���ϵͳ > ��½]");
			Denglu.denglu();
			break;
		case 3:
			System.out.println("[���͸���ϵͳ > �齱]");
			Choujiang.choujiang();
			break;

		default:
			System.out.println("������������");
			break;
		}
		System.out.println("�����𣿣�y/n��:");
		String jx=input.next();
		switch (jx) {
		case "y":
			xianshi();
			break;
		case "n":
			System.out.println("ϵͳ�˳���ллʹ�ã�");
			break;
		default:
			System.out.println("������������");
			break;
		}
		
	}
}
