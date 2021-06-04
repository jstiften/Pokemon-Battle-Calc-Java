package utils;

import java.util.ArrayList;

import type.Type;

public class ArrayListUtils {

	public static Type findTypeByName(ArrayList<Type> typeLib, String name) {
		Type temp = new Type("");
		
		for(int i = 0; i < typeLib.size(); i++) {
			if(typeLib.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
				temp.setName(typeLib.get(i).getName());
			}
		}
		
		return temp;
	}
	
}
