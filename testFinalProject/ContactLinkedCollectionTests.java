package testFinalProject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import finalProject.finalProject.Contacts;
import finalProject.finalProject.ContactsArrayCollection;
import finalProject.finalProject.ContactsLinkedCollection;
import finalProject.finalProject.UsingContactsFile;

class ContactLinkedCollectionTests {
	
	
	
	ContactsArrayCollection searchReturn = null;
	
	@Test
	void findByIDTestmin() {
	
		String fileName = "MOCK_DATA.csv";
	    UsingContactsFile contactsFile = new UsingContactsFile(fileName);
	    ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.findByID(1); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 	
	
	@Test
	void findByIDTestmax() {
		String fileName = "MOCK_DATA.csv";
	    UsingContactsFile contactsFile = new UsingContactsFile(fileName);
	    ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.findByID(10002); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
		fileName=null;
		contactsFile=null;
		contactList=null;
	} 	
	
	@Test
	void findByIDTestminplus() {	
		String fileName = "MOCK_DATA.csv";
	    UsingContactsFile contactsFile = new UsingContactsFile(fileName);
	    ContactsLinkedCollection contactList = contactsFile.importContactListCSV(); 
		boolean actual= contactList.findByID(2); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	
	
	@Test
	void findByIDTestmaxminus() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.findByID(10001); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	
	
	@Test
	void findByIDTestnom() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.findByID(5555); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	@Test
	void findByIDTestminminus() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.findByID(0); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	} 
	@Test
	void findByIDTestmaxplus() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.findByID(10003); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	
	
	//testing remove method with robust
	
	@Test
	void removemin() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();	boolean actual= contactList.removeContact(1); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	
	@Test
	void removemax() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.removeContact(10002); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	
	@Test
	void removeminplus() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.removeContact(2); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 

	@Test
	void removemaxminus() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.removeContact(10001); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	
	@Test
	void removenominal() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.removeContact(5555); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	@Test
	void removeminminus() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.removeContact(0); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	} 
	
	@Test
	void removemaxplus() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		boolean actual= contactList.removeContact(10003); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	
	
	Contacts cn= new Contacts("komola's", "komola", "apple", "angur", "banana", "litchi");
	
	//testing change contact method with robust
		@Test
		void changemin() {
			String fileName = "MOCK_DATA.csv";
	    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
	    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
			boolean actual= contactList.changeContact(1,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		
		@Test
		void changemax() {
			String fileName = "MOCK_DATA.csv";
	    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
	    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
			boolean actual= contactList.changeContact(10002,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		
		/*
		@Test
		void changeminplus() {
			String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
			boolean actual= contactList.changeContact(2,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changemaxminus() {
			String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
			boolean actual= contactList.changeContact(10001,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changenominal() {
			String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
			boolean actual= contactList.changeContact(5555,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		}
		*/
		/*
		@Test
		void changeminminus() {
			String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
			boolean actual= contactList.changeContact(0,cn); 
			System.out.println(actual);
			boolean expected=false;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changemaxplus() {
			String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
			boolean actual= contactList.changeContact(10003,cn); 
			System.out.println(actual);
			boolean expected=false;
			assertEquals(expected, actual);
		}
		*/
		
	 /*
	@Test
	void contactsArrayCOllectionTest1() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
	
		searchReturn = contactList.getAll("anika");
		contactList.findByID(1);
		String actual = "";
       for(int i = 0; i < searchReturn.size(); i++) {
    	   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
                   searchReturn.getIndex(i).getFirstName()+" "+
                   searchReturn.getIndex(i).getLastName()+" "+
                   searchReturn.getIndex(i).getStreetAddress()+" "+
                   searchReturn.getIndex(i).getEmail()+" "+
                   searchReturn.getIndex(i).getPhoneNumber()+"\n";
         }
       //System.out.println(actual);
		String expected="anika" + " "+ "anika"+" "+"tabassum"+" "+"123456"+" "+"3333"+" "+"2222"+"\n"+
				"anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n";
		//System.out.println(expected);
		
		assertEquals(expected, actual);
	}
	
	*/
	
	/*
	@Test
	void contactsArrayCOllectionTest2() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		//System.out.println(contactList);
		searchReturn = contactList.getAll("Zava");
		int actual= searchReturn.size();
		//// i found the expected value from the csv
		int expected=34;
		assertEquals(expected, actual);
	}
	*/
	/*
	List<Contacts> searchResult= searchResult=new ArrayList<Contacts>();
	
	@Test
	void fullListTest() {
		String fileName = "MOCK_DATA.csv";
    	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
		searchResult= contactList.fullList();
		//System.out.println(searchResult);
		int actual=searchResult.size();
	      
	       
	      // System.out.println(actual);
		int expected=10002;
		assertEquals(expected, actual);
	}
	*/

	
}
