package Week5;
public class CompareData {
    public static void main(String[] args) {
        //การเปรียบเทียบ ผลลัพธ์จะได้ True / False
        int a = 10 , b = 5;

        System.out.println(a + " มีค่าเท่ากับ " + b + " หรือไม่ ? " + (a==b)); // = =
        System.out.println(a + " มีค่าไม่เท่ากับ " + b + " หรือไม่ ? " + (a!=b));
        System.out.println(a + " มีค่าน้อยกว่า " + b + " หรือไม่ ? " + (a<b));
        System.out.println(a + " มีค่ามากกว่า " + b + " หรือไม่ ? " + (a>b));
        System.out.println(a + " มีค่าน้อยกว่าหรือเท่ากลับ " + b + " หรือไม่ ? " + (a<=b));
        System.out.println(a + " มีค่ามากกว่าหรือเท่ากลับ " + b + " หรือไม่ ? " + (a>=b));

       // boolean  c = a==b;
        //System.out.println(c);

    }
}