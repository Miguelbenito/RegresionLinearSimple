
package regresion.linear.simple;

public class Proceso {
    
    
    public double calcularb0(int n, Observ[] o){
        double res1=0,res2=0,res3=0,res4=0,res;
        
        //Sum x^2
       for(int i=0;i<n;i++){
           double mres;
           mres = o[i].x * o[i].x;
           res1 = res1+mres;
       } 
       //Sum Y
       for(int i=0;i<n;i++){
           res2 = res2+o[i].y;
       }
       //Sum X
       for(int i=0;i<n;i++){
           res3 = res3+o[i].x;
       }
       //Sum XY
       for(int i=0;i<n;i++){
           double mres;
           mres = o[i].x * o[i].y;
           res4 = res4+mres;
       }
       
       res = ((res1*res2)-(res3*res4))/((n*res1)-(res3*res3));
       return res;
    }
    
    public double calcularb1(int n,Observ[] o){
        double res1=0,res2=0,res3=0,res4=0,res;
        
        //Sum XY
        for(int i=0;i<n;i++){
           double mres;
           mres = o[i].x * o[i].y;
           res1 = res1+mres;
       }
        //Sum X
       for(int i=0;i<n;i++){
           res2 = res2+o[i].x;
       }
       //Sum Y
       for(int i=0;i<n;i++){
           res3 = res3+o[i].y;
       }
       //Sum X^2
       for(int i=0;i<n;i++){
           double mres;
           mres = o[i].x * o[i].x;
           res4 = res4+mres;
       }
       
       res = ((n*res1)-(res2*res3))/((n*res4)-(res2*res2));
        return res;
    }
    
    public double predecir(double num, double b0, double b1){
        double res = b0+(b1*num);
        return res;
    }
    
}
