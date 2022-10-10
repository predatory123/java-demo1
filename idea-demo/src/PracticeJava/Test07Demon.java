package PracticeJava;
/* 数组
1.动态初始化(指定长度)
    数据类型[] 数组名称 = New 数据类型[数组长度]
    如：int[] maxNum = new int[3];
2.静态初始化(指定内容)
    标准格式
        数据类型[] 数组名称 = New 数据类型[] {元素1，元素2，元素3。。。。。。}
    省略格式
        数据类型[] 数组名称 = {元素1，元素2，元素3。。。。。。}
3.注意事项
    3.1 静态初始化没有直接指定长度，但是仍然会自动推算得到长度
    3.2 静态初始化标准格式可以拆分为两个步骤
    3.3 动态初始化也可以拆分为两个步骤
    3.4 静态初始化一旦使用省略格式，就不能拆分为两个步骤了
*/
public class Test07Demon {
    public static void main(String[] args) {
        int[] maxA = new int[30]; //动态初始化
        int[] maxB = new int[] {5,15,20}; //静态初始化-标准格式
        int[] maxC = {5,15,20}; //静态初始化-省略格式

        //静态初始化拆分
        int[] maxD;
        maxD = new int[] {5,15,20};

        //动态初始化拆分
        int[] maxE;
        maxE = new int[5];
    }
}
