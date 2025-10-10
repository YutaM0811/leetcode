import java.util.*;

class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
        columnNumber--;
        int reminder = columnNumber % 26;
        char c = (char) ('A' + reminder);
        sb.append(c);
        columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
