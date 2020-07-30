public class StringtoInteger {

	 public int myAtoi(String str) {
		long result =0;
		 boolean positiveInteger = true ;
		 int i = 0;
		 while(i<str.length() && str.charAt(i)==' ')
			 i++;
		 if(i<str.length() && (str.charAt(i)=='+' || str.charAt(i)=='-')) {
			 if(str.charAt(i)=='-')
				 positiveInteger = false;
			 i++;
		 }
		 while(i<str.length() && Character.isDigit(str.charAt(i))) {
			 result = result*10 + (str.charAt(i)-'0');
			 if(positiveInteger && result>Integer.MAX_VALUE)
	                return Integer.MAX_VALUE;
	         if(!positiveInteger && result>Integer.MAX_VALUE)
	                return Integer.MIN_VALUE;
	         i++;
		 }
		 
		 if(!positiveInteger)
			 result = result*-1;
		 
		 return (int) result;
	        
	    }

}
