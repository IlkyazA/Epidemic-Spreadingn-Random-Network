// EPIDEMIC SPREADING
import java.util.ArrayList;

public class Main {
static int id;
static int count=0;
static int count2=0;
static int counter3=0;
	 public static void main(String... aArgs){
		 System.out.println("This program creates 50 neurons with their id. ");
		 System.out.println( "The probability(threshold) to have a connection is 0.8");
		 System.out.println("After getting connected, neurons choosen randomly supposed to be sick with the rate of alfa");
		System.out.println("After a neuron get infected, it will be recovered after 2 days (sigma period)");
		 double probability= 0.8;
		double random,random2;
		double alfa = 0.8; // hastalýgýn yayýlma rate'i
		int sigma= 2; //iyilesme 2 gün içinde
		int time=0;
		ArrayList<Neuron> Neurons = new ArrayList<Neuron>();
		for(int r=0;r<50;r++)
		{
			Neuron n = new Neuron();
			Neurons.add(n);
			Neurons.get(r).susceptible=true;
		}
		for(int i=0;i<Neurons.size();i++){
			for(int j=i+1;j<Neurons.size();j++)
			{
				random=Math.random();
			
				if(random> probability)
				{Connection con = new Connection(Neurons.get(i),Neurons.get(j));
				Connection con2= new Connection(Neurons.get(j),Neurons.get(i));
		           Neurons.get(i).Inconnections.add(con);
		           Neurons.get(j).Inconnections.add(con2);
		      
		           }
			}
		}//--------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("NEURONS AND THEIR CONNECTIONS");
		for(int i=0;i<Neurons.size();i++){
			
			System.out.println("Neuron" + Neurons.get(i).id);
			for(int j=0;j<Neurons.get(i).Inconnections.size();j++){
			
				System.out.print(" have connection id " +Neurons.get(i).Inconnections.get(j).id+" with ");
				System.out.print("Neuron" +Neurons.get(i).Inconnections.get(j).rightNeuron.id+" ");
				System.out.println();
			}
		}
		//---------------------------------------------------------------------------------------------------------------------
		/*
		Random rand = new Random();
		for(int k=0;k<2;k++)
		{int  n = rand.nextInt(10);
		Neurons.get(n).infectious=true;
		} */
		for(int w=0;w<Neurons.size();w++)
		{
		random2= Math.random();
		if(random2> alfa)
		{
		Neurons.get(w).infectious=true;
			
		}
		//System.out.println("HASTALAR " + Neurons.get(w).infectious);
		}
		
		
		for(int l=0;l<Neurons.size();l++)
			
		{if(Neurons.get(l).infectious==true)
			count++;
	
	 }
		System.out.println("------------------------------------------------------------------");
		System.out.println("# of sick neurons at the beginning with rate of alfa (0.8) : "+count);

			for(int h=0;h<Neurons.size();h++)
			{
				if(Neurons.get(h).susceptible==true)
				{
					if(!Neurons.get(h).Inconnections.isEmpty())
					{
						for(int y=0;y< Neurons.get(h).Inconnections.size();y++)
						{	double random4= Math.random();
							if(Neurons.get(h).Inconnections.get(y).getToNeuron().infectious==true)
							// burada infectious ve susceptible arasýndaki transmission rate'ye göre infectious yayýyoruz
							{if (random4>alfa)
							Neurons.get(h).infectious=true;}
							
						}
						//System.out.println(Neurons.get(h).infectious);
						
						
					if(time >= sigma)
						
					{	Neurons.get(h-2).infectious=false;
							Neurons.get(h-2).recovered=true;
					/*for(int u=0;u<Neurons.size();u++)
					{
						if(Neurons.get(u).infectious==true)
						{Neurons.get(u).infectious=false;
						Neurons.get(u).recovered=true;}
							
					}*/
					
					}
						
					}
					time++;
				}
			
				for(int i=0;i<Neurons.size();i++){
					
					if(Neurons.get(i).infectious==true)
					counter3++;
				}
				System.out.println("iteration " +h+ " # of sick neurons : "+counter3);
				counter3=0;
					
			}
		
			for(int o=0;o<Neurons.size();o++)
			{
				if(Neurons.get(o).infectious==true)
				{
					count2++;
					
				}
			}
			System.out.println("Total Neuron : "+ Neurons.size());
			System.out.println("Total sick neuron : "+ count2);
	 
	 
	 
	 
	 }
	 
	 
	 

	
}

