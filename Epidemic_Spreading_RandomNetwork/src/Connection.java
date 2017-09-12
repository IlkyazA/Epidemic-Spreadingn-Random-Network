

public class Connection {
	 
	 
	    final Neuron leftNeuron;
	    final Neuron rightNeuron;
	    static int counter = 0;
	    final public int id; 
	 
	    public Connection(Neuron fromN, Neuron toN) {
	        leftNeuron = fromN; //kendisi 1.nöron
	        rightNeuron = toN;//2.nöron
	        id = counter;
	        counter++;
	    }
	
		public Neuron getFromNeuron() {
	        return leftNeuron;
	    }
	 
	    public Neuron getToNeuron() {
	        return rightNeuron;
	    }
	}

