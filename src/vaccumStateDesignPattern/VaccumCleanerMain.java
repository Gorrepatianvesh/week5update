package vaccumStateDesignPattern;

public class VaccumCleanerMain {

	public static void main(String[] args) {
	
		VaccumCleaner vc = new VaccumCleaner();
		System.out.println(vc);
		vc.Startclean();
	    vc.Stopclean();
		
		vc.setState(new CleanDirtState(vc));
		vc.Startclean();
	    vc.Stopclean();
		
		
		vc.setState(new CleanCarpet(vc));
		vc.Startclean();
	    vc.Stopclean();
		

	}
}
