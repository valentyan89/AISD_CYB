package java;




public class Ball{
    private double x = 0.0; private double y = 0.0;
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double tempVar){
        this.x = tempVar;
    }
    public void setY(double tempVar){
        this.y = tempVar;
    }
    public void setXY(double var1, double var2){
        this.x = var1; this.y = var2;
    }
    public Ball(){}
    public Ball(double var1, double var2){
        this.x = var1; this.y = var2;
    }
    public void move(double var1, double var2){
        this.x += var1; this.y += var2;
    }
    @Override
    public String toString(){
        return "Ball(x=" +this.getX() + ", y=" + this.getY() +')';
    }
}
