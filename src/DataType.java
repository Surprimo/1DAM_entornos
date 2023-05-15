public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    public static String gd(int code) {

        return switch (code) {
            case 20, 21, 22, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396 ->
                    "NUMERIC";
            case 1082, 1083, 1114, 1184, 1266, 12403 -> "DATE";
            case default -> "STRING";
        };
    }


}

