
package cnt5106;

public class Handshake implements java.io.Serializable{
    String header = "HELLO"; //
    byte[] zeros = new byte [27]; //zero paddings
    int pid; //peer id
    Handshake(int peer_id){
        for(int i = 0;i<27;i++) zeros[i] = 0;
        pid = peer_id;
    }
}

