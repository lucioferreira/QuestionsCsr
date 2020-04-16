import java.util.*;

public class Duplicated
{
    public static void main(String[] args) {
        
        
    LinkedList<Email> emails = new LinkedList<Email>();
    emails.add(new Email("title 1", "message 1"));
    emails.add(new Email("title 2", "message 2"));
    emails.add(new Email("title 2", "message 2"));
    emails.add(new Email("title 4", "message 4"));
    emails.add(new Email("title 5", "message 5"));
    emails.add(new Email("title 6", "message 6"));
    emails.add(new Email("title 5", "message 5"));
    emails.add(new Email("title 8", "message 8"));

    emails = removeDuplicatedEmail(emails);
    Iterator<Email> emailIterator = emails.iterator();
    while(emailIterator.hasNext()){
         System.out.println(emailIterator.next());
    }
    
    
    } // main
    
    private static LinkedList<Email> removeDuplicatedEmail(LinkedList<Email> list) {
        
        LinkedList<Email> tempList = new LinkedList<Email>();
        
        for(Email email : list){
            if(!tempList.contains(email)){
                tempList.add(email);   
            }
        }

        return tempList;
            
    } // removeDuplicatedEmail

} // Duplicated





