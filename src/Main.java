public class Main {

    public static void main(String[] args) {
        String inputText = "KURS PROGRAMOWANIA W JAVIE";
        System.out.println("Wejcie: " + inputText);
        char[] inputTextTable = new char[inputText.length()];
        for (int index = 0; index < inputTextTable.length; index++) {
            inputTextTable[index] = inputText.charAt(index);
        }
        char[] codedTextTable = new char[inputText.length()];
        int tmp = 0;
        System.out.print("Zakodowane: ");
        for (int index = 0; index < inputTextTable.length; index++) {
            tmp = (int) inputTextTable[index];
            if (tmp != 32 && tmp != 88 && tmp != 89 && tmp != 90) {
                tmp += 3;
            } else if (tmp == 88) {
                tmp = 65;
            } else if (tmp == 89) {
                tmp = 66;
            } else if (tmp == 90) {
                tmp = 67;
            }
            codedTextTable[index] = (char) tmp;
            System.out.print(codedTextTable[index]);
        }
        System.out.println();
        System.out.print("Odkodowane: ");
        char[] uncodedTextTable = new char[inputText.length()];
        for (int index = 0; index < codedTextTable.length; index++) {
            tmp = (int) codedTextTable[index];
            if (tmp != 32 && tmp != 65 && tmp != 66 && tmp != 67) {
                tmp -= 3;
            } else if (tmp == 65) {
                tmp = 88;
            } else if (tmp == 66) {
                tmp = 89;
            } else if (tmp == 67) {
                tmp = 90;
            }
            uncodedTextTable[index] = (char) tmp;
            System.out.print(uncodedTextTable[index]);
        }
    }

}
