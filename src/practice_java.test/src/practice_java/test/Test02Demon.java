package practice_java.test.src.practice_java.test;
/* if�����ϰ
 *1.ʵ��ѧ���ɼ��ж� 
 *2.if �滻��Ԫ�����
*/
public class Test02Demon {
	public static void main(String[] args) {
		studentsGrade();
		compareValue();
	}
	public static void studentsGrade(){
		int score = -4;
		if(score <= 100 && score >= 90) {
			System.out.println("����");
		}else if(score <= 89 && score >= 80) {
			System.out.println("��");
		}else if(score <=79 && score >= 70) {
			System.out.println("��");
		}else if(score <=69 && score >= 60) {
			System.out.println("����");
		}else if(score < 60 && score >= 0) {
			System.out.println("������");
		}else {
			System.out.println("�ɼ�����");
		}
	}
	public static void compareValue() {
		int a = 22;
		int b = 50;
//		int max = a > b ? a : b;	//��һ��
		int max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("���ֵ��" + max);
	}
	
}
