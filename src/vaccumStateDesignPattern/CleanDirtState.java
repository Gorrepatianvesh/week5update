package vaccumStateDesignPattern;

public class CleanDirtState implements VaccumCleanerState {
	       VaccumCleaner vc;

			public CleanDirtState(VaccumCleaner vc) {
				this.vc = vc;
				}

			@Override
			public void Startclean() {
			System.out.println("Vaccum cleaner is starting to clean the dirt");	
			}
			
			@Override
			public void Stopclean() {
			System.out.println("Vaccum cleaner is stopping to clean the dirt");	
			}

		

}
