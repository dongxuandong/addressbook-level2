package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.*;

enum Sign{ PLUS, MINUS;}

public class Tagging {
    
    public static final String PLUS_TAG = "+ ";
    public static final String MINUS_TAG = "- ";
    
   
    
    private Sign sign;
    private Person person;
    private Tag tag;
    private String prefix;
    
    public Tagging(Sign sign, Person person, Tag tag){ //Users can only either type "PLUS' OR "MINUS"
       this.sign = sign;
       this.person = person;
       this.tag = tag;
       
       if (Sign.PLUS == sign)
           this.prefix = PLUS_TAG;
       
       else
           this.prefix = MINUS_TAG;
           
    }
    public String getTagging() {
        return prefix + person.getName() + tag;
    }

}
