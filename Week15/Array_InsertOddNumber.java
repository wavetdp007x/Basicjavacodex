package Week15;

public class Array_InsertOddNumber {
    public static void main(String[] args) {
        int[] x = new int[10];

        // System.out.println(x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] +" "); // แสดงผลอาเรย์ก่อนเพิ่มข้อมูล
        }
        // เริ่มเพื่มข้อมูลเข้าไปในอาเรย์ทั้ง 10 ช่อง
        int number =1;
        for (int i = 0; i < x.length; i++) {
            x[i] = number;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]); // แสดงผลอาเรย์หลังเพิ่มข้อมูล
        }
    }
}
