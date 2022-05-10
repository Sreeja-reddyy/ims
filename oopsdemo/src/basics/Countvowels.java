package basics;

//program to count vowels in a string -a,e,i,o,u
public class Countvowels {
	public static void main(String[] args) {
		
		String s="java is fun";
        int count=0;
       
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' ||
                    s.charAt(i) =='o' || s.charAt(i) =='u')
            {
                count+=1;
                System.out.println("Vowel found : "+s.charAt(i));
            }
           
        }
        System.out.println("Total no. of vowels in string :"+count);	
	}

}
