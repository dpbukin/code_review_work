public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Number can not be by Zero");
        }
        return a/b;

    }
    public int times(int a, int b){
        return a*b;

    }
    public int solver(){
        int sum = add(6,2);
        int dif = dif(6,2);
        int div = div(6,2);
        int times = times(6,2);

        int sumAllResults = sum + dif + div + times;

        return sumAllResults;
    }
}
