package genericsLambdas;

import java.util.List;
import java.util.ArrayList;


public class Inventory<Data_Type> {
	private List<Data_Type> invList;

	public Inventory() {
		invList = new ArrayList<Data_Type>();
	}

	public List<Data_Type> getItems() {
		return this.invList;
	}

	public void addItem(Data_Type item) {
		this.invList.add(item);
	}
	
	public List<Data_Type> removeItem(Data_Type item) {
		for (Data_Type listItem : this.invList) {
			if (listItem.equals(item)) {
				this.invList.remove(item);
			}
		}
		return this.invList;
	}
	
	public int invSize() {
		return this.invList.size();
	}
}