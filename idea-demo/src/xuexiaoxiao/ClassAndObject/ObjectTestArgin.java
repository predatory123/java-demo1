package xuexiaoxiao.ClassAndObject;
//  代码重构
public class ObjectTestArgin {
    public static void main(String[] args) {
        int zah1 = Integer.parseInt(args[0]);
        int zah2 = Integer.parseInt(args[1]);
        int zah3 = Integer.parseInt(args[2]);
        int zah4 = Integer.parseInt(args[3]);
        int zah5 = Integer.parseInt(args[4]);
        int zah6 = Integer.parseInt(args[5]);
        int zah7 = Integer.parseInt(args[6]);
        ObjextName(zah1, zah2, zah3, zah4, zah5, zah6, zah7);
    }

    private static void ObjextName(int zah1, int zah2, int zah3, int zah4, int zah5, int zah6, int zah7) {
        for (int i = 0; i <= 49; i++) {
            ObjectNameTest(zah1, zah2, zah3, zah4, zah5, zah6, zah7, i);
        }
    }

    private static void ObjectNameTest(int zah1, int zah2, int zah3, int zah4, int zah5, int zah6, int zah7, int i) {
        if (i == zah1 || i == zah2 || i == zah3 || i == zah4 || i == zah5 || i == zah6 || i == zah7) {
            System.out.println("|x|");
        } else {
            System.out.println("|_|");
        }
        ObjectNameTestValue(i);
    }

    private static void ObjectNameTestValue(int i) {
        if (i % 7 == 0) {
            System.out.println("");
        }
    }
}
