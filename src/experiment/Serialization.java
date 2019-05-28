package experiment;

import java.io.*;


public class Serialization {

	public boolean serialize(GameData gd,String fileName) {
		boolean sucess = true;
		
		File fs = new File(fileName);
		try (
			FileOutputStream fout = new FileOutputStream(fs);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			){
			oos.writeObject(gd);
		}
		catch(IOException e) {
			e.printStackTrace();
			sucess = false;
		}
		return sucess;
	}
	public GameData deserialize(String fileName) {

		GameData restoredData = null;
		File fs = new File(fileName);
		try (
				FileInputStream fin = new FileInputStream(fs);
				ObjectInputStream ois = new ObjectInputStream(fin);
			){
			restoredData = (GameData) ois.readObject();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return restoredData;
	}
		
	
	public static void main(String args[]){
		GameData gd = new GameData();
		String fileName = "game_data.txt";
		gd.playerName = "Bhuwan Sharma";
		gd.level = 100;
		Serialization ser = new Serialization();
//		ser.serialize(gd,fileName);
		
		GameData restored = ser.deserialize(fileName);
		
		System.out.println(
			"Restored data => "+
			"\nPlayer Name : "+restored.playerName+
			"\nLevel : "+restored.level
		);
	}
}



class GameData implements Serializable{
	private static final long serialVersionUID = -5659029438583107951L;
	int level;
	String playerName;
	}