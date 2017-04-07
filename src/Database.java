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
	Athlete currentAthlete;
	public Database()
	{
		athletedetails = new Athlete[40];
		athletedetails[0]=new Athlete("ID01","SebyTom",26,"Kerala",'S',0);
		athletedetails[1]=new Athlete("ID02","HarmanacSingh",22,"Punjab",'S',0);
		athletedetails[2]=new Athlete("ID03","SreeragThomas",23,"Karnataka",'S',0);
		athletedetails[3]=new Athlete("ID04","GeoChirayath",22,"Thrissur",'S',0);
		athletedetails[4]=new Athlete("ID05","AshishBharadwaj",24,"Himachal",'S',0);
		athletedetails[5]=new Athlete("ID06","Tom",26,"Kerala",'S',0);
		athletedetails[6]=new Athlete("ID07","Singh",22,"Punjab",'S',0);
		athletedetails[7]=new Athlete("ID08","Thomas",23,"Karnataka",'S',0);
		athletedetails[8]=new Athlete("ID09","VillaChirayath",22,"Thrissur",'S',0);
		athletedetails[9]=new Athlete("ID10","Aneesh",24,"Himachal",'S',0); 
		athletedetails[10]=new Athlete("ID11","PrathapMathew",22,"Chennai",'R',0);
		athletedetails[11]=new Athlete("ID12","NishanthH",22,"Palakadu",'R',0);
		athletedetails[12]=new Athlete("ID13","HarrisM",25,"Palakadu",'R',0);
		athletedetails[13]=new Athlete("ID14","DonG",22,"Palakadu",'R',0);
		athletedetails[14]=new Athlete("ID15","KiranMathew",29,"Palakadu",'R',0);
		athletedetails[15]=new Athlete("ID16","Mathew J Kappen",22,"Chennai",'R',0);
		athletedetails[16]=new Athlete("ID17","Scott",22,"Palakadu",'R',0);
		athletedetails[17]=new Athlete("ID18","Brian",25,"Palakadu",'R',0);
		athletedetails[18]=new Athlete("ID19","Ching Lou",22,"Palakadu",'R',0);
		athletedetails[19]=new Athlete("ID20","Bradley",29,"Palakadu",'R',0); 
		athletedetails[20]=new Athlete("ID21","ThomasM",22,"Dubai",'C',0);
		athletedetails[21]=new Athlete("ID22","VineethK",21,"Sharja",'C',0);
		athletedetails[22]=new Athlete("ID23","Jhoney",27,"Melbourne",'C',0);
		athletedetails[23]=new Athlete("ID24","MathewJ",24,"Shimla",'C',0);
		athletedetails[24]=new Athlete("ID25","JosephX",22,"Assam",'C',0);
		athletedetails[25]=new Athlete("ID26","Mark",22,"Dubai",'C',0);
		athletedetails[26]=new Athlete("ID27","Tango",21,"Sharja",'C',0);
		athletedetails[27]=new Athlete("ID28","Fox",27,"Melbourne",'C',0);
		athletedetails[28]=new Athlete("ID29","Jacob",24,"Shimla",'C',0);
		athletedetails[29]=new Athlete("ID30","Jazz",22,"Assam",'C',0); 
		athletedetails[30]=new Athlete("ID31","CherianJ",19,"Bharananganam",'A',0);
		athletedetails[31]=new Athlete("ID32","TomJoseph",23,"Kadanadu",'A',0);
		athletedetails[32]=new Athlete("ID33","Josan",20,"US",'A',0);
		athletedetails[33]=new Athlete("ID34","JeanJoseph",22,"Cochin",'A',0);
		athletedetails[34]=new Athlete("ID35","RichuK",22,"Cochin",'A',0);
		athletedetails[35]=new Athlete("ID36","CherianJ",19,"Bharananganam",'A',0);
		athletedetails[36]=new Athlete("ID37","Tim",23,"Kadanadu",'A',0);
		athletedetails[37]=new Athlete("ID38","Cook",20,"US",'A',0);
		athletedetails[38]=new Athlete("ID39","Carrie",22,"Cochin",'A',0);
		athletedetails[39]=new Athlete("ID40","Rox",22,"Cochin",'A',0); 
		
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

	public Athlete getCurrentAthlete() {
		return currentAthlete;
	}

	public void athleteDisplay(char gametype)
	{
		if(gametype == 'R')
		{
			for(int i=0;i<athletedetails.length;i++)
				{
					if(athletedetails[i].gettype() == 'R' || athletedetails[i].gettype() == 'A')
						{
						System.out.print("Athlete ID:"+athletedetails[i].getID() +" Athlete Name: "+ athletedetails[i].getName());
						System.out.print(" Age: "+ athletedetails[i].getAge()+ " State: "+ athletedetails[i].getState());
						System.out.println(" Type: " + athletedetails[i].gettype());
						}
				}
		}
		
		if(gametype == 'S')
		{
			for(int i=0;i<athletedetails.length;i++)
				{
					if(athletedetails[i].gettype() == 'S' || athletedetails[i].gettype() == 'A')
						{
						System.out.print("Athlete ID:"+athletedetails[i].getID() +" Athlete Name: "+ athletedetails[i].getName());
						System.out.print(" Age: "+ athletedetails[i].getAge()+ " State: "+ athletedetails[i].getState());
						System.out.println(" Type: " + athletedetails[i].gettype());
						}
				}
		}
		
		if(gametype == 'C')
		{
			for(int i=0;i<athletedetails.length;i++)
				{
					if(athletedetails[i].gettype() == 'C' || athletedetails[i].gettype() == 'A')
						{
						System.out.print("Athlete ID:"+athletedetails[i].getID() +" Athlete Name: "+ athletedetails[i].getName());
						System.out.print(" Age: "+ athletedetails[i].getAge()+ " State: "+ athletedetails[i].getState());
						System.out.println(" Type: " + athletedetails[i].gettype());
						}
				}
		}
		
	}
	
	@SuppressWarnings("null")
	public Set<Athlete> athleteLoad(char theathtype,int number)
	{
	String [] a=new String[10];

		
		int k=0;
		try
		{
		for(int i=0;i<number;i++)
		{
			
			int rand=r.nextInt(((39-0)+1)+0);
	
			if(!(Arrays.asList(a).contains(athletedetails[rand].getID()))){
	
				if(athletedetails[rand].gettype() == 'A' || athletedetails[rand].gettype() == theathtype)
					{

					a[i]=athletedetails[rand].getID();
					gameList.add(athletedetails[rand]);
					System.out.println("Athlete ID:"+athletedetails[rand].getID() +" Athlete Name: "+ athletedetails[rand].getName() + " Age: "+ athletedetails[rand].getAge()+ " State: "+ athletedetails[rand].getState() + " Type: " + athletedetails[rand].gettype());
					}
				else{
					i--;
				    continue;
					}
		}
			else{
				i--;
			    continue;
				}
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Duplicate Values");
		}
		return gameList;
		}
	}
	

