class Pen{
    String color;
    String type;

    public void write(){
    System.out.println("writing");
}
public void printColor(){
    System.out.println(this.color);
    System.out.println(this.type);
}

}

public class obj{
public static void main(String[] args) {
  Pen pen1=new Pen();
  pen1.color="blue";
  pen1.type="gel";
  pen1.printColor();

}
}