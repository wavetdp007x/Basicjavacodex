package Week15;

public class Array_ShowGender {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย เข็มขัด", "นางสมใจ เข็มขัด", "นางสาวสมนึก เข็มขัด", "นายสมดี เข็มขัด","นางสาวสมฤทัย เข็มขัด" };

        System.out.println("มีรายชื่อประกอบ" + name.length + "คน");
        for (int i = 0; i < name.length; i++) {

            boolean check = name[i].startsWith("นาย");

            if (check) {
                System.out.println(name[i]); 
                System.out.println( "เพศชาย");
            } else {
                System.out.println(name[i]); 
                System.out.println("เพศหญิง");
            }
        }
    }
}
