public class labs1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String LowText = "abcdefghijklmnopqrstuvwxyz";
		String HightText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char LowMas[] = LowText.toCharArray();
		char HightMas[] = HightText.toCharArray();
		char OffsetLowMas[] = new char[LowMas.length];
		char OffsetHightMas[] = new char[HightMas.length];
		
		for (int j = 0; j < LowMas.length; j++) {
			char c = (char)LowMas[j];
			char first = 'a';
			int	key = 3;

			if (first != 0)
				c = (char)(first + (c - first + key + 26) % 26);	
			OffsetLowMas[j] = c;
		}
		
		for (int j = 0; j < HightMas.length; j++) {
			char c = (char)HightMas[j];
			char first = 'A';
			int	Hightkey = 5;

			if (first != 0)
				c = (char)(first + (c - first + Hightkey + 26) % 26);	
			OffsetHightMas[j] = c;
		}
		
		System.out.print("Offset for upper case\n");
		for (int j = 0; j < HightMas.length; j++) {
			System.out.print(HightMas[j] + "\t");
		}
		System.out.print("\n");
		for (int j = 0; j < OffsetHightMas.length; j++) {
			System.out.print(OffsetHightMas[j] + "\t");
		}
		System.out.print("\n");
		System.out.print("Offset for lower case\n");
		for (int j = 0; j < LowMas.length; j++) {
			System.out.print(LowMas[j] + "\t");
		}
		System.out.print("\n");
		for (int j = 0; j < OffsetLowMas.length; j++) {
			System.out.print(OffsetLowMas[j] + "\t");
		}
		System.out.print("\n");
		String inputText = "Hello World!";
		byte inputMas[] = inputText.getBytes();
		char outputMas[] = new char[inputMas.length];
		char DeShifrMas[] = new char[inputMas.length];
		int key = 3;
		
		for (int j = 0; j < inputMas.length; j++) {
			char c = (char)inputMas[j];
			
			char first = 0;
			
			if (c >= 'a' && c <= 'z') {
				first = 'a';
				key = 3;
			}
			else if (c >= 'A' && c <= 'Z') {
				first = 'A';
				key = 5;
			}
			if (first != 0)
				c = (char)(first + (c - first + key + 26) % 26);
			
			outputMas[j] = c;
		}
		
		String outputText = new String(outputMas);
		System.out.println("Encryption message:\n" + outputText);
		
		for (int j = 0; j < outputMas.length; j++) {
			char c = (char)outputMas[j];
			
			char first = 0; 
			
			if (c >= 'a' && c <= 'z') {
				first = 'a';
				key = 3;
			}
			else if (c >= 'A' && c <= 'Z') {
				first = 'A';
				key = 5;
			}
			if (first != 0)
				c = (char)(first + (c - first - key + 26) % 26);
			
			DeShifrMas[j] = c;
			
		}
		String DeShifrText = new String(DeShifrMas);
		System.out.println("Decryption message:\n" + DeShifrText);
	}

}
