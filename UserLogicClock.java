class  UserLogicClock{
	public static void main(String[] args){
		ClockTower clocktower=new ClockTower(256.65,"newyork",new Clock1(10,19,50));
		clocktower.clock1.showingTime();
		clocktower.alarmClock();
	}
}
