package Week13;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Premkic";
        String lastname2 = "premkic";

        boolean result = lastname1.equalsIgnoreCase(lastname2);
        System.out.println(result);

        if (result) {
            System.out.println(lastname1 + "เท่ากับ" + lastname2);
        } else {
            System.out.println(lastname1 + "ไม่เท่ากับ" + lastname2);
        }
    }

}
