package logics;


public class ByteCalculator {

	static int power=0;
	public static int recByte(long num) {
		power++;
		return (num%2==0)?recByte(num/2):power;
	}
	
	public static int byteCalc(String dataType) {
		power=0;
		if(dataType=="long") {
			return recByte(Long.MIN_VALUE);
		}
		else if(dataType=="int") {
			return recByte(Integer.MIN_VALUE);
		}
		else if(dataType=="short") {
			return recByte(Short.MIN_VALUE);
		}
		else if(dataType=="byte") {
			return recByte(Byte.MIN_VALUE);			
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int pow = byteCalc("int");
		System.out.println(pow==-1?"Incorrect option":pow);
	}
}
