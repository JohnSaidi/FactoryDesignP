/*
 * this class keeps track of cereal name and price
 */
public abstract class Cereal {
	protected String name;
	protected Double price;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(Double price)
	{
		this.price = price;
	}
	public void prepare() 
	{
		System.out.println("Preparing the " + name);
	}
	public void boxCereal()
	{
		System.out.println("Putting fun pictures  " + name);
	}
	public void priceCereal()
	{
		System.out.println("Putting price tags " + price);
	}

}
