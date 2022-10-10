package test;

public class Sample {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        Teacher teacher1 = new Teacher("test1","张三",20,"2000");
        Teacher teacher2 = new Teacher("test2","李四",30,"1990");
        Teacher teacher3 = new Teacher("test3","王五",25,"1997");
        teachers[0] = teacher1;
        teachers[1] = teacher2;
        teachers[2] = teacher3;
        Teacher[] newTeachers = new Teacher[2];

        int index = 0;
        int newLen = newTeachers.length;
        for (int i = 0; i < teachers.length; i++) {
            if (i == 0){
                newTeachers[i] = teachers[i+1];
            }
            if (i != index){
                if (i == 0){
                    newTeachers[i] = teachers[i+1];
                }
                if (i < newLen) {
                    newTeachers[i] = teachers[i];
                }
                else if  (i >= newLen) {
                    newTeachers[i - 1] = teachers[i];

                }
            }
        }

        teachers = newTeachers;

        for (int j = 0; j < newTeachers.length; j++) {
            System.out.println(teachers[j].getId() + teachers[j].getName()+teachers[j].getAge()+teachers[j].getBirthday());
        }
    }
}
