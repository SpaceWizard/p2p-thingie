
package cnt5106;

public class Cnt5106 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*if(args.length<1){
         System.out.println("At least one argument required. You have only "+args.length+" argument(s).");
         return;
         }*/
        int id = 1001;
        // TODO code application logic here
        System.out.println("#System starts up with totally 3 peers.");
        for (int i = 0; i < 3; i++) {
            Peer p = new Peer();
            //p.start(Integer.parseInt(args[0]));
            p.start(id + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
