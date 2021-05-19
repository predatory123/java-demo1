package XueXiaoXiaoStudyJava.src.testdemon;

public class Test04Demon {

	public static void main(String[] args) {
		//��ӡ100���ڵ�������ֻ�ܱ�1�ͱ�����������
		for(int i = 1;i<=100;i++) {
			boolean isVe = true;
			for(int j = 2;j< i; j++) {
				if(i % j == 0 ) {
					isVe = false;
					break;
				}
			}
			if(isVe) {
				System.out.println(i);
			}
		}
	}

}
