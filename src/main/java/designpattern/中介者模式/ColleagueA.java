package designpattern.中介者模式;

class ColleagueA extends AbstractColleague{
 
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.AaffectB();
	}
}
