package class2;

public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.set(10);
        stringBox.set("天外天移动Android组");

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
        //输出结果：
        //10
        //天外天移动Android组
    }
}