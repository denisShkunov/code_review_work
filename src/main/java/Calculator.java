public class Calculator {
    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int dif(int a, int b){
        //TODO inser your realisation in method dif
        int difference = a-b;
        return difference;
    }
    public int div(int a, int b){
        //TODO inser your realisation in method div
        int div = a/b;
        return div;
    }
    public int times(int a, int b){
        //TODO inser your realisation in method times
        int times = a*b;
        return times;
    }
    public int solver(int a, int b){
        //TODO inser your realisation in method solver
        return dif(times(a,b), div(a,b));
    }
}
