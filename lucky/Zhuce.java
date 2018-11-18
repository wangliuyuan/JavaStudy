package lucky;

import java.util.Scanner;

public class Zhuce {
	static String [] name=new String [5];
	static String [] passport=new String [5];
	public static void zhuce() {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);

		String yhm="";
		String mm="";
		System.out.println("请填写个人注册信息：");
		System.out.println("用户名：");
		for(int i=0;i<name.length;i++) {
			if(name[i]==null) {
				 name[i]=input.next();
				 yhm=name[i];
				 break;
			}
		}
		System.out.println("密码：");
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
		System.out.println("\n注册成功，请记好您的会员卡号");
		System.out.println("用户名\t\t密码\t\t会员卡号");
		System.out.println(yhm+"\t\t"+mm+"\t\t"+cardNumber);
		/*for(int i=0;i<passport.length;i++) {
			System.out.println(name[i]+"\t"+passport[i]);
		}*/
	}
	
}
