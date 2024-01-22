package Careerpathwaypack;

import java.util.Scanner;

public class Question {
	
		
		public Scanner allinputs = new Scanner(System.in);
		public String question1() {
			System.out.println("Name: ");
			String ans1 = allinputs.nextLine();
			return ans1;
			
		}
		public String question2() {
			System.out.println("School: ");
			String ans2 = allinputs.nextLine();
			return ans2;
			
		}
		public int question3() {
			System.out.println("Grade Level: ");
			int ans3 = allinputs.nextInt();
			return ans3;
			
		}
		public int question4() {
			System.out.println("OSIS: ");
			int ans4 = allinputs.nextInt();
			return ans4;
			
		}
		public int question5() {
			System.out.println("SSN/ITIN: ");
			int ans5 = allinputs.nextInt();
			return ans5;
			
		}
		public String question6() {
			System.out.println("I-9 Verified: ");
			String ans6 = allinputs.nextLine();
			return ans6;
			
		}
		public String question7() {
			System.out.println("Gender: ");
			String ans7 = allinputs.nextLine();
			return ans7;
			
		}
		public String question8() {
			System.out.println("Preferred Pronoun: ");
			String ans8 = allinputs.nextLine();
			return ans8;
			
		}
		public String question9() {
			System.out.println("Preferred Name/Nick Name: ");
			String ans9 = allinputs.nextLine();
			return ans9;
			
		}
		public String question10() {
			System.out.println("Race: ");
			String ans10 = allinputs.nextLine();
			return ans10;
			
		}
		public int question11() {
			System.out.println("Grade: ");
			int ans11 = allinputs.nextInt();
			return ans11;
			
		}
		public String question12() {
			System.out.println("Expected Graduation Month: ");
			String ans12 = allinputs.nextLine();
			return ans12;
			
		}
		public int question13() {
			System.out.println("Expected Graduation Year: ");
			int ans13 = allinputs.nextInt();
			return ans13;
			
		}
		public String question14() {
			while (true) {
	           System.out.println("Are you an English Language Learner (ELL)? Yes or No: ");
	           String ans14 = allinputs.nextLine().toUpperCase();
	           if (ans14.equals("YES") || ans14.equals("NO")) {
	               return ans14;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		public String question15() {
			while (true) {
	           System.out.println("Do you identify as a student with a learning disability or do you have an "
	           		+ "Individualized Education Plan (IEP)? Yes or No: ");
	           String ans15 = allinputs.nextLine().toUpperCase();
	           if (ans15.equals("YES") || ans15.equals("NO")) {
	               return ans15;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		
		public String question16() {
			while (true) {
	           System.out.println("Do you have any allergies? (Animals, foods, etc.)?Yes or No: ");
	           String ans16 = allinputs.nextLine().toUpperCase();
	           if (ans16.equals("YES") || ans16.equals("NO")) {
	               return ans16;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		
		public String question17() {
			System.out.println("Please specify your allergies: ");
			String ans17 = allinputs.nextLine();
			return ans17;
			
		}
		
		public String question18() {
			System.out.println("Other than English, what language(s) are you most comfortable speaking? ");
			String ans18 = allinputs.nextLine();
			return ans18;
			
		}
		public String question19() {
			System.out.println("School Based Email: ");
			String ans19 = allinputs.nextLine();
			return ans19;
			
		}
		public String question20() {
			System.out.println("Permanent Email: ");
			String ans20 = allinputs.nextLine();
			return ans20;
			
		}
		public String question21() {
		    System.out.println("Home Phone: ");
		    String ans21 = allinputs.nextLine();
		    return ans21;
		}
		public int question22() {
			System.out.println("Cell Phone: ");
			int ans22 = allinputs.nextInt();
			return ans22;
			
		}
		public String question23() {
			System.out.println("Address: ");
			String ans23 = allinputs.nextLine();
			return ans23;
			
		}
		public String question24() {
			System.out.println("Apt: ");
			String ans24 = allinputs.nextLine();
			return ans24;
			
		}
		public String question25() {
			System.out.println("City: ");
			String ans25 = allinputs.nextLine();
			return ans25;
			
		}
		public String question26() {
			System.out.println("State: ");
			String ans26 = allinputs.nextLine();
			return ans26;
			
		}public int question27() {
			System.out.println("Zip Code: ");
			int ans27 = allinputs.nextInt();
			return ans27;
			
		}
		public String question28() {
			System.out.println("Parent/Guardian First Name: ");
			String ans28 = allinputs.nextLine();
			return ans28;
			
		}
		public String question29() {
			System.out.println("Parent/Guardian Last Name: ");
			String ans29 = allinputs.nextLine();
			return ans29;
			
		}
		public String question30() {
			System.out.println("Parent/Guardian Relationship:");
			String ans30 = allinputs.nextLine();
			return ans30;
			
		}
		public String question31() {
			System.out.println("Parent/Guardian Email:");
			String ans31 = allinputs.nextLine();
			return ans31;
			
		}
		public int question32() {
			System.out.println("Parent/Guardian Home Phone:");
			int ans32 = allinputs.nextInt();
			return ans32;
			
		}
		public int question33() {
			System.out.println("Parent/Guardian Work Phone:");
			int ans33 = allinputs.nextInt();
			return ans33;
			
		}
		public int question34() {
			System.out.println("Parent/Guardian Cell Phone:");
			int ans34 = allinputs.nextInt();
			return ans34;
			
		}
		public String question35() {
			System.out.println("Emergancy First Name: ");
			String ans35 = allinputs.nextLine();
			return ans35;
			
		}
		public String question36() {
			System.out.println("Emergancy Last Name: ");
			String ans36 = allinputs.nextLine();
			return ans36;
			
		}
		public String question37() {
			System.out.println("Emergancy Relationship: ");
			String ans37 = allinputs.nextLine();
			return ans37;
			
		}
		public String question38() {
			System.out.println("Emergancy Email: ");
			String ans38 = allinputs.nextLine();
			return ans38;
			
		}
		public String question39() {
			System.out.println("Emergancy Home Phone: ");
			String ans39 = allinputs.nextLine();
			return ans39;
		}
		public String question40() {
			System.out.println("Emergancy Cell Phone:: ");
			String ans40 = allinputs.nextLine();
			return ans40;
		}
		public String question41() {
			while (true) {
	           System.out.println("Do You Currently have a Bank Account? Yes or No: ");
	           String ans41 = allinputs.nextLine().toUpperCase();
	           if (ans41.equals("YES") || ans41.equals("NO")) {
	               return ans41;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		public String question42() {
			while (true) {
	           System.out.println("Would you like to be paid through Direct Deposit? Yes or No: ");
	           String ans42 = allinputs.nextLine().toUpperCase();
	           if (ans42.equals("YES") || ans42.equals("NO")) {
	               return ans42;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		public String question43() {
			while (true) {
	           System.out.println("Have you completed the Career and Financial "
	           		+ "Management Course in your school? Yes or No: ");
	           String ans43 = allinputs.nextLine().toUpperCase();
	           if (ans43.equals("YES") || ans43.equals("NO")) {
	               return ans43;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		public String question44() {
			while (true) {
	           System.out.println("Do you have access to an electronic device with internet accessibility? Yes or No: ");
	           String ans44 = allinputs.nextLine().toUpperCase();
	           if (ans44.equals("YES") || ans44.equals("NO")) {
	               return ans44;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		public String question45() {
			while (true) {
	           System.out.println("Do you have access to the internet? Yes or No: ");
	           String ans45 = allinputs.nextLine().toUpperCase();
	           if (ans45.equals("YES") || ans45.equals("NO")) {
	               return ans45;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}
		public String question46() {
			while (true) {
	           System.out.println("What internship environment are you looking for? Remote or InPerson: ");
	           String ans46 = allinputs.nextLine().toUpperCase();
	           if (ans46.equals("REMOTE") || ans46.equals("INPERSON")) {
	               return ans46;
	           } else {
	               System.out.println("Incorrect answer. Please try again. ");
	           }
	       }
		}


}
