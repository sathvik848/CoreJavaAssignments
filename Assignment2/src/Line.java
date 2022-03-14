class Line extends shape {
    void draw(){
        System.out.println("Line");
    }
}
class Rectangle extends shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Cube extends shape{
    void draw(){
        System.out.println("Cube");
    }
}
 abstract class shape{
    abstract void draw();
}
