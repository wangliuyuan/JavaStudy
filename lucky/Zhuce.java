package lucky;

import java.util.Scanner;

public class Zhuce {
	static String [] name=new String [5];
	static String [] passport=new String [5];
	public static void zhuce() {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);

		String yhm="";
		String mm="";
		System.out.println("����д����ע����Ϣ��");
		System.out.println("�û�����");
		for(int i=0;i<name.length;i++) {
			if(name[i]==null) {
				 name[i]=input.next();
				 yhm=name[i];
				 break;
			}
		}
		System.out.println("���룺");
		for(int i=0;i<passport.length;i++) {
			if(passport[i]==null) {
				passport[i]=input.next();
				 mm=passport[i];
				 break;
			}
		}
		
		
		int max=9999;
		int min=1000;
		int cardNumber=(int)(Math.random()*(max-min))+min;
		System.out.println("\nע��ɹ�����Ǻ����Ļ�Ա����");
		System.out.println("�û���\t\t����\t\t��Ա����");
		System.out.println(yhm+"\t\t"+mm+"\t\t"+cardNumber);
		/*for(int i=0;i<passport.length;i++) {
			System.out.println(name[i]+"\t"+passport[i]);
		}*/
	}
	
}
