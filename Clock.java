class  Clock{
	private int hrs,min,sec;
	public Clock(int hour,int minute,int second){
		if((hour>0 && hour<=12) && (minute>=0 && minute<=59) && (second>=0 && second<=59)){
			this.hrs=hour;
			this.min=minute;
			this.sec=second;
		}
	}
	public void setHrs(int hour){
		if(hour>0 && hour<=12){
			this.hrs=hour;
		}
		else{
			System.out.println("Buddha enter the correct value!..");
		}
	}
	public int getHrs(){
		return this.hrs;
	}
	public void setMin(int minute){
		if(minute>=0 && minute<=59){
			this.min=minute;
		}
		else{
			System.out.println("Buddha enter the correct value!..");
		}
	}
	public int getMin(){
		return this.min;
	}
	public void setSec(int second){
		if(second>=0 && second<=59){
			this.sec=second;
		}
		else{
			System.out.println("Buddha enter the correct value!..");
		}
	}
	public int getSec(){
		return this.sec;
	}
}