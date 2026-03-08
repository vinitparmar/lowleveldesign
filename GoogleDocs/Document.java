package GoogleDocs;

public class Document {
    
    private StringBuilder content =  new StringBuilder();

    public void insertText(int pos , String text){
        content.insert(pos, text);
    }

    public void deleteText(int pos , int length){
        content.delete(pos, pos+length);
    }

    public String getContent(){
        return content.toString();
    }
}
