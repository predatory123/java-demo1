package XueXiaoXiaoStudyJava.src.testdemon;

public class Test03Demon {
	public static void main(String[] args) {
			Long zahl = Long.parseLong(args[0]);
			System.out.println(zahl + " ��long��ȡֵ��Χ�ڣ�" + ((zahl >= Long.MIN_VALUE &&
					zahl <= Long.MAX_VALUE)));
			System.out.println(zahl + " ��int��ȡֵ��Χ�ڣ�" + ((zahl >= Long.MIN_VALUE &&
					zahl <= Long.MAX_VALUE)));
			System.out.println(zahl + " ��short��ȡֵ��Χ�ڣ�" + ((zahl >= Long.MIN_VALUE &&
					zahl <= Long.MAX_VALUE)));
			System.out.println(zahl + " ��byte��ȡֵ��Χ�ڣ�" + ((zahl >= Long.MIN_VALUE &&
					zahl <= Long.MAX_VALUE)));
	}
}
