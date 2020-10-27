


//beg of driver
package FrogSimulation;
public class FrogSimulationDriver {
public static void main (String[] args) {
	int dist = 24;
	int numHops = 5;
	FrogSimulation sim = new FrogSimulation(dist, numHops);
	System.out.println(sim.simulate());
}//end of main code
}//end of driver
