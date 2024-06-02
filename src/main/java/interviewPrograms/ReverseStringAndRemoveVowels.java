package interviewPrograms;

public class ReverseStringAndRemoveVowels {
	public static void main(String args[]) {	
	       String str = "Apple and Orange are brothers";
	       
	       String[] str1 = str.split(" ");
	       
	       for(int i=0; i<=str1.length-1;i++){
	           reverseString(str1);
	       }
//	       removeVowels(str);
	       
	       }
	       
	       public static void reverseString(String[] str2){
	    	   String str = str2.toString();
	    	   String[] str3 = str.split("");
	           for(int i=str3.length-1;i>=0;i--){
	           System.out.print(str3);
	           }
	       }
	       public static void removeVowels(String str3){
	           
	           char[] ch = {'a', 'e', 'i', 'o', 'u'};
	           char[] str5 = str3.toCharArray();
	           for(int i=0; i< str3.length()-1; i++){
	        	   
	        		   if(!ch.equals(str5)){
	   	                System.out.println(str5[i]);
	           
	          
	       }
	    }
	       }
}
	

