import java.util.*;
public class NumberGuessingGame {
    public static int yescount = 0;
    public static void addToYesSet(Set a,Set b) {
        if (yescount == 0) {
            a.addAll(b);
            yescount += 1;
        } else {
            Set.copyOf(b).forEach(e -> {
                if (!a.contains(e)) {
                    b.remove(e);
                }
                Set.copyOf(a).forEach(e1 -> {
                    if (!b.contains(e1)) {
                        a.remove(e1);
                    }
                });
            });
        }
    }
    public static int nocount =0;
    public static void addToNoSet(Set c,Set d){
        if (nocount == 0) {
            c.addAll(d);
            nocount += 1;
        } else {
            Set.copyOf(d).forEach(e -> {
                if (!c.contains(e)) {
                    c.add(e);
                }
            });
        }
    }
    public static void main(String[] args) {
        HashSet<Integer> boxA = new HashSet<>(Arrays.asList(8,9,10,11,12,13,14,15));
//        boxA.add(8);
//        boxA.add(9);
//        boxA.add(10);
//        boxA.add(11);
//        boxA.add(12);
//        boxA.add(13);
//        boxA.add(14);
//        boxA.add(15);
        HashSet<Integer> boxB = new HashSet<>();
        boxB.add(4);
        boxB.add(5);
        boxB.add(6);
        boxB.add(7);
        boxB.add(12);
        boxB.add(13);
        boxB.add(14);
        boxB.add(15);
        HashSet<Integer> boxC = new HashSet<>();
        boxC.add(2);
        boxC.add(3);
        boxC.add(6);
        boxC.add(7);
        boxC.add(10);
        boxC.add(11);
        boxC.add(14);
        boxC.add(15);
        HashSet<Integer> boxD = new HashSet<>();
        boxD.add(1);
        boxD.add(3);
        boxD.add(5);
        boxD.add(7);
        boxD.add(9);
        boxD.add(11);
        boxD.add(13);
        boxD.add(15);
        System.out.println("think any number from 1 to 10....");
        Scanner s = new Scanner(System.in);
        System.out.println("is the number in boxA(yes/no)?");
        String a = s.next();
        System.out.println("is the number in boxB(yes/no)?");
        String b = s.next().trim();
        System.out.println("is the number in boxC(yes/no)");
        String c = s.next();
        System.out.println("is the number in boxD(yes/no)?");
        String d = s.next();
        HashSet<Integer> yes = new HashSet<>();
        HashSet<Integer> no = new HashSet<>();
        int nocount = 0;
        if (a.equals("yes")) {
            yes.addAll(boxA);
            yescount += 1;
        } else {
            no.addAll(boxA);
            nocount += 1;
        }
        if (b.equals("yes")) {
            addToYesSet(yes,boxB);
        } else {
            addToNoSet(no,boxB);
        }
        if (c.equals("yes")) {
            addToYesSet(yes,boxC);
        }
        if (c.equals("no")) {
            addToNoSet(no,boxC);
        }
        if (d.equals("yes")) {
            addToYesSet(yes,boxD);
        }
        if (d.equals("no")) {
            addToNoSet(no,boxD);
        }
        Set.copyOf(yes).forEach(e -> {
            if (no.contains(e)) {
                yes.remove(e);
            }
        });
        System.out.println(yes);
    }
}