public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        System.out.println("*************Edit text*************");
        editor.write("1");
        editor.write("2");
        editor.write("3");
        editor.write("4");
        editor.write("5");
        editor.write("6");
        editor.write("7");
        editor.write("8");
        editor.write("9");
        System.out.println("*************Undo text*************");
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        System.out.println("*************No text to restore*************");
    }
}
