public class Bai_Tap_4 {
    public static void main(String[] args) {
        // Text blocks với """
        String greeting = """
            ======================
            HELLO, MODERN JAVA!
            ======================
            by Nguyen Thanh Dat - 65130423
            ======================
            """;
        System.out.println(greeting);

        // var - tự động suy luận kiểu
        var message = "Hello, World with var!";
        var number = 42;
        var list = java.util.List.of("Java", "Modern", "Features");

        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("List: " + list);
    }
}
