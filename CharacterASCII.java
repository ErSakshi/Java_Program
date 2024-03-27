class CharacterASCII
{
	public static void main(String[] args) {
		//int asciiValue=65;
		for(char ch='A';ch<='Z';ch++){
			System.out.print((ch+0)+"->"+ch+" ");
			//System.out.println(asciiValue+"->"+ch+" ");
			//System.out.println((int)ch+"->"+ch+" ");
				}
				System.out.println();

		for(char ch='a';ch<='z';ch++){
			System.out.print((ch+0)+"->"+ch+" ");}
		System.out.println();
		for(char ch='0';ch<='9';ch++){
			System.out.print((ch+0)+"->"+ch+" ");
		}
		
	}

}