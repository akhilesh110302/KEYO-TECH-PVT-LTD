public class fan
{
 
		private String make;
		private double radius;
		private String color ;
		private boolean isOn;
		private byte speed;
	
		public fan(String make ,double radius,String color)
		{
			this.make=make;
			this.radius=radius;
			this.color=color;
		}
		public String toString()
		{
			return String.format("make %s, color %s, radius %f",make ,color ,radius);
		}
		public byte getSpeed() {
			return speed;
		}
		public void setSpeed(byte speed) {
			this.speed = speed;
		}
}
