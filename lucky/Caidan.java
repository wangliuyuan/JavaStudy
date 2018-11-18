package lucky;

import java.util.Scanner;

public class Caidan {
	public static void xianshi() {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("*****欢迎进入奖客富翁系统*****");
		System.out.println("\t1.注册");
		System.out.println("\t2.登陆");
		System.out.println("\t3.抽奖");
		System.out.println("*****************************\n");
		System.out.println("请选择菜单：");
		int cd=input.nextInt();
		switch (cd) {
		case 1:
			System.out.println("[奖客富翁系统 > 注册]");
			Zhuce.zhuce();
			break;
		case 2:
			System.out.println("[奖客富翁系统 > 登陆]");
			Denglu.denglu();
			break;
		case 3:
			System.out.println("[奖客富翁系统 > 抽奖]");
			Choujiang.choujiang();
			break;

		default:
			System.out.println("您的输入有误！");
			break;
		}
		System.out.println("继续吗？（y/n）:");
		String jx=input.next();
		switch (jx) {
		case "y":
			xianshi();
			break;
		case "n":
			System.out.println("系统退出，谢谢使用！");
			break;
		default:
			System.out.println("您的输入有误！");
			break;
		}
		
	}
}
