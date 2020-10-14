package com.example.writerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView)findViewById(R.id.text1);
        String para = "OSI stands for Open Systems Interconnection. It has been developed by ISO – ‘International Organization of Standardization‘, in the year 1984. It is a 7 layer architecture with each layer having specific functionality to perform. All these 7 layers work collaboratively to transmit the data from one person to another across the globe.\n" +
                "\n" +
                "1. Physical Layer (Layer 1) :\n" +
                "\n" +
                "The lowest layer of the OSI reference model is the physical layer. It is responsible for the actual physical connection between the devices. The physical layer contains information in the form of bits. It is responsible for transmitting individual bits from one node to the next. When receiving data, this layer will get the signal received and convert it into 0s and 1s and send them to the Data Link layer, which will put the frame back together.\n" +
                "\n" +
                "\n" +
                "\n" +
                "The functions of the physical layer are :\n" +
                "\n" +
                "    Bit synchronization: The physical layer provides the synchronization of the bits by providing a clock. This clock controls both sender and receiver thus providing synchronization at bit level.\n" +
                "    Bit rate control: The Physical layer also defines the transmission rate i.e. the number of bits sent per second.\n" +
                "    Physical topologies: Physical layer specifies the way in which the different, devices/nodes are arranged in a network i.e. bus, star or mesh topolgy.\n" +
                "    Transmission mode: Physical layer also defines the way in which the data flows between the two connected devices. The various transmission modes possible are: Simplex, half-duplex and full-duplex.\n" +
                "\n" +
                "* Hub, Repeater, Modem, Cables are Physical Layer devices.\n" +
                "** Network Layer, Data Link Layer and Physical Layer are also known as Lower Layers or Hardware Layers.\n" +
                "\n" +
                "2. Data Link Layer (DLL) (Layer 2) :\n" +
                "\n" +
                "The data link layer is responsible for the node to node delivery of the message. The main function of this layer is to make sure data transfer is error-free from one node to another, over the physical layer. When a packet arrives in a network, it is the responsibility of DLL to transmit it to the Host using its MAC address.\n" +
                "Data Link Layer is divided into two sub layers :\n" +
                "\n" +
                "    Logical Link Control (LLC)\n" +
                "    Media Access Control (MAC)\n" +
                "\n" +
                "The packet received from Network layer is further divided into frames depending on the frame size of NIC(Network Interface Card). DLL also encapsulates Sender and Receiver’s MAC address in the header.\n" +
                "\n" +
                "The Receiver’s MAC address is obtained by placing an ARP(Address Resolution Protocol) request onto the wire asking “Who has that IP address?” and the destination host will reply with its MAC address.\n" +
                "\n" +
                "The functions of the data Link layer are :\n" +
                "\n" +
                "    Framing: Framing is a function of the data link layer. It provides a way for a sender to transmit a set of bits that are meaningful to the receiver. This can be accomplished by attaching special bit patterns to the beginning and end of the frame.\n" +
                "    Physical addressing: After creating frames, Data link layer adds physical addresses (MAC address) of sender and/or receiver in the header of each frame.\n" +
                "    Error control: Data link layer provides the mechanism of error control in which it detects and retransmits damaged or lost frames.\n" +
                "    Flow Control: The data rate must be constant on both sides else the data may get corrupted thus , flow control coordinates that amount of data that can be sent before receiving acknowledgement.\n" +
                "    Access control: When a single communication channel is shared by multiple devices, MAC sub-layer of data link layer helps to determine which device has control over the channel at a given time.\n" +
                "\n" +
                "* Packet in Data Link layer is referred as Frame.\n" +
                "** Data Link layer is handled by the NIC (Network Interface Card) and device drivers of host machines.\n" +
                "*** Switch & Bridge are Data Link Layer devices.\n" +
                "\n" +
                "\n" +
                "\n" +
                "3. Network Layer (Layer 3) :\n" +
                "\n" +
                "Network layer works for the transmission of data from one host to the other located in different networks. It also takes care of packet routing i.e. selection of the shortest path to transmit the packet, from the number of routes available. The sender & receiver’s IP address are placed in the header by the network layer.\n" +
                "The functions of the Network layer are :\n" +
                "\n" +
                "    Routing: The network layer protocols determine which route is suitable from source to destination. This function of network layer is known as routing.\n" +
                "    Logical Addressing: In order to identify each device on internetwork uniquely, network layer defines an addressing scheme. The sender & receiver’s IP address are placed in the header by network layer. Such an address distinguishes each device uniquely and universally.\n" +
                "\n" +
                "* Segment in Network layer is referred as Packet.\n" +
                "\n" +
                "** Network layer is implemented by networking devices such as routers.\n" +
                "\n" +
                "4. Transport Layer (Layer 4) :\n" +
                "\n" +
                "Transport layer provides services to application layer and takes services from network layer. The data in the transport layer is referred to as Segments. It is responsible for the End to End Delivery of the complete message. The transport layer also provides the acknowledgement of the successful data transmission and re-transmits the data if an error is found.\n" +
                "• At sender’s side:\n" +
                "Transport layer receives the formatted data from the upper layers, performs Segmentation and also implements Flow & Error control to ensure proper data transmission. It also adds Source and Destination port number in its header and forwards the segmented data to the Network Layer.\n" +
                "Note: The sender need to know the port number associated with the receiver’s application.\n" +
                "Generally, this destination port number is configured, either by default or manually. For example, when a web application makes a request to a web server, it typically uses port number 80, because this is the default port assigned to web applications. Many applications have default port assigned.\n" +
                "• At receiver’s side:\n" +
                "Transport Layer reads the port number from its header and forwards the Data which it has received to the respective application. It also performs sequencing and reassembling of the segmented data.\n" +
                "\n" +
                "The functions of the transport layer are :\n" +
                "\n" +
                "    Segmentation and Reassembly: This layer accepts the message from the (session) layer , breaks the message into smaller units . Each of the segment produced has a header associated with it. The transport layer at the destination station reassembles the message.\n" +
                "    Service Point Addressing: In order to deliver the message to correct process, transport layer header includes a type of address called service point address or port address. Thus by specifying this address, transport layer makes sure that the message is delivered to the correct process.\n" +
                "\n" +
                "The services provided by the transport layer :\n" +
                "\n" +
                "    Connection Oriented Service: It is a three-phase process which include\n" +
                "    – Connection Establishment\n" +
                "    – Data Transfer\n" +
                "    – Termination / disconnection\n" +
                "    In this type of transmission, the receiving device sends an acknowledgement, back to the source after a packet or group of packet is received. This type of transmission is reliable and secure.\n" +
                "    Connection less service: It is a one-phase process and includes Data Transfer. In this type of transmission, the receiver does not acknowledge receipt of a packet. This approach allows for much faster communication between devices. Connection-oriented service is more reliable than connectionless Service.\n" +
                "\n" +
                "* Data in the Transport Layer is called as Segments.\n" +
                "** Transport layer is operated by the Operating System. It is a part of the OS and communicates with the Application Layer by making system calls.\n" +
                "Transport Layer is called as Heart of OSI model.\n" +
                "\n" +
                "5. Session Layer (Layer 5) :\n" +
                "\n" +
                "This layer is responsible for establishment of connection, maintenance of sessions, authentication and also ensures security.\n" +
                "The functions of the session layer are :\n" +
                "\n" +
                "    Session establishment, maintenance and termination: The layer allows the two processes to establish, use and terminate a connection.\n" +
                "    Synchronization : This layer allows a process to add checkpoints which are considered as synchronization points into the data. These synchronization point help to identify the error so that the data is re-synchronized properly, and ends of the messages are not cut prematurely and data loss is avoided.\n" +
                "    Dialog Controller : The session layer allows two systems to start communication with each other in half-duplex or full-duplex.\n" +
                "\n" +
                "**All the below 3 layers(including Session Layer) are integrated as a single layer in the TCP/IP model as “Application Layer”.\n" +
                "**Implementation of these 3 layers is done by the network application itself. These are also known as Upper Layers or Software Layers.\n" +
                "\n" +
                "\n" +
                "SCENARIO:\n" +
                "Let’s consider a scenario where a user wants to send a message through some Messenger application running in his browser. The “Messenger” here acts as the application layer which provides the user with an interface to create the data. This message or so-called Data is compressed, encrypted (if any secure data) and converted into bits (0’s and 1’s) so that it can be transmitted.\n" +
                "\n" +
                "6. Presentation Layer (Layer 6) :\n" +
                "\n" +
                "Presentation layer is also called the Translation layer.The data from the application layer is extracted here and manipulated as per the required format to transmit over the network.\n" +
                "The functions of the presentation layer are :\n" +
                "\n" +
                "    Translation : For example, ASCII to EBCDIC.\n" +
                "    Encryption/ Decryption : Data encryption translates the data into another form or code. The encrypted data is known as the cipher text and the decrypted data is known as plain text. A key value is used for encrypting as well as decrypting data.\n" +
                "    Compression: Reduces the number of bits that need to be transmitted on the network.\n" +
                "\n" +
                "7. Application Layer (Layer 7) :\n" +
                "\n" +
                "At the very top of the OSI Reference Model stack of layers, we find Application layer which is implemented by the network applications. These applications produce the data, which has to be transferred over the network. This layer also serves as a window for the application services to access the network and for displaying the received information to the user.\n" +
                "Ex: Application – Browsers, Skype Messenger etc.\n" +
                "**Application Layer is also called as Desktop Layer.\n" +
                "\n" +
                "The functions of the Application layer are :\n" +
                "\n" +
                "    Network Virtual Terminal\n" +
                "    FTAM-File transfer access and management\n" +
                "    Mail Services\n" +
                "    Directory Services\n" +
                "\n" +
                "OSI model acts as a reference model and is not implemented in the Internet because of its late invention. Current model being used is the TCP/IP model.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "This article is contributed by Kundana Thiyari and Harshita Pandey. If you like GeeksforGeeks and would like to contribute, you can also write an article using contribute.geeksforgeeks.org or mail your article to contribute@geeksforgeeks.org. See your article appearing on the GeeksforGeeks main page and help other Geeks.\n" +
                "\n" +
                "Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.\n" +
                "\n" +
                "Attention reader! Don’t stop learning now. Get hold of all the important CS Theory concepts for SDE interviews with the CS Theory Course at a student-friendly price and become industry ready.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Recommended Posts:\n" +
                "\n" +
                "    Working of ISO-OSI Model\n" +
                "    OSI Model Full Form in Computer Networking\n" +
                "    Critique of OSI Model and Protocols\n" +
                "    Working Of Different layers in Computer Network\n" +
                "    OSI, TCP/IP and Hybrid models\n" +
                "    OSI Full Form\n" +
                "    Difference between E-R Model and Relational Model in DBMS\n" +
                "    Types of Keys in Relational Model (Candidate, Super, Primary, Alternate and Foreign)\n" +
                "    Introduction of ER Model\n" +
                "    TCP/IP Model\n" +
                "    Generalization, Specialization and Aggregation in ER Model\n" +
                "    Enhanced ER Model\n" +
                "    Mathematics | Hypergeometric Distribution model\n" +
                "    Attributes to Relationships in ER Model\n" +
                "    Devices used in each layer of TCP/IP model\n" +
                "    A Model for Network Security\n" +
                "    Types of Attributes in ER Model\n" +
                "    Difference between ER Model and RDBMS\n" +
                "    Constraints on Relational database model\n" +
                "    Structural Constraints of Relationships in ER Model\n" +
                "\n" +
                "\n" +
                "Improved By : magbene, Vinod Yadav, mehulpatoriadnd, priyankashukla\n" +
                "\n" +
                "Article Tags :\n" +
                "Computer Networks\n" +
                "GATE CS\n" +
                "Practice Tags :\n" +
                "Computer Networks\n" +
                "\n" +
                "thumb_up\n" +
                "107\n" +
                "\n" +
                "\n" +
                "2.5\n" +
                "\n" +
                "Based on 52 vote(s)\n" +
                "Please write to us at contribute@geeksforgeeks.org to report any issue with the above content.\n" +
                "Post navigation\n" +
                "Previous\n" +
                "first_page Internet Protocol version 6 (IPv6)\n" +
                "Next\n" +
                "last_page\n" +
                "Introduction of Firewall in Computer Network\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Writing code in comment? Please use ide.geeksforgeeks.org, generate link and share the link here.\n" +
                "\n" +
                "auto\n" +
                "Most popular in Computer Networks\n" +
                "\n" +
                "    Data encryption standard (DES) | Set 1\n" +
                "    UDP Server-Client implementation in C\n" +
                "    TCP 3-Way Handshake Process\n" +
                "    Differences between TCP and UDP\n" +
                "    Types of area networks - LAN, MAN and WAN\n" +
                "\n" +
                "\n" +
                "Most visited in GATE CS\n" +
                "\n" +
                "    Compiler Theory | Set 1\n" +
                "    Data Structures and Algorithms | Set 8\n" +
                "    Data Structures and Algorithms | Set 9\n" +
                "    Automata Theory | Set 1\n" +
                "    Data Structures and Algorithms | Set 6\n" +
                "\n" +
                "\n" +
                "GeeksforGeeks\n" +
                "room\n" +
                "5th Floor, A-118,\n" +
                "Sector-136, Noida, Uttar Pradesh - 201305\n" +
                "email\n" +
                "feedback@geeksforgeeks.org\n" +
                "\n" +
                "    Company\n" +
                "    About Us\n" +
                "    Careers\n" +
                "    Privacy Policy\n" +
                "    Contact Us\n" +
                "\n" +
                "    Learn\n" +
                "    Algorithms\n" +
                "    Data Structures\n" +
                "    Languages\n" +
                "    CS Subjects\n" +
                "    Video Tutorials\n" +
                "\n" +
                "    Practice\n" +
                "    Courses\n" +
                "    Company-wise\n" +
                "    Topic-wise\n" +
                "    How to begin?\n" +
                "\n" +
                "    Contribute\n" +
                "    Write an Article\n" +
                "    Write Interview Experience\n" +
                "    Internships\n" +
                "    Videos\n" +
                "\n" +
                "@geeksforgeeks , Some rights reserved\n" +
                "We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our Cookie Policy & Privacy Policy ";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}