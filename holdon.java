import java.util.Random;


public class holdon
{
	public static void main(String[] args)
	{
		EmInfor[] staff = new EmInfor[3];
		
		staff[0] = new EmInfor("Tom",23134);
		staff[1] = new EmInfor(66666);
		staff[2] = new EmInfor();
		
		for(EmInfor e : staff)
		{
			e.setId();
			System.out.println(e.getName()+" "+e.getSalary()+" "+e.getId());
			
		}
	}
}



class EmInfor
{
	
	private static int nextId;
	
	private String name = "";
	private double salary;
	
	private int id;
	
	static
	{
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	
	
	public EmInfor(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public EmInfor(double s)
	{
		this("EmInfor #"+nextId,s);
	}
	
	public EmInfor()
	{

	}
	
	public String getName()
	{
		return name;	
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double getId()
	{
		return id;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;
	}

	public void raiseSalary(double bypercent)
	{
		double raise = salary*bypercent/100;
		salary += raise;
	}
	
	public static void main(String[] args)
	{
		EmInfor e = new EmInfor("Harry",50000);
		System.out.println(e.getName()+e.getSalary());		
	}
}