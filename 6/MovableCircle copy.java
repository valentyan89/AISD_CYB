public class MovableCircle implements Movable{
    private int radius; private MovablePoint center;
    public MovableCircle(int x, int y, int xs, int ys, int r) {
        center = new MovablePoint(x, y, xs, ys); this.radius = r;
    }

    public void moveUp(){
        this.center.moveUp();
    }
    public void moveDown(){
        this.center.moveDown();
    }
    public void moveLeft(){
        this.center.moveLeft();
    }
    public void moveRight(){
        this.center.moveRight();
    }
    @Override
    public String toString(){
        return String.format("Circle with %s and radius = %d", this.center.toString(), this.radius);
    }
}
