public class Main {

    public static void main(String[] args) {
        String inputText = "KURS PROGRAMOWANIA W JAVIE";
        System.out.println("Wiadomość: " + inputText);
        Cezar cezarCode = new Cezar();
        String encryptedText = cezarCode.encryptText(inputText);
        System.out.println("Zakodowana wiadomość: " + encryptedText);
        String decryptedText = cezarCode.decryptText(encryptedText);
        System.out.println("Odkodowana wiadomość: " + decryptedText);
    }

}
