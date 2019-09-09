Target Interface: This is the desired interface class which will be used by the clients.
Adapter class: This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class.
Adaptee class: This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use.
Client: This class will interact with the Adapter class.