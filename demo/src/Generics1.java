public class  Generics1<K>{
    private K k;
    public void set(K k) {
        this.k = k;
    }
    public K get() {
        return k;
    }
    public static void main(String[] args) {
        Generics1<Integer> i = new Generics1<>();
        i.set(51);
        System.out.println("Integer Value: " + i.get());
        Generics1<String> s= new  Generics1<>();
        s.set("orewa monkey.d.luffy");
        System.out.println("String Value: " + s.get());
        Generics1<Character> c = new  Generics1<>();
        c.set('d');
        System.out.println("character given: " + c.get());
    }
}

