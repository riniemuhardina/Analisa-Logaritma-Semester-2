import java.util.Scanner;

public class TugasArray {
   	 public static void main (String args[]) {
     		   Scanner masuk = new Scanner(System.in);

        Motor[] mtr = new Motor[2];
        for(int i=0;i<mtr.length;i++) {

            System.out.println("masukan data "+(i+1));
            System.out.print("merek : ");
            String merek = masuk.next();
            System.out.print("plat : ");
            int plat = masuk.nextInt();
            Motor motor = new Motor();
            motor.setmerek(merek);
            motor.setplat(plat);
            mtr[i] = motor;
        }
        for(int i=0;i<mtr.length;i++) {
           
	 System.out.println("tampilan data "+(i+1));
            System.out.println("merek : "+mtr[i].getmerek());
            	System.out.println("plat : "+mtr[i].getplat());
        }
    }
}

class Motor {
    private String merek;
    private int plat;
    public void setmerek(String merek) {
        this.merek = merek;
    }
    public void setplat(int plat) {
        this.plat = plat;
    }
    public String getmerek() {
        return this.merek;
    }
    public int getplat() {
        return this.plat;
    }
}