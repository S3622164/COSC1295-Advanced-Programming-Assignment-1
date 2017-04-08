/*
 * @ Harmanak Singh
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OfficialDatabse {
	public String officialname;
	
	private Official officialdetails[];
	
	// Officials Arraylist.
	
	public OfficialDatabse(){
		officialdetails = new Official[3];
		officialdetails[0]=new Official("ID01","Darek",37,"Australia");
		officialdetails[1]=new Official("ID02","Sylus",40,"Italy");
		officialdetails[2]=new Official("ID03","Nicollas",35,"Argentina");
		
	}

	public Official[] getOfficialdetails() {
		return officialdetails;
	}

	public void setOfficialdetails(Official[] officialdetails) {
		this.officialdetails = officialdetails;
	}

	// Method to Randomnly generate the Official for a Game
	public void offdisplay(){
		Random r=new Random();
		int offid=r.nextInt(3);
		System.out.println("The Official for the Match is: " + officialdetails[offid].getName());
		officialname = officialdetails[offid].getName();
		
	}
	
	// Method to Display the Official for the Game
	
	public void officialnamedisplay(){
		
		System.out.println("The Official Name is " + officialname);
	}
}
