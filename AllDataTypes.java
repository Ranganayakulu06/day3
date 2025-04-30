public class AllDataTypes{
	public static byte getByte(){
		byte b =10;
		return b;
	}
	public static short getShort(){
		short s = 20;
		return s;
	}
	public static int getInt(){
		int a = 30;
		return a;
	}
	public static long getLong(){
		return 123456L;
	}
	public static char getChar(){
		return  'A';
	}
	public static Boolean getBoolean(){
		return true;
	}
	public static float getFloat(){
		return 10.0f;
	}
	public static double getDouble(){
		return 30.0;
	}
	public static String getString(){
		return "Ranga";
	}
	public static void main(String [] args){
		byte byteResult=getByte();
		System.out.println(byteResult);
		
		short shortResult=getShort();
		System.out.println(shortResult);

		int intResult=getInt();
		System.out.println(intResult);

		long longResult=getLong();
		System.out.println(longResult);

		char charResult=getChar();
		System.out.println(charResult);

		boolean booleanResult=getBoolean();
		System.out.println(booleanResult);

		float floatResult=getFloat();
		System.out.println(floatResult);

		double doubleResult=getDouble();
		System.out.println(doubleResult);

		String stringResult=getString();
		System.out.println(stringResult);

}
}
	
