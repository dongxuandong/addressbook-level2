package seedu.addressbook.data.person;
 
 
 public class Contact {
   
   public String value;
   private boolean isPrivate;
   
   public Contact(boolean isPrivate){
       this.isPrivate = isPrivate;
   }
   
   @Override
   public String toString() {
         return value;
   }
 
   @Override
   public boolean equals(Object other) {
       return other == this // short circuit if same object
               || (other instanceof Contact // instanceof handles nulls
               && this.value.equals(((Contact) other).value)); // state check
   }
 
   @Override
   public int hashCode() {
       return value.hashCode();
   }
 
   public boolean isPrivate() {
       return isPrivate;
   }
   
   /**
    * Checks if a given string is a valid contact detail.
    */
    public static boolean isValidContact(String test, String REGEX) {
        return test.matches(REGEX);
    }
    
    /**
     * Set this value to new value
     * @param newValue
     */
       
 }
