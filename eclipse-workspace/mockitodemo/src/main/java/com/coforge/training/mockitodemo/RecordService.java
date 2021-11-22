  package com.coforge.training.mockitodemo;

public class RecordService {

	//dependencies
		DatabaseDao database;
		NetworkDao network;
		public DatabaseDao getDatabase() {
			return database;
		}
		public void setDatabase(DatabaseDao database) {
			this.database = database;
		}
		public NetworkDao getNetwork() {
			return network;
		}
		public void setNetwork(NetworkDao network) {
			this.network = network;
		}
		
		public boolean save(String fileName)
		{
			database.save(fileName);
			System.out.println("Saved in database in Main class");
			
			network.save(fileName);
			System.out.println("Saved in network in Main class");
			
			return true;
		}
}
