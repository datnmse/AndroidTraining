/**
 * 
 */
package cast;

/**
 * @author DATNM
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		visitIsland("Santorini");
		visitIsland("Crete");
		visitIsland("Paros");

	}

	/**
	 * @param string
	 */
	private static void visitIsland(String island) {
		// TODO Auto-generated method stub
		switch(island) {
		          case "Corfu":
		               System.out.println("User wants to visit Corfu");
		               break;
		          case "Crete":
		               System.out.println("User wants to visit Crete");
		               break;
		          case "Santorini":
		               System.out.println("User wants to visit Santorini");
		               break;
		          case "Mykonos":
		               System.out.println("User wants to visit Mykonos");
		               break;
		         default:
		               System.out.println("Unknown Island");
		               break;
		         }

	}

}
