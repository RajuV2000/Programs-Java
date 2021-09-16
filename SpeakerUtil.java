
class SpeakerUtil
{
  
  public static void main(String a[])
  {	
	String name ="boAt";
	System.out.println("Welcome to " + name);
 	boolean isConnected = Speaker.onOrOff();
	System.out.println("The speaker is turned ON " + isConnected);
	
	Speaker.increaseVol();
	Speaker.increaseVol();
	Speaker.increaseVol();
	Speaker.increaseVol();

	Speaker.decreaseVol();
	Speaker.decreaseVol();
	Speaker.decreaseVol();
	Speaker.decreaseVol();
	
  }
}