
package cnt5106;

/*
 After the handshake, each peer can send a stream of normal messages. A normal message consists of a 4-byte message length field, 1-byte message type field, and a message payload of a variable size.
 The 4-byte message length specifies the message length in bytes. It does not include the length of the message length field itself.
 The 1-byte message type field specifies the type of the message.
 There are eight types of messages.
 type          value
 choke           0
 unchoke         1
 interested      2
 not interested  3
 have            4
 bitfield        5
 request         6
 piece           7
 */
public class Message implements java.io.Serializable {

    int length; //length of the payload
    byte type; //type of the message
    byte[] payload; //the acutal message.
}
