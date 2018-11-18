package lucky;

import java.util.Scanner;

public class Denglu {
	public static void denglu() {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String yhm=input.next();
		/*for(int i=0;i<Zhuce.passport.length;i++) {
			System.out.println(Zhuce.name[i]+"\t"+Zhuce.passport[i]);
		}*/
		for(int i=0;i<Zhuce.name.length;++i) {
			if(yhm.equals(Zhuce.name[i])==true) {
				for(int j=0;j<3;j++) {
					System.out.println("请输入密码：");
					String mm=input.next();
					if(mm.equals(Zhuce.passport[i])==true) {
						System.out.println("\n欢迎您："+yhm);
						break;
					}
					else {
						System.out.println("密码输入错误"+(j+1)+"次！请重新输入密码！");
					}
				}
				break;
			}
			if(i==Zhuce.name.length-1) {
				System.out.println("您还没有注册，请注册后登陆！");
				try
				{
				    Thread.sleep(1500);
				}
				catch (InterruptedException e)
				{
				    e.printStackTrace();
				}
				Caidan.xianshi();
			}
		}
	}
}
