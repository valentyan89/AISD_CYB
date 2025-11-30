public class MovablePoint implements Movable{
    private int x, y, xspeed, yspeed;
    public MovablePoint(int x, int y, int xs, int ys){
        this.x = x; this.y = y; this.xspeed = xs; this.yspeed = ys;
    }
    public void moveUp(){
        this.y += this.yspeed;
    }
    public void moveDown(){
        this.y -= this.yspeed;
    }
    public void moveLeft(){
        this.x -= this.xspeed;
    }
    public void moveRight(){
        this.x += this.xspeed;
    }
    @Override
    public String toString(){
        return String.format("Dot with cords %d and %d, speed %d %d", this.x, this.y, this.xspeed, this.yspeed);
    }
}
