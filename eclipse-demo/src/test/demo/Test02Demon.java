package test.demo;
/* if语句练习
 *1.实现学生成绩判断 
 *2.if 替换三元运算符
*/
public class Test02Demon {
	public static void main(String[] args) {
		studentsGrade();
		compareValue();
	}
	public static void studentsGrade(){
		int score = -4;
		if(score <= 100 && score >= 90) {
			System.out.println("优秀");
		}else if(score <= 89 && score >= 80) {
			System.out.println("好");
		}else if(score <=79 && score >= 70) {
			System.out.println("良");
		}else if(score <=69 && score >= 60) {
			System.out.println("及格");
		}else if(score < 60 && score >= 0) {
			System.out.println("不及格");
		}else {
			System.out.println("成绩错误");
		}
	}
	public static void compareValue() {
		int a = 22;
		int b = 50;
//		int max = a > b ? a : b;	//第一种
		int max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println("最大值：" + max);
	}
	
}
