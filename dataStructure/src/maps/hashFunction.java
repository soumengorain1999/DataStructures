package maps;

public class hashFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="CAT";
		
		System.out.println(getHash(s));

	}
	
	static int getHash(String s)
	{
		int hash=0;
		for(int i=0;i<s.length();i++)
			hash+=s.charAt(i);
		return hash;
	}

}
