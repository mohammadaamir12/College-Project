class Pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing");
    }
    public void color(){
    System.out.println(this.color);
    
}

}

public class op{
public static void main(String[] args) {
  Pen pen1=new Pen();
  pen1.color="blue";
  pen1.type="gel";

  Pen pen2=new Pen();
  pen2.color="black";
  pen2.type="ball";
  pen1.color();
  pen2.color();  

}
}
