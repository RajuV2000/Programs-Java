class CameraUtil
{
	public static void main(String a[])
	{
		Camera c = new Camera();
		c.setCameraBrand("Sony");
		c.setCameraId(17799);
		c.setPrice(154890);
		
		Lens l = new Lens();
		l.maxFocalLength = 600;
		l.unit = "Millimeters";
		l.minFocalLength = 200;
		
		c.setLens(l);
		System.out.println(c);
	}
}