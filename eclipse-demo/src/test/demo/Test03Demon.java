package test.demo;
/*	循环练习——求出1到100之间的偶数和 */
public class Test03Demon {
	public static void main(String[] args) {
		test1();
		test2();
		test3();	
	}
	// for循环
	public static void test1() {
		int j = 0;
		for(int i=1;i<=100;i++) {
			if(i % 2 ==0) {
				j += i;
			}
		}
		System.out.println(j);
	}
	// while循环
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
	// do...while循环
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
