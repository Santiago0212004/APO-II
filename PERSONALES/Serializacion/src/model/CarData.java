package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.Gson;

public class CarData implements Serializable{
	
	private ArrayList<Car> cars;
	
	public CarData() {
		cars = new ArrayList<>();
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	//Guardar los objetos en el storage
	public void save() {
		//Requerimiento: Las clases deben ser serializables
		
		try {
			File file = new File("data.temp");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void load() {
		
		try {
			File file = new File("data.temp");
			FileInputStream fis;
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object object = ois.readObject();
			CarData data = (CarData) object;
			this.cars = data.cars;
			ois.close();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void print() {
		for(Car c : cars) {
			System.out.println(c.getOwnerName()+" | "+c.getBrand());
		}
	}
	
	public void saveJSON() {
		
		try {
			Gson gson = new Gson();
			String json = gson.toJson(this);
			System.out.println(json);
			File file = new File("data.json");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(json.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadJSON() {
		
	}
	
}
