package Objects;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() // calls super
                + "["
                + "width=" + width
                + ",height=" + height
                + "]";
    }

    @Override
    public int hashCode(){
        return super.hashCode() + Integer.valueOf(width).hashCode() + Integer.valueOf(height).hashCode();
    }

    @Override
    public boolean equals(Object obj){
        //self check
        if(this == obj) return true;
        //null check
        if(obj == null) return false;
        //type check...
        if(getClass() != obj.getClass()) return false;
        //...and cast
        Rectangle objRectangle = (Rectangle) obj;
        //fields comparison (your own definition of "equal")
        return (this.width == objRectangle.width && this.height == objRectangle.height)
                || (this.width == objRectangle.height && this.height == objRectangle.width);

    }
}
