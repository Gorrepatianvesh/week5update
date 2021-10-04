package vaccumStateDesignPattern;

public class VaccumCleaner {

	VaccumCleanerState cleanCarpet;
	VaccumCleanerState cleanDirtState;
	VaccumCleanerState cleanWaterState;

	
	VaccumCleanerState state;
	int count = 0;
	
	public VaccumCleaner()
	{
		cleanCarpet = new CleanCarpet(this);
		cleanDirtState = new CleanDirtState(this);
		cleanWaterState = new CleanWaterState(this);

		
	    state = cleanWaterState;
	}
	
	public void Startclean()
	{
		state.Startclean();
	}
	

	public void Stopclean()
	{
		state.Stopclean();
	}
	
	void setState(VaccumCleanerState state) {
		this.state = state;
	}
	public VaccumCleanerState getState() {
        return state;
    }
	public VaccumCleanerState getcleanCarpet() {
        return cleanCarpet;
    }
	public VaccumCleanerState getcleandirtState() {
        return cleanDirtState;
    }
	public VaccumCleanerState getcleanwaterState() {
        return cleanDirtState;
    }
	
    public int getCount() {
		return count;
	}

	//To String Method
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Welcome To Vaccum cleaner Factory!!!");
        if (count != 1) {
            result.append("");
        }
        result.append("\n");
        return result.toString();
    }
}
