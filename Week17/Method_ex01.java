package Week17;

public class Method_ex01 {
    public static void main(String[] args) {
        // method แบบที่1 ไม่มีการส่งค่าจาก method main และ ไม่มีการคืนค่ากลับจาก method
        // ลูก
        openFile();
        playFile();
        pauseFile();
        playFile();
        closeile();
    }

    public static void openFile() {

        System.out.println("Open Flie");
    }

    public static void playFile() {

        System.out.println("Play Music");
    }

    public static void pauseFile() {

        System.out.println("Stop Music");
    }
    public static void closeile() {

        System.out.println("Exit Music");
    }
}
