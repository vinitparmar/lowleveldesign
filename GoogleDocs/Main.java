package GoogleDocs;

public class Main {
  public static void main(String[] args) {

        Document document = new Document();

        Editor editor = new Editor();

        Command insert = new InsertTextCommand(document, "Hello ", 0);

        editor.executeCommand(insert);

        Command insert2 = new InsertTextCommand(document, "World", 6);

        editor.executeCommand(insert2);

        System.out.println(document.getContent());

        editor.undo();

        System.out.println(document.getContent());
    }
}