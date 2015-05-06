public class Cleric {
	
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int  MAX_MP = 10;
	selfAid();
	
	public  void selfAid(){
	this.mp = this.mp - 5;
	this.hp = 50;
	}
	
	public int pray(int sec){
		
		int recover = new Random().nextInt(3) + sec;

		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
	
		return aidMp;
	}
	
	public Cleric(String name,int hp,int mp){
		
		this.name = name;
		this.hp = hp;
		this.mp = mp;
			
	}
	
	public Cleric(String name,int hp){
		
		this(name,hp,Cleric.MAX_MP);
	}
	
	public Cleric(String name){
		this(name,Cleric.MAX_HP);
	}
}
