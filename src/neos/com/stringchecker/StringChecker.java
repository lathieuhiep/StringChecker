package neos.com.stringchecker;

public class StringChecker {
    // phương thức kiểm tra số nguyên
    private boolean isInteger(String input) {
        try {
            Integer.parseInt(input);

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // phương thức kiểm tra số thực
    private boolean isDouble(String input) {
        try {
            Double.parseDouble(input);

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // phương thức kiểm tra kiểu logic
    private boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    // phương thức kiểm tra chuỗi
    public String checkStringType(String input) {
        if ( isInteger( input ) ) {
            return "Số nguyên";
        } else if ( isDouble( input ) ) {
            return "Số thực";
        } else if ( isBoolean( input ) ) {
            return "Kiểu logic";
        } else {
            return "Undefined";
        }
    }
}
