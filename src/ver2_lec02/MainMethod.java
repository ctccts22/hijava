package ver2_lec02;

public class MainMethod {

		public static void main(String[] args) {
			
			ProgramInterfaceimpl programInterfaceimpl = new ProgramInterfaceimpl();
			programInterfaceimpl.start();
			programInterfaceimpl.stop();
			programInterfaceimpl.run();
			programInterfaceimpl.shutdown();
			
		}
}
