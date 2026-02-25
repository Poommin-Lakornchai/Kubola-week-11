/*class Bottle {
    int capacity;
    int waterVolume;
    public Bottle(int capacity,int waterVolume) {
        this.capacity = capacity;
        this.waterVolume = waterVolume;
    }
    //เติมน้ำให้เต็ม
    public void filled() {
        waterVolume = capacity;
    }
    //เทน้ำจากขวดให้หมด ไปยังขวด b
    public void pourAll(Bottle b) {
        b.addWaterVolume(waterVolume);
        waterVolume = 0;
    }
    //เทน้ำออกให้หมด
    public void pourAll() {
        waterVolume = 0;
    }
    //เพิ่มปริมาตรน้ำ
    private void addWaterVolume(int wv) {
        waterVolume = waterVolume + wv;
    }
    //เทน้ำจากขวด ไปยังขวด b จนกว่าขวด b จะเต็ม
    public void pourUntilFull(Bottle b) {
        waterVolume = waterVolume - (b.capacity - b.waterVolume);
        b.waterVolume = b.capacity;
    }
    //แสดงสถานะของขวด และปริมาณน้ำที่มีในขวด
    public void showInfo() {
        System.out.println("Bottle: " + capacity + " litre, Water volume: " + waterVolume + " litre.");
    }
}
public class Lab11_13 {
    public static void main(String[] args) {
        Bottle b1,b2;
        b1 = new Bottle(3,0);
        b2 = new Bottle(5,0);
        System.out.println("------------ Start -----------");
        b1.showInfo();
        b2.showInfo();
        b1.filled();

        System.out.println("---- After fill bottle b1 ----");
        b1.showInfo();
        b2.showInfo();

        b1.pourAll(b2);
        System.out.println("---- After pour bottle b1 to b2 ----");
        b1.showInfo();
        b2.showInfo();

        b1.filled();
        System.out.println("---- After fill bottle b1 ----");
        b1.showInfo();
        b2.showInfo();

        b1.pourUntilFull(b2);
        System.out.println("---- After pour bottle b1 to b2 (until full) ----");
        b1.showInfo();
        b2.showInfo();

        b2.pourAll();
        System.out.println("---- After pour bottle b2 ----");
        b1.showInfo();
        b2.showInfo();

        b1.pourAll(b2);
        System.out.println("---- After pour bottle b1 to b2 ----");
        b1.showInfo();
        b2.showInfo();

        b1.filled();
        System.out.println("---- After fill bottle b1 ----");
        b1.showInfo();
        b2.showInfo();

        b1.pourAll(b2);
        System.out.println("---- After pour bottle b1 to b2 ----");
        b1.showInfo();
        b2.showInfo();

    }
}*/

