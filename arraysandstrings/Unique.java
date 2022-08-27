class Unique {
    public boolean IsUnique(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    } 
    public static void main(String[] args) {
        Unique uq = new Unique();
        boolean res = uq.IsUnique("Chaos");
        System.out.println("Is every character unique in the string?: "+res);
    }
}
