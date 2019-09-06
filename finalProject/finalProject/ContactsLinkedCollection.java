package finalProject.finalProject;

import java.io.*;
import java.util.*;
import ch05.collections.*;

// linked list collection object to hold full contact list
public class ContactsLinkedCollection extends LinkedCollection<Contacts> {
   public ContactsLinkedCollection() {
      super();
   }
   
   // slightly modified get method from textbook
   // after finding a result, does not stop, and adds result to a separate collection
   // stops after parsing entire linked list
   ContactsArrayCollection searchResults;
   public ContactsArrayCollection getAll(String target) {
	  searchResults= new ContactsArrayCollection();
      location = head;
      found = false;
   
      while (location != null) {
         if (location.getInfo().getBusinessName().contains(target)){
            searchResults.add(location.getInfo());
            previous = location;
            location = location.getLink();
         } else if (location.getInfo().getLastName().contains(target)) {
            searchResults.add(location.getInfo());
            previous = location;
            location = location.getLink();
         } else {
            previous = location;
            location = location.getLink();
         }
      }
      return searchResults;
   }
   
   // returns full collection as a list to UsingContactsFile
   // used to simplify output of data back to CSV
   List<Contacts> searchResult ;
   public List<Contacts> fullList() {
      searchResult=new ArrayList<Contacts>();
      location = head;
      while (location != null) {
         searchResult.add(location.getInfo());
         previous = location;
         location = location.getLink();
      }
      return searchResult;
   }
   
   // same find method as textbook, only matches the uniqueID parameter of the objects

   public boolean findByID(int uniqueID) {
      location = head;
      found = false;
      //System.out.println(head);
      while (location != null) 
      {
    	  int id=location.getInfo().getUniqueID();
         if (id == uniqueID) {
        	 //System.out.println("ekhane true");
            found = true;
            return found;       
         }
         else
         {
        	// System.out.println("ekhane false"+ uniqueID+ "ami bujhtesina "+ location.getInfo().getUniqueID());
            previous = location;
            location = location.getLink();
            //System.out.println(location);
         }
      }
      return found;
   }
   
   public boolean removeContact(int uniqueID) {
      findByID(uniqueID);
      if(found) {
         if (head == location) {    
            head = head.getLink();    // remove first node
         } else {
            previous.setLink(location.getLink());  // remove node at location
         }
         numElements--;
      }
      return found;
   }
   boolean changeContactBool;
   public boolean changeContact(int uniqueID, Contacts updatedContact) {
      findByID(uniqueID);
      if(found) {
         location.setInfo(updatedContact);
         return true;
      }
      return false;
   }
}