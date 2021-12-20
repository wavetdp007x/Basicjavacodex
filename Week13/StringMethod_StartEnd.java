package Week13;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นายสมชาย เข็มขัด";

        // หาตำแหน่งของค่า .startswith()
        boolean result = fullname.startsWith("นาย");

        if (result) {
            System.out.println(fullname + "เพศชาย");
        } else {
            System.out.println(fullname + "เพศหญิง");
        }
        // หาตำแหน่งของคำจากด้านหลัง .endWith()
        String code = "2525849TH";

        boolean result1 = code.endsWith("TH");
        if (result1) {
            System.out.println("สินค้า" + code + "มาจากประเทศไทย");
        } else {
            System.out.println("สินค้า" + code + "ไม่ได้มาจากประเทศไทย");
        }
    }
}
