import java.util.*;

class Email{
    private String title;
    private String message;
    
    public Email(String title, String message){
        this.title = title;
        this.message = message;
    }
    
    public String toString(){
        return "title: " + this.title + " - msg: " + this.message;
        // System.out.println("title: " + this.title + " - msg: " + this.message);
    }
    
    @Override
    public boolean equals(Object obj){
    if (obj == null) {
            return false;
        }

        if (!Email.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        final Email other = (Email) obj;
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }

        // if (this.message != other.message) {
        if (!this.message.equals(other.message)) {
            return false;
        }

        return true;

    }
}