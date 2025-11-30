public class MovableRectangleForSeven implements MovableForSeven{
    private int leftTopX, leftTopY, rightBottomX, rightBottomY, xSpeed, ySpeed;
    
    public MovableRectangleForSeven(int x1, int x2, int y1, int y2, int xS, int yS){
        this.leftTopX = x1; this.leftTopY = y1; this.rightBottomX = x2; this.rightBottomY = y2; this.xSpeed = xS; this.ySpeed = yS;
    }
    @Override
    public void moveUp() {
        this.leftTopY += this.ySpeed; this.rightBottomY += this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.leftTopY -= this.ySpeed; this.rightBottomY -= this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.leftTopX -= this.xSpeed; this.rightBottomX -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.leftTopX += this.xSpeed; this.rightBottomX += this.xSpeed;
    }
    @Override
    public String toString(){
        return String.format("Rectangle with 2 dots: (%d, %d) and (%d, %d), speed for x = %d speed for y = %d", this.leftTopX, this.leftTopY, this.rightBottomX, this.rightBottomY, this.xSpeed, this.ySpeed);
    }
}
