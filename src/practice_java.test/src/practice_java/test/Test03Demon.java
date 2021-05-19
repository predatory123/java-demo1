package practice_java.test.src.practice_java.test;
/*	ѭ����ϰ�������1��100֮���ż���� */
public class Test03Demon {
	public static void main(String[] args) {
		test1();
		test2();
		test3();	
	}
	// forѭ��
	public static void test1() {
		int j = 0;
		for(int i=1;i<=100;i++) {
			if(i % 2 ==0) {
				j += i;
			}
		}
		System.out.println(j);
	}
	// whileѭ��
	public static void test2() {
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			i++;
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	// do...whileѭ��
	public static void test3() {
		int sum = 0;
		int i = 1;
		do {
			i++;
			if(i % 2 == 0) {
				sum += i;
			}
		}while(i <= 100);
		System.out.println(sum);
	}
	
}
