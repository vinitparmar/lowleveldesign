package GoogleDocs;

public class DeleteTextCommand implements Command {

    private Document document;
    private int position;
    private int length;
    private String deletedText;

     public DeleteTextCommand(Document document, int position, int length) {
        this.document = document;
        this.position = position;
        this.length = length;
    }


    @Override
    public void execute() {
        deletedText = document.getContent()
                        .substring(position , position + length);
       document.deleteText(position, position + length);
    }

    @Override
    public void undo() {
        document.insertText(position, deletedText);
    }
    
}
