public class Names {
    public static void main(String[] args) {
        String name = new String("Jon");
        String lastname = new String("Smith");
        System.out.println(name +" "+ lastname);
        int sum = name.length() + lastname.length();
        System.out.println(sum);
        char initial = name.charAt(0);
        char lastInitial = lastname.charAt(0);
        System.out.println(initial+" "+lastInitial);
        System.out.println(name.compareTo(lastname));
        System.out.println(lastname.indexOf(-1));
        System.out.println(name.indexOf(-1));

        String mid1 = name.substring(0,2) + lastname.substring(3, 5);
        String mid2 = lastname.substring(0, 3) +name.substring(1,3);
        System.out.println(mid1);
        System.out.println(mid2);
    }
}

