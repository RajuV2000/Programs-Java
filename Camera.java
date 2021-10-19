class Camera
{
	public String cameraBrand;
	public int cameraId;
	public int price;
	public Lens lens;
	
	public Camera()
	{
		System.out.println("Object is created");
	}
	public void setCameraBrand(String cameraBrand)
	{
		this.cameraBrand = cameraBrand;
	}
	public void setCameraId(int cameraId)
	{
		this.cameraId = cameraId;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setLens(Lens lens)
	{
		this.lens = lens;
	}
	
	@Override
	public String toString()
	{
		return "Camera- { Brand name= " + this.cameraBrand + ", Camera Id= " + this.cameraId + ", Total price= " + this.price + ", " + this.lens + "}";
	}
}