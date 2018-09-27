package Practice;

import java.util.Scanner;

public class IdScanner {



	  public static void main(String[] args)
	   {
		  int idNumber;
      
      Scanner input = new Scanner(System.in);
      
	        System.out.print("Scan the barcode to find a person >>>>>  ");
	        idNumber = input.nextInt();
	        switch(idNumber)
	        {
	            case 316338:
	                System.out.print("Logan DeWilfond");
	                break;
	            case 155706:
	                System.out.print("Joseph Chalupa");
	                break;
	            case 274891:
	                System.out.print("Jason Wells");
	                break;
	            case 137112:
	                System.out.print("Adam Burton");
	                break;
	            case 137160:  
	                System.out.print("Zach Canada");
	                break;
	            case 153184:  
	                System.out.print("Jayden Graap");
	                break;
	            case 159343:  
	                System.out.print("Giovanni Jacobsen");
	                break;
	            case 129001:  
	                System.out.print("Isaac Dibbern");
	                break;
	            case 274871:  
	                System.out.print("Tavius Sterling");
	                break;
	            case 153182:  
	                System.out.print("Orion Gardner");
	                break;
	            case 274904:  
	                System.out.print("Amia Combs");
	                break;
	            case 304345:  
	                System.out.print("Cheyenne Jones");
	                break;
	            case 274894:  
	                System.out.print("John Brosius");
	                break;
	            case 118314:  
	                System.out.print("Benjamen Brooks");
	                break;
	            case 146891:  
	                System.out.print("De'Antwan Hanes");
	                break;
	            case 146468:  
	                System.out.print("Noah Gile");
	                break;
	            case 274888:  
	                System.out.print("Travis Hodges");
	                break;
	            case 315135:  
	                System.out.print("Phero Luong");
	                break;
	            default:
	                System.out.print("Not valid");
	        }
	    }
	    
	}