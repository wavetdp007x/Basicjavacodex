package Week17;

public class Method_ex03 {
    // method แบบที่3 ไม่มีการรับค่าส่งมาจาก method program แต่ล๔กส่งคืนแม่
    public static void main(String[] args) {
        int phone = getPhoneNumber();
        System.out.println(phone);
        
        int lucky = 999;
        int newphone = phone + lucky;
        System.out.println(newphone);
    }

    static int getPhoneNumber() {
        return 123456;

    }

}
