public class TextMessage extends Message {
    private String text;

    public String getMessage(){
        return text;
    }

    public void setMessage(String text){
        this.text = text;
    }

    @Override
    public abstract getSize(){
        int txt_size = this.text.length();
        return txt_size;
    }
}
