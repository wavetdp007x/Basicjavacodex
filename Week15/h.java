package Week15;

public class h {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย เข็มขัด", "นางสมใจ เข็มขัด", "นางสาวสมนึก เข็มขัด", "นายสมดี เข็มขัด","นางสาวสมฤทัย เข็มขัด" };
        System.out.println("มีรายชื่อประกอบ" + name.length + "คน");
        
        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].startsWith("นาย");
            if (check) {
                System.out.println((i+1) +name[i] + " ==> " +  "เพศชาย");
            } else {
                System.out.println( (i+1) +name[i] + " ==> " + "เพศหญิง"); 
            }
        } 
    }
}



// for (int g = 0; i < name.length; i++) {
 //System.out.println( i+1 + name[i] + " ==> ");

//System.out.println( i+1 + name[i] + " ==> ");
//System.out.println( "เพศชาย");

//System.out.println( i+1 + name[i] + " ==> ");  
//System.out.println("เพศหญิง");
//for (int g = 0; g < name.length; g++) {
    //   System.out.println((g+1 +" ===> "+name[g]));
    //}