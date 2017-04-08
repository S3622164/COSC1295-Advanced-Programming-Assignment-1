/*
 * @ Seby Tom Sebastian
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
public class Database {

	private Athlete athletedetails[];
	Random r=new Random();
	static Set<Athlete> gameList = new HashSet<Athlete>();
	
	//Hash Set declared, to load the randomly generated players in the Game.
	// Database Constructor
	public Database()
	{
		athletedetails = new Athlete[40];
		athletedetails[0]=new Athlete(1,"SebyTom",26,"Kerala",'S',0);
		athletedetails[1]=new Athlete(2,"HarmanakSingh",22,"Punjab",'S',0);
		athletedetails[2]=new Athlete(3,"SreeragThomas",23,"Karnataka",'S',0);
		athletedetails[3]=new Athlete(4,"GeoChirayath",22,"Thrissur",'S',0);
		athletedetails[4]=new Athlete(5,"AshishBharadwaj",24,"Himachal",'S',0);
		athletedetails[5]=new Athlete(6,"Tom",26,"Kerala",'S',0);
		athletedetails[6]=new Athlete(7,"Singh",22,"Punjab",'S',0);
		athletedetails[7]=new Athlete(8,"Thomas",23,"Karnataka",'S',0);
		athletedetails[8]=new Athlete(9,"VillaChirayath",22,"Thrissur",'S',0);
		athletedetails[9]=new Athlete(10,"Aneesh",24,"Himachal",'S',0); 
		athletedetails[10]=new Athlete(11,"PrathapMathew",22,"Chennai",'R',0);
		athletedetails[11]=new Athlete(12,"NishanthH",22,"Palakadu",'R',0);
		athletedetails[12]=new Athlete(13,"HarrisM",25,"Palakadu",'R',0);
		athletedetails[13]=new Athlete(14,"DonG",22,"Palakadu",'R',0);
		athletedetails[14]=new Athlete(15,"KiranMathew",29,"Palakadu",'R',0);
		athletedetails[15]=new Athlete(16,"Mathew J Kappen",22,"Chennai",'R',0);
		athletedetails[16]=new Athlete(17,"Scott",22,"Palakadu",'R',0);
		athletedetails[17]=new Athlete(18,"Brian",25,"Palakadu",'R',0);
		athletedetails[18]=new Athlete(19,"Ching Lou",22,"Palakadu",'R',0);
		athletedetails[19]=new Athlete(20,"Bradley",29,"Palakadu",'R',0); 
		athletedetails[20]=new Athlete(21,"ThomasM",22,"Dubai",'C',0);
		athletedetails[21]=new Athlete(22,"VineethK",21,"Sharja",'C',0);
		athletedetails[22]=new Athlete(23,"Jhoney",27,"Melbourne",'C',0);
		athletedetails[23]=new Athlete(24,"MathewJ",24,"Shimla",'C',0);
		athletedetails[24]=new Athlete(25,"JosephX",22,"Assam",'C',0);
		athletedetails[25]=new Athlete(26,"Mark",22,"Dubai",'C',0);
		athletedetails[26]=new Athlete(27,"Tango",21,"Sharja",'C',0);
		athletedetails[27]=new Athlete(28,"Fox",27,"Melbourne",'C',0);
		athletedetails[28]=new Athlete(29,"Jacob",24,"Shimla",'C',0);
		athletedetails[29]=new Athlete(30,"Jazz",22,"Assam",'C',0); 
		athletedetails[30]=new Athlete(31,"CherianJ",19,"Bharananganam",'A',0);
		athletedetails[31]=new Athlete(32,"TomJoseph",23,"Kadanadu",'A',0);
		athletedetails[32]=new Athlete(33,"Josan",20,"US",'A',0);
		athletedetails[33]=new Athlete(34,"JeanJoseph",22,"Cochin",'A',0);
		athletedetails[34]=new Athlete(35,"RichuK",22,"Cochin",'A',0);
		athletedetails[35]=new Athlete(36,"CherianJ",19,"Bharananganam",'A',0);
		athletedetails[36]=new Athlete(37,"Tim",23,"Kadanadu",'A',0);
		athletedetails[37]=new Athlete(38,"Cook",20,"US",'A',0);
		athletedetails[38]=new Athlete(39,"Carrie",22,"Cochin",'A',0);
		athletedetails[39]=new Athlete(40,"Rox",22,"Cochin",'A',0); 
		
	}
	

	public Athlete[] getAthletedetails() {
		return athletedetails;
	}

	public Random getR() {
		return r;
	}

	public static Set<Athlete> getGameList() {
		return gameList;
	}
 
	// Method add the Player to the Hash Set <gameList>
	
	public void athleteAdd(char gametype,int number)
	{
		int noa=number;
		int a=1;
		if(gametype == 'R')
		{			
			gameList.clear();
			for(int i=0;i<athletedetails.length;i++){
				if(athletedetails[i].getAthletetype() == 'R' || athletedetails[i].getAthletetype() == 'A'){
					if(a<=noa){
						gameList.add(athletedetails[i]);
						a++;
						}	
					}
				}
		}
		if(gametype == 'S'){
			gameList.clear();
				for(int i=0;i<athletedetails.length;i++){
					if(athletedetails[i].getAthletetype() == 'S' || athletedetails[i].getAthletetype() == 'A'){
						if(a<=noa){
						gameList.add(athletedetails[i]);
						a++;
						}
					}
				}
		}
		
		if(gametype == 'C'){
			gameList.clear();
				for(int i=0;i<athletedetails.length;i++){
					if(athletedetails[i].getAthletetype() == 'C' || athletedetails[i].getAthletetype() == 'A'){
						if(a<=noa){
						gameList.add(athletedetails[i]);
						a++;
						}
					}
				}
		}
		
		
		
	}
}
	

