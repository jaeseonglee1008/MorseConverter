class MorseConverter{
	public static void main(String[] args){
		if(args.length!=1){//allows only one word for user input
			System.out.println("useage: java morseconverter WORD");
			System.exit(0); 
		}

		System.out.println("inputWord : "+args[0]);
		String inputWord = args[0].toUpperCase();//converting input String to upper case
	    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", "|" };
        String result = "";

        for(int i=0;i<inputWord.length();i++){
        	result+=morse[inputWord.charAt(i)-'A'];//askii value to match with morse array index value
        }
        System.out.println("Morse :"+result);




	}

}