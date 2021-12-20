package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ array
        // แบบที่1 : ประกาศแบบกำหนดสมาชิก
        int [] number = {1,2,3,44,34,54,77,11,9};

        int size = number.length;

        System.out.println(size);
        System.out.println(number.length);
        System.out.println(number[3]); //การเข้าถึงตำแหน่งของตัวแปร
        number[3] = 88; 
        System.out.println(number[3]);

        //แบบที่2 : ประกาศแบบกำหนดขนาด
        //ประกาสศอาเรย์
        //char [] alphabet;  //ประกาสศอาเรย์
        //alphabet = new char [26]; //สร้างอาเรย์

        char [] alphabet = new char[26]; //ประกาสศอาเรย์และสร้างอาเรย์
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';

        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);
        System.out.println(alphabet.length);

        int []num = new int [10];
        System.out.println(num[9]);

    }
}
