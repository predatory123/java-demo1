package xuexiaoxiao.demonifslese;

public class TestCase {
    public static void main(String[] args) {
        ausssen:    //循环标签
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + j);
                if(i == 5){
                    continue;
                }else {
                    continue ausssen;
                }
            }
        }
    }
}
