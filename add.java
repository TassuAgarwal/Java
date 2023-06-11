class calc {
    public void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}

class advcalc extends calc {
    public void add(int n1, int n2) {
        System.out.println(n1 + n2 + 1);
    }
}

class overriding {
    public static void main(String[] args) {
        advcalc B = new advcalc();
        B.add(3, 4);

    }
}
