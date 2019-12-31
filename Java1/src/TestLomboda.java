public class TestLomboda {
    public static void main(String[] args) {
        Demo demo = new Demo();

        Integer result = demo.calucate(1, 1, ((a, b) -> a + b));
        System.out.println(result);

    }

}

class Demo{

    public Integer calucate(int a, int b , Caculate caculate){
        return caculate.add(a,b);
    }
}