import java.io.IOException;
import java.util.Scanner;

/**
 * SokobanTester solves easy to moderate sokoban puzzles using different search algorithms.
 * Search algorithms are based on the textbook pseudocode, and Hungarian Algorithm is from wikipedia.
 * @author Hyun Seung Hong (hh2473)
 *
 */
public class SokobanTester {

	public static void main(String[] args) throws Exception{
		System.out.println("Sokoban Solver cli edition");
		SokobanSolver ss = new SokobanSolver();
		ss.loadScanner(new Scanner(System.in), 'b');
		System.out.println(ss.solve('u'));
	}

}
