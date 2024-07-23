class Decoder 
{
	String decode(char c) {
		if (c == '*') {
			return "A";
		}

		if (c == '&') {
			return "B";
		}

		if (c == '#') {
			return "C";
		}
  		
		return null;

	}

	public static void main(String args[]) {

		Decoder e = new Decoder();

		String output = e.decode('#');
		System.out.print(output);

		output = e.decode('*');
		System.out.print(output);

		output = e.decode('&');
		System.out.print(output);
	}

}