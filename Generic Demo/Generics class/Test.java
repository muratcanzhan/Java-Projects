public class Test<T> {
    private T obj;


    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        System.out.println(obj);
        this.obj = obj;
    }
}
