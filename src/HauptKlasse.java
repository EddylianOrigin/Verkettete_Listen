import com.company.S_LinkedList;

public class HauptKlasse {


    public static void main(String[] args) {
        // write your code here
        String s = "Wow", p = "krass", d = "genial", f = "toll";

        S_LinkedList l = new S_LinkedList();

        S_LinkedList.ElementL e = l.insert(s);

        l.insert(d);

        l.insert(f, e);//e ist vorgänger element

        l.insert(p);

        System.out.println(l.toString());

        l.remove(e);

        System.out.println(l.toString());
    }
}
