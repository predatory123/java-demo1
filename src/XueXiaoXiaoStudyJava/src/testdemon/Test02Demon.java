package XueXiaoXiaoStudyJava.src.testdemon;
/*��дһ�����򣬶���26����ĸ�е��κ�һ������������ĸ�����������ĸ��
 * �������26�����A��ʼ���¼��㣬�Դ����ƣ�����ĸV��Ӧ��ĸB��*/
public class Test02Demon {
	public static void main(String[] args) {
		char bush = 'V';
		int baseNumber = 13;
		int alphe = 'A';
		bush -= alphe;
		bush += baseNumber;
		bush %= 26;
		bush += alphe;
		System.out.println(bush);
	}
}
