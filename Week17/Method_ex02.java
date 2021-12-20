package Week17;

public class Method_ex02 {
    // method แบบที่2  มีการรับค่าที่ส่งจาก main program แต่ ไม่มีการส่งค่าออก
    public static void main(String[] args) {
        display("ดีใจจัง เรียนใกล้จบ");
        display("ไปตลาดให้หน่อยลูก");
        fullname("Suda","Maneenuch");
    }

    static void display (String x ){
        System.out.println(x);
    }
    static void fullname (String fname, String lname ){
        System.out.println(fname + " " + lname);
    }
}
