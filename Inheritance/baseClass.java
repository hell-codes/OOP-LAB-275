package Inheritance;
class calculator{
  public float mul(float a, float b){
     return a*b; 
    }
  public float sum(float a, float b){
     return a+b; 
    }
  public float dif(float a, float b){
     return a-b; 
    }
  public float div(float a, float b){
     return a/b; 
    }
}

class advanced extends calculator{
  public float mod(float m, float n){
     return m%n; 
    }
  public float sqr(float m){
     return m*m; 
    }
  public float sqrt(float m){
        return (float)Math.sqrt(m);
     
    }
}

class area extends advanced{
  public float square(float m){
     return m*m; 
    }
  public float rectangle(float l, float b){
     return l*b; 
    }
  public float circle(float r){
     return (float) (3.14*r*r); 
    }
}

public class baseClass{
  public static void main(String[] args){
  area obj1 = new area();
  float result;
  result = obj1.sum(10,20);
  System.out.println("Sum: "+ result);
  result = obj1.circle(4);
  System.out.println("Circle Ar: "+ result);
  result = obj1.sqrt(25);
  System.out.println("Sqrt: " + result);
 }
}
