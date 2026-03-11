package Pharmatrack;
import java.util.Scanner;

public class Pharmatrack {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		
		//Creating objects for other classes
		Inventory inventory=new Inventory();
		Prescription prescription=new Prescription();
		UndoStack undo=new UndoStack();
		ExpiryAlert alert=new ExpiryAlert();
		
		while(true) {
			System.out.println("Enter 1 for Add Medicine");
			System.out.println("Enter 2 for Display Medicine");
			System.out.println("Enter 3 for Search Medicine");
			System.out.println("Enter 4 for Add prescription");
			System.out.println("Enter 5 for Process Prescription");
			System.out.println("Enter 6 for Add Expiry Alert");
            System.out.println("Enter 7 for Show Expiry Alert");
            System.out.println("Enter 8 for Undo Last Action");
			System.out.println("Enter 9 for exit ");
			System.out.println("Enter your choice");
            ch=sc.nextInt();
            sc.nextLine();
			
			switch(ch) {
			case 1:
				System.out.print("Enter Medicine Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Drug Code: ");
	            String code = sc.nextLine();

	            System.out.print("Enter Batch Number: ");
	            String batch = sc.nextLine();

	            System.out.print("Enter Quantity: ");
	            int quantity = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Expiry Date: ");
	            String expiry = sc.nextLine();

	            Medicine m = new Medicine(name, code, batch, quantity, expiry);

	            inventory.addMedicine(m);
	            undo.addAction("Added Medicine: " + name);
                break;
				
			case 2:
				System.out.println("\n--- Medicine Inventory ---");
                inventory.displayAll();
                break;
	
			case 3:
				System.out.print("Enter Drug Code to Search: ");
                String searchCode = sc.nextLine();
                inventory.searchMedicine(searchCode);
                break;

			case 4:
				System.out.print("Enter Prescription ID: ");
                String pid = sc.nextLine();
                prescription.addPrescription(pid);
                break;
                
			case 5:
				prescription.processPrescription();
                break;
			  
			case 6:
                System.out.print("Enter Medicine Name for Expiry Alert: ");
                String drug = sc.nextLine();
                alert.addExpiryDrug(drug);

                break;
			case 7:
                alert.showAlert();
                break;

            case 8:
                undo.undoAction();
                break;

            case 9:
                System.out.println("Exiting PharmaTrack System...");
                break;

            default:
                System.out.println("Invalid choice!");
		}
	}

	}

}
