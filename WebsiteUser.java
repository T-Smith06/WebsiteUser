/*Class:		CSE 1323L/W01
Date:			9/19/2019  
Name:			Terrence Smith
Assgnmt Name:	Website User   
Assignment#:	Module 2B - Website User
Resources: 		Introduction to Java Programming and Data Structures: Comp Version 11th e, 
 				Ch. 9. Used ideas from Lab 2A. Also google on how to select chars w/in a string
				nice work keep practising bro */

import java.util.Random;

public class WebsiteUser {
	private String userID = "";
	private String password = "";
	private String reentPassword = "";
	private String eAddress = "";
	private String lName = "";
	private String fName = "";
	private String zip = "";
	//constructor with parameters
	WebsiteUser(String password, String reentPassword, String eAddress, String fName, String lName, String zip) {
//		this.userID = userID;
		this.password = password;
		this.reentPassword = reentPassword;
		this.eAddress = eAddress;
		this.lName = lName;
		this.fName = fName;
		this.zip = zip;
	}
	//method to get user ID
	public String getUserID() {
		return userID;
	}
	//method to set user ID
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getReentPassword() {
		return reentPassword;
	}
	
	public void setReentPassword(String reentPassword) {
		this.reentPassword = reentPassword;
	}
	
	public String getEAddress() {
		return eAddress;
	}
	
	public void setEAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	
	public String getLName() {
		return lName;
	}
	
	public void setLName(String lName) {
		this.lName = lName;
	}
	
	public String getFName() {
		return fName;
	}
	
	public void setFName(String fName) {
		this.fName = fName;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	//method to return results from objects
	public String toString() {
		return password + reentPassword + eAddress + fName + lName + zip;
	}
	//method to create ID
	public String createID() {
		char fLetter = fName.charAt(0);
		char lLetter1 = lName.charAt(lName.length()-2);
		char lLetter2 = lName.charAt(lName.length()-1);
		char fZip1 = zip.charAt(0);
		char fZip2 = zip.charAt(1);
		char fZip3 = zip.charAt(2);
		//gets random number between 1 and 999
		Random rand = new Random();
		int num1 = rand.nextInt(1000);
		//pulls the  char value of string from the location provide within variable
		String userID = String.valueOf(fLetter)+String.valueOf(lLetter1)+String.valueOf(lLetter2)+
				String.valueOf(fZip1)+String.valueOf(fZip2)+String.valueOf(fZip3)+num1;
		return userID;
	}
	//determines if password and re-entered password are the same
	public boolean passwordTest() {
		boolean result = (password == reentPassword);
		return result;
	}

}

class TestWebsiteUser {
	//user output
	public static void main(String[] args) {
		WebsiteUser user1 = new WebsiteUser("Eagle02","Eagle02,","smith_15@yahoo.com","Terrence","Smith","30078");
		
		user1.setPassword("Eagle02");
		System.out.println("Password: "+ user1.getPassword());
		
		user1.setReentPassword("Eagle02");
		System.out.println("Re-entered Password: "+ user1.getReentPassword());
		
		user1.setEAddress("smith_15@yahoo.com");
		System.out.println("Email Address:"+ user1.getEAddress());
		
		user1.setFName("Terrence");
		System.out.println("First Name: "+ user1.getFName());
		
		user1.setLName("Smith");
		System.out.println("Last Name: "+ user1.getLName());
		
		user1.setZip("30078");
		System.out.println("Zip code: "+ user1.getZip());
		
		System.out.println("toString method results: "+ user1.toString());
		
		user1.createID();
		System.out.println("User ID: "+ user1.createID());
		
		boolean samePass1 = user1.passwordTest();
		if(samePass1 == true)
			System.out.println("Passwords match");
		else 
			System.out.println("Passwords don't match");
		
		System.out.println();
		
		WebsiteUser user2 = new WebsiteUser("Ball24","Ball42,","black_99@yahoo.com","Tocky","Black","63798");

		user2.setPassword("Ball24");
		System.out.println("Password: "+ user2.getPassword());
		
		user2.setReentPassword("Ball42");
		System.out.println("Re-entered Password: "+ user2.getReentPassword());
		
		user2.setEAddress("black_99@yahoo.com");
		System.out.println("Email Address:"+ user2.getEAddress());
		
		user2.setFName("Tocky");
		System.out.println("First Name: "+ user2.getFName());
		
		user2.setLName("Black");
		System.out.println("Last Name: "+ user2.getLName());
		
		user2.setZip("63798");
		System.out.println("Zip code: "+ user2.getZip());
		
		System.out.println("toString method results: "+ user2.toString());
		
		user2.createID();
		System.out.println("User ID: "+ user2.createID());
		
		boolean samePass2 = user2.passwordTest();
		if(samePass2 == true)
			System.out.println("Passwords match");
		else 
			System.out.println("Passwords don't match");
	}

}
