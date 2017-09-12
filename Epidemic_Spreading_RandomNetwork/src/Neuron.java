
import java.util.*;

public class Neuron {   
	
		public boolean infectious=false;
		public boolean susceptible=true;
		public boolean recovered=false;
		int id;
		static int counter;
		ArrayList<Connection> Inconnections = new ArrayList<Connection>();
		//HashMap<Integer,Connection> connectionLookup = new HashMap<Integer,Connection>();
		
		
		public Neuron(){        
		       id = counter;
		       counter++;
		   }
}


