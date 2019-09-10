package game;

public class Grilla extends Object {
	private int life = 3;
	
	public Grilla(){
		this.width = this.getWidth();
        this.height = this.getHeight();
        this.x = 10;
        this.y = 10;
	}
	public void subtractLife() {
        --this.life;
    }

    public int getLife() {
        return this.life;
    }
	
    public void moveTo(int x, int y) {
        this.x = x - this.width / 2;
        this.y = y - this.height / 2;
    }
    
}
