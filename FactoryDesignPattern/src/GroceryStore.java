/**
 * John Saidi
 * this class creates different types cereal depending on the order
 */
public class GroceryStore {
	
	/*
	 * declares and initializes orderedCereal
	 * returns orderedCereal
	 */
	public Cereal orderCereal (String type)
	{
		Cereal orderedCereal;
	
		
		if (type.contentEquals("FrostedFlakes"))
		{
			orderedCereal = new FrostedFlakes();
		}
		else if (type.contentEquals("LuckyCharms"))
		{
			orderedCereal = new LuckyCharms();
		}
		else
		{
			orderedCereal = new FruitLoops();
			
		}
		
		orderedCereal.prepare();
		orderedCereal.boxCereal();
		orderedCereal.priceCereal();
	
		return orderedCereal;
		
	}
	private Cereal createCereal (String type)
	{
		return null;
		
	}

}
