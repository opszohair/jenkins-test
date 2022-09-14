mkdir -p /tmp/ajc
rm -rf /tmp/ajc/*
echo '
public class main {
  public static void main(String[]args){
    System.out.println("hello world !");
  }
}
' > /tmp/ajc/pain.java
