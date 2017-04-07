import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Athlete    {
	
	Database db;

	private String athleteID;
	private String athletename;
	private int athleteage;
	private String athletestate;
	private char athletetype;
	Set<Athlete> athleteList;
	Athlete athlete;
	private int athletepoints;
	
	public String getID(){
		return athleteID;
	}
	
	public String getName(){
		return athletename;
	}
	
	public int getAge(){
		return athleteage;
	}
		
	public String getState(){
		return athletestate;
	}
	
	public char gettype(){
		return athletetype;
	}
		
	public int getpoints(){
		return athletepoints;
	}

public Athlete(String athID, String athname, int athage, String athstate, char athtype, int athpoints) {
		// TODO Auto-generated constructor stub
	athleteID=athID;
	athletename=athname;
	athleteage=athage;
	athletestate=athstate;
	athletetype=athtype;
	athletepoints=athpoints;
	}

public int getAthletepoints() {
		return athletepoints;
	}

	public void setAthletepoints(int athletepoints) {
		this.athletepoints = athletepoints;
	}

public void compete(int max, int min)
	{
	

	int [] time = new int[20];
	int temp;
	int a=0;
	
	Random r =new Random();
	//int rand = r.nextInt((max-min)+1)+min;
	
	for(int i=0;i<db.gameList.size();i++)
	{
		time[i] = r.nextInt((max-min)+1)+min;
		//System.out.println(time[i]);
	}

System.out.println(" to Sort output");
for(int i=0;i<=db.gameList.size();i++)
	{
		int len = db.gameList.size();
		for(int j = len-1;j>=0;j--)
		{		
			if(time[j] > time[j+1])
			{
			temp=time[j];
			time[j]=time[j+1];
			time[j+1]=temp;
		}
 else
	 continue;
}
}

System.out.println("Output Sorted");
Iterator it = db.gameList.iterator();
while(it.hasNext()){
athlete = (Athlete)it.next();
a++;
System.out.print("The Current Players are"+ "");
System.out.print(athlete.getID()+ "-     ");
System.out.println(time[a]);
}

}
	
	}


	

	
	



