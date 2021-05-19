package XueXiaoXiaoStudyJava.src.testdemon;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test01Demon {
	public static void main(String[] args) {
		float a = 0.34F;
		System.out.println(a);
		
//		short einShort = 2343434;	//�������Χ 
//		long einLong = 1234_5678_5678;   // ȱ��L
		int einInt = 2244____2244;
		double einDouble = 2D;
		double einDouble1 = 2.0_0_0D;
		float einFloat = 2.0000000F;
		float einFloat1 = 0.20F;
		
		/*���ظ߾���3.33333333......*/
		BigDecimal zeHe = new BigDecimal("10"); 
		BigDecimal drei = new BigDecimal("3");
		BigDecimal ergebnis = zeHe.divide(drei,16,RoundingMode.HALF_UP);
		System.out.println(ergebnis);

	}
}
