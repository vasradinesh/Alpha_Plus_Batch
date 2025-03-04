
class a extends Thread {
    @Override
    public void run(){
        try{
            for(int i =0;i<6;i++){
                System.out.println("ddd");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException i){

        }
    }
  
}
public class thread {
    public static void main(String[] args) throws InterruptedException{
        a d = new a();
        d.start();
        for(int i =0;i<6;i++){
            System.out.println("ww");
            Thread.sleep(1000);
        }
    }
}
