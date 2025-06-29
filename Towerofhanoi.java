public class Towerofhanoi {
    public static void TowerofHanoi(int n, String src, String Helper, String Dest) {
        if(n == 1) {
            System.out.println("Transfer Disk " + n + " From " + src + " To " + Dest);
            return;
        }
        TowerofHanoi(n - 1, src, Dest, Helper);
        System.out.println("Transfer Disk " + n + " From " + src + " To " + Dest);
        TowerofHanoi(n - 1, Helper, src, Dest);
    }

    public static void main(String[] args) {
        int n = 3;
        TowerofHanoi(n, "Source", "Helper", "Destination");
    }
}
