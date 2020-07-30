public class RegularExpressionMatching {
	
	public boolean isMatch(String s, String p) {
        
		//return s.matches(p);
		
		try {
		if(p.isEmpty())
			return s.isEmpty();
		boolean firsthalf = !s.isEmpty() && s.charAt(0) == p.charAt(0) ||p.charAt(0) == '.' ;
			
		
		if(p.length() >=2 && p.charAt(1)=='*') 
		{
			return (isMatch(s, p.substring(2)) || (firsthalf && isMatch(s.substring(1), p)));
		}
		else {
            return  firsthalf && isMatch(s.substring(1), p.substring(1));
		}
		}
	
	catch(Exception e)
	{
		
	}
		return false;
	}

}