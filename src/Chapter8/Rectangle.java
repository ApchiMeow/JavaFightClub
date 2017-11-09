package Chapter8;
public class Rectangle {
    private float length;
    private float width;
    public Rectangle(){
        setLength(1.0f);
        setWidth(1.0f);
    }
    public void perimeter(){
        System.out.printf("Периметр = %f%n", getLength()*2 + getWidth()*2);
    }
    public void area(){
        System.out.printf("Площадь = %f%n", getLength() * getWidth());
    }
    public void setLength(float length) {
        if(length > 0.0f && length < 20.0f){
            this.length = length;
        } else {
            throw new IllegalArgumentException("length must be 0.0-20.0, default length = 1.0");
        }
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if(width > 0.0f && width < 20.0f){
            this.width = width;
        } else {
            throw new IllegalArgumentException("width must be 0.0-20.0, default width = 1.0");
        }
    }

    public float getWidth() {
        return width;
    }
}
