import java.util.Set;

public abstract class Participants{

	private String athleteID;
	private String athletename;
	private int athleteage;
	private String athletestate;
	private char athletetype;
	Set<Athlete> athleteList;
	
	 abstract public String getID();
	
	abstract public String getName();
	
	abstract public int getAge();
	
	abstract public String getState();
	
	abstract public char gettype();
	
	abstract public void compete();
	
}
