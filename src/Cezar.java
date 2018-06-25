import java.io.IOException;

public class Cezar {

    public String encryptText(String inputText) throws IOException {
        char[] inputTextTable = inputText.toCharArray();
        char[] codedTextTable = new char[inputText.length()];
        int tmp;
        for (int index = 0; index < inputTextTable.length; index++) {
            tmp = (int) inputTextTable[index];
            if (tmp > 64 && tmp < 88) {
                tmp += 3;
            } else if (tmp > 87 && tmp < 91) {
                tmp -= 23;
            } else if (tmp == 32) {
            } else {
                throw new IOException();
            }
            codedTextTable[index] = (char) tmp;
        }
        return new String(codedTextTable);
    }

    public String decryptText(String inputText) throws IOException {
        char[] inputTextTable = inputText.toCharArray();
        char[] uncodedTextTable = new char[inputText.length()];
        int tmp;
        for (int index = 0; index < inputTextTable.length; index++) {
            tmp = (int) inputTextTable[index];
            if (tmp > 67 && tmp < 91) {
                tmp -= 3;
            } else if (tmp > 64 && tmp < 68) {
                tmp += 23;
            } else if (tmp == 32) {
            } else {
                throw new IOException();
            }
            uncodedTextTable[index] = (char) tmp;
        }
        return new String(uncodedTextTable);
    }

}
