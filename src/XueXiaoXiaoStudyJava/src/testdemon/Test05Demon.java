package XueXiaoXiaoStudyJava.src.testdemon;
//��ӡ��������31�죬��������ʼ
public class Test05Demon {
	public static void main(String[] args) {
		int momnt = 6;
		int startTag = 2;
		//��������������Ч��
		if(momnt >= 0 && momnt <= 11 && startTag >= 0 && startTag <= 6) {
			//ȷ���·ݵ�����
			int tage;
			switch (momnt) {
			case 0: case 2: case 4: case 6: case 7: case 9: case 11:
				tage = 31;
				break;
			case 1:
				tage = 28;
				break;
			default:
				tage = 30;
			}
			//��������ʽ���
			System.out.println("|MO|DI|MI|DI|FR|SA|SO");
			int wochen = (tage + startTag) > 35 ? 6 : 5;
		for(int woche = 1; woche <= wochen; woche++) {
			for(int tag =1; tag <= 7; tag++) {
				int datum = tag + (woche-1)*7 - startTag;
				if(datum > 0 && datum <= tage) {
					System.out.println("|" + ((datum < 10) ? " ": "") + datum);
				}else {
					System.out.println("|  ");
				}
			}
		}System.out.println("|");
		}
	}

}
