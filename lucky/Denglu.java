package lucky;

import java.util.Scanner;

public class Denglu {
	public static void denglu() {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		String yhm=input.next();
		/*for(int i=0;i<Zhuce.passport.length;i++) {
			System.out.println(Zhuce.name[i]+"\t"+Zhuce.passport[i]);
		}*/
		for(int i=0;i<Zhuce.name.length;++i) {
			if(yhm.equals(Zhuce.name[i])==true) {
				for(int j=0;j<3;j++) {
					System.out.println("���������룺");
					String mm=input.next();
					if(mm.equals(Zhuce.passport[i])==true) {
						System.out.println("\n��ӭ����"+yhm);
						break;
					}
					else {
						System.out.println("�����������"+(j+1)+"�Σ��������������룡");
					}
				}
				break;
			}
			if(i==Zhuce.name.length-1) {
				System.out.println("����û��ע�ᣬ��ע����½��");
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
