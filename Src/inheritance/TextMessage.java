public class TextMessage extends Message {
    public String text;

    public String getMessage(){
        return text;
    }

    public void setMessage(String text){
        this.text = text;
    }

    @Override
    public int getSize(String text){
        int size = text.length();
    }
}
