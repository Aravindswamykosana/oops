class ClockTower{
	double buildSize;
	String buildplace;
	Clock1 clock1;
	public ClockTower(double buildSize,String buildplace,Clock1 clock1){
		this.buildSize=buildSize;
		this.buildplace=buildplace;
		this.clock1=clock1;
	}
	public void alarmClock(){
		//this.clock1.showingTime();
		System.out.println("sing a song for every 1 hour...!.from clocktower.!");
	}
}
