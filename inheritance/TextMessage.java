public class TextMessage extends Message {
    private String text;

    public String getMessage(){
        return text;
    }

    public void setMessage(String text){
        this.text = text;
    }
}
