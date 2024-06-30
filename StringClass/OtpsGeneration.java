
//WAJP to generate random 25 otps and then store those otps in a Stringbuffer Object
import java.lang.Math;
class OtpsGeneration
{
	public int generateOTP()
	{
		int max=1000;
		int min=1;
		int otp=(int)(Math.random()*(max-min)+1)+max;
		return otp;
	}
	public static void main(String[] args) 
	{
		OtpsGeneration obj=new OtpsGeneration();
		StringBuffer otps=new StringBuffer();

		for(int i=1;i<=25;i++)
		{
			otps.append(obj.generateOTP()+"\n");
		}
		System.out.print(otps);
	  	
	}
}