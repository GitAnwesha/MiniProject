package Model;

public class FootballPlayer
{
	
	//Data members 
	
	private int number;
	private String name ;
	private String position ;
	private Height height ;
    private int weight ;
    private String homeTown;
    private String highSchool ;
    
    /*
     * Default Constructor
     */
    
    public FootballPlayer()
	{
   		number=0;
   		name="";
   		position="";
   	    height= new Height();
   		weight=0;
   		homeTown="";
   		highSchool="";
	}
   	  
    /*
     * Parameterized Constructor
     */
    
   	public FootballPlayer(int number, String name, String position, Height height, int weight, String homeTown,String highSchool)
   	{
		this.number = number;
		this.name = name;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.homeTown = homeTown;
		this.highSchool = highSchool;
	}
   	
	/*
	  
	 * Getters and Setters
	  
	 */
   	
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	
	public Height getHeight()
	{
		return height;
	}
	public void setHeight(Height height)
	{
		this.height=height;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public String getHomeTown()
	{
		return homeTown;
	}
	public void setHomeTown(String homeTown)
	{
		this.homeTown = homeTown;
	}
	public String getHighSchool()
	{
		return highSchool;
	}
	public void setHighSchool(String highSchool)
	{
		this.highSchool = highSchool;
	}

}
