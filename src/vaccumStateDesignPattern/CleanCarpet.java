package vaccumStateDesignPattern;

public class CleanCarpet implements VaccumCleanerState {

	VaccumCleaner vc;
	
	public CleanCarpet(VaccumCleaner vc) {
		this.vc = vc;
	}


	@Override
	public void Startclean() {
	System.out.println("Vaccum cleaner is starting to clean the carpet");	
	}
	
	@Override
	public void Stopclean() {
	System.out.println("Vaccum cleaner is stopping to clean the carpet");	
	}

}
