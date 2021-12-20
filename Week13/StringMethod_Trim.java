package Week13;

public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname = " Suksawat Saelim ";

        int count = fullname.length();
        System.out.println(count);
        System.out.println("before =>"+fullname);

        // .trim() ตัดช่องว่างหน้าหลังออก

       String result = fullname.trim();
       System.out.println("after ==>"+result);

       //.indexOf()  แสดงผลตำแหน่งที่ของอักษร
        System.out.println(fullname.indexOf("sa", 8));

        //.toUppercase()   .tolowerCase()
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());

        //
        
    }
}
