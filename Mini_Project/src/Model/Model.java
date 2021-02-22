package Model;
public class Model
{
	//Declaring three objects of FootballPlayer class
	
	
	FootballPlayer f1;
	FootballPlayer f2;
	FootballPlayer f3;
	
	//Default constructor of Model class 
	
	public Model()
	{
		/*
		 Creating objects of FootballPlayer class using the parameterized constructor		 
		 */
			
		f1 = new FootballPlayer(9,"Anwesha","Defence",new Height(5,4),54,"Kolkata","NGHSS");
		f2 = new FootballPlayer(10,"Priti","Goalkeeper",new Height(6,4),58,"Delhi","ABCS");
		f3 = new FootballPlayer(11,"Ronaldino","Forward",new Height(5,3),65,"Pune","XYZ");
		
		// Height of three players is stored in h1,h2 and h3
		
		Height h1=f1.getHeight();
		Height h2=f2.getHeight();
		Height h3=f3.getHeight();
		
		//Height of three players is compared using compareHeight() method and printed accordingy 
		
		if(compareHeight(h1,h2)==0 && compareHeight(h2,h3)==0)
			System.out.println("Players are of same height");
		else if(compareHeight(h1,h2)==1 && compareHeight(h1,h3)==1)
			System.out.println(f1.getName()+" is tallest");
		else if(compareHeight(h2,h1)==1 && compareHeight(h2,h3)==1)
			System.out.println(f2.getName()+" is tallest");
		else
			System.out.println(f3.getName()+" is tallest");
	}
   
	
	// A method compareHeight() is defined to compare two heights and return a integer value accordingly  
	
    public int compareHeight(Height h1,Height h2)
    {
    	if(h1.getFeet()==h2.getFeet() && h1.getInches()==h2.getInches())
    		return 0;
    	else if(h1.getFeet()>h2.getFeet() || (h1.getFeet()==h2.getFeet() && h1.getInches()>h2.getInches()))
    		return 1;
    	else
    		return -1;
    }
    
}
