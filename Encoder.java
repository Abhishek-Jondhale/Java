class Encoder {

	String encoder(char c)

	{
		if (c == 'A') {
			return "**";
		}
		if (c == 'B') {
			return "##";
		}
		if (c == 'C') {
			return "$$$";
		}
		return null;
	}

	public static void main(String args[]) {
		Encoder e = new Encoder();
		String output = e.encoder('A');
		System.out.print(output);

		output = e.encoder('B');
		System.out.print(output);

		output = e.encoder('M');
		System.out.println(output);

	}

}