package com.example.eventure;
import java.util.Vector;

import com.example.eventure.Story;
//import java.io;

public class Main {

	/**
	 * @param args
	 */
	//Essentially the library of stories
	Vector<Story> storylib = new Vector<Story>();
	int j=storylib.size();	
	
	public void sortLibByTitle(){		
		//insertion sorting		
		Story temp;
		Story temp2;
	
		for (int k = 1; k < j; k++){
			//the object to compare with
			temp = storylib.get(k);
			for (int h = k-1; h >= 0; h--){
				temp2 = storylib.get(h);	//the object to compare
				//if temp2 is greater than temp than swap
				if(temp2.getStoryInfo().getTitle().hashCode() > temp.getStoryInfo().getTitle().hashCode()){
					storylib.set(h,temp2);	//essentially swapping objects
					storylib.set(k,temp);	
				}
			//if not then decrement h	
			}
		} 
	}
	
	public void sortLibByAuthor(){		
		//insertion sorting		
		Story temp;
		Story temp2;
	
		for (int k = 1; k < j; k++){
			//the object to compare with
			temp = storylib.get(k);
			for (int h = k-1; h >= 0; h--){
				temp2 = storylib.get(h);	//the object to compare
				//if temp2 is greater than temp than swap
				if(temp2.getStoryInfo().getAuthor().hashCode() > temp.getStoryInfo().getAuthor().hashCode()){
					storylib.set(h,temp2);	//essentially swapping objects
					storylib.set(k,temp);	
				}
			//if not then decrement h	
			}
		} 
	}
	
	public void sortLibByDate(){		
		//insertion sorting		
		Story temp;
		Story temp2;
	
		for (int k = 1; k < j; k++){
			//the object to compare with
			temp = storylib.get(k);
			for (int h = k-1; h >= 0; h--){
				temp2 = storylib.get(h);	//the object to compare
				//if temp2 is greater than temp than swap
				if(temp2.getStoryInfo().getDateWritten().hashCode() > temp.getStoryInfo().getDateWritten().hashCode()){
					storylib.set(h,temp2);	//essentially swapping objects
					storylib.set(k,temp);	
				}
			//if not then decrement h	
			}
		} 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	

	
	
}
