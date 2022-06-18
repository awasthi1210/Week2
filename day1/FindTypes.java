package day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
        int letter=0;
        int space =0;
        int specialChar=0;
        int num =0;
       
        for(int i=0;i<test.length();i++) {
        	Character c = test.charAt(i);
        	if(Character.isLetter(c)) {
        		letter++;
        	}
        	else if(Character.isDigit(c)) {
        		num++;
        	}
        	else if(Character.isSpaceChar(c)) {
        		space++;
        	}
        	else {
        		specialChar++;
        	}
        }
        System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
