import java.util.*;

public class RunBloodData{
	
	public static void main(String[] args){	
		String input1, input2,data;
		BloodData bd = new BloodData();
		Scanner scs = new Scanner(System.in);
		System.out.print("Enter blood type of patient: ");
	 	input1 = scs.nextLine();
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		input2 = scs.nextLine();
		data = input1 + input2;
	
		if(data.isEmpty()){
			bd.display();
		}
		else if(data.equals("A+") ||data.equals("A-") || data.equals("B+") ||
		 data.equals("B-") || data.equals("AB+") || data.equals("AB-") ||
		 data.equals("O+") || data.equals("O-")){
		 	bd.setBloodType(input1);
		 	bd.setRhFactor(input2);
		 	bd.display();

		 }
		 else{
		 	System.out.println("You entered wrong input!");
		 }
		
	
	}
}