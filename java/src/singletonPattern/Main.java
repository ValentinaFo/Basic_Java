package singletonPattern;

import org.w3c.dom.ls.LSOutput;

//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni
// e poi si stamperanno a video
public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        System.out.println("User1");
        user1.printUser();
        System.out.println();
        User user2 = User.getInstance();
        user2.setName("Valentina");
        user2.printUser();
        System.out.println();


    }
}
