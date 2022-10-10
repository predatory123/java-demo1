package test;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("n001","张三",20,"1999");
        teachers[1] = new Teacher("n002","李四",30,"1966");
        teachers[2] = new Teacher("n003","王五",40,"2014");

        for (Teacher teacher : teachers) {
            System.out.println(teacher.getId() + teacher.getName() + teacher.getAge() + teacher.getBirthday());
        }

        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i].getId()+teachers[i].getName());
        }
    }
}
