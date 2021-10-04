package vaccumStateDesignPattern;

public class CleanWaterState implements VaccumCleanerState {
	  VaccumCleaner vc;
	  public CleanWaterState(VaccumCleaner vc)
	  {
			this.vc = vc;
	  }

	  @Override
		public void Startclean() {
		System.out.println("Vaccum cleaner is starting to clean the water");	
		}
		
		@Override
		public void Stopclean() {
		System.out.println("Vaccum cleaner is stopping to clean the water");	
		}
}
