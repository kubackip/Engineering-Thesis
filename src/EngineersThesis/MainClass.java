package EngineersThesis;

public class MainClass 
{
	private static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) 
	{
		PictogramWindow pictWindow = new PictogramWindow();
		pictWindow.ShowPicogramWindow();
		
		long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
	}

}
