package ArraysProgram;

public class Calculator {

		public int sum(int a, int b) {
			return a + b;
		}

		public byte sum(byte a,byte b) {
			return (byte) (a + b);
		}

		public short sum(short a, short b) {
			return (short) (a + b);
		}

		public double sum(double a, double b) {
			return a + b;
		}

		public float sum(float a, float b) {
			return a + b;
		}

		public long sum(long a, long b) {
			return a + b;
		}

		public static void main(String[] args) {
			Calculator cal = new Calculator();
			int result = cal.sum(100, 205);
			System.out.println(result);
			long result2=cal.sum(67345l, 45680);
			System.out.println(result2);
			byte result3=(byte)cal.sum(423,-420);
			System.out.println(result3);
			short result4=(short)cal.sum(500,500);
			System.out.println(result4);
			double result5=(double)cal.sum(8990,8993);
			System.out.println(result5);
			float result6=(float)cal.sum(6432.0f,6434.0f);
			System.out.println(result);
			short result7=(short)cal.sum(13234, 13236);
			System.out.println(result);
			
		}

	
		
	}


