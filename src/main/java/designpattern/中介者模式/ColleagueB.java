package designpattern.中介者模式;

class ColleagueB extends AbstractColleague{
 
	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}
}
