/**
 * Created by Elemental on 11/4/2016.
 */
import Inheritance.*;
import GUI.*;
import SmallPolyProg.*;
import File.*;
import java.util.EnumSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.io.*;
import java.util.*;
import java.lang.*;

public class main {
    public static void main(String[] args) {
        init();
    }

    public static void init(){
        //timetuto();
        //comptuto();
        //enumtuto();
        //statictuto();
        //inheritancetuto();
        //sguituto();
        //mguistutos();
        //eventsgui();
        //polyarrtuto();
        //polyeat();
        //aniprog();
        //corepoly();
        //jbutton();
        //jcheck();
        //jrad();
        //jcbox();
        //jlist();
        //jmlist();
        //jmevent();
        //jadap();
        //filer();
        //filec();
        //filee();
        //fileread();
        //excepthandling();
        //layout();
        //drawing();
        //cchooser();
        //moardrawing();
    }

    public static void timetuto(){
        //creates objects
        Time TimeObject = new Time();
        TimeObject.setTime(15,24,55);

        System.out.println("\n");

        //prints out dif time
        System.out.println(TimeObject.mil());
        System.out.println(TimeObject.Norm());


    }
    public static void comptuto(){
        //creates objects
        ToString tostring = new ToString(5,6,7);
        Compose printing = new Compose("alex",tostring);

        System.out.println("\n");

        //prints composition
        System.out.println(printing);
    }
    public static void enumtuto(){

        System.out.println("\n");

        //print all values in enumeration
        //cycles inside people wich is refering to the list of the enum enumeration
        //.value is the built in funcion that has all the constants
        for(Enumeration people:Enumeration.values()){
            System.out.printf("%s\t%s\t%s,\n ",people,people.getDesc(),people.getYear());
        }

        System.out.println("\n");

        //this goes through the range of this constant list
        System.out.printf("\n And now for the range of constants!!! \n");
        for (Enumeration people: EnumSet.range(Enumeration.kelsey,Enumeration.candy)){
            System.out.printf("%s\t%s\t%s,\n ",people,people.getDesc(),people.getYear());

        }
    }
    public static void statictuto(){

        System.out.println("\n");

        //practice of static
        //creates objects
        StaticVar mem1=new StaticVar("Pollo","Frito");
        StaticVar mem2=new StaticVar("Pollos","Fritos");
        StaticVar mem3=new StaticVar("Polloss","Fritoss");

        System.out.println("\n");

        //sees that each var has own data
        // despite mem  being static globaly
        System.out.println(mem1.getFirst());
        System.out.println(mem1.getLast());
        System.out.println(mem1.getMembers());

        System.out.println(mem2.getFirst());
        System.out.println(mem2.getLast());
        System.out.println(mem2.getMembers());

        System.out.println(mem3.getFirst());
        System.out.println(mem3.getLast());
        System.out.println(mem3.getMembers());

        System.out.println("\n");

        //you dont need an object to call a static since its global
        System.out.println(StaticVar.getMembers());
    }
    public static void inheritancetuto(){
        Pollo polloobj = new Pollo();
        Bread breadobj = new Bread();
        //even tho these classes dont have the method
        // eat since they inherite(extend) food they
        // can use said method
        polloobj.eat();
        breadobj.eat();

    }
    public static void sguituto(){
        //this is the standard gui,itll look the same on any system
        //this input can only be interpreted as a string
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");
        //by consequence we have to turn it into a int
        // if we want it as so
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;
        //we wanna show this sum
        //takes 4 parameters: position(null is center),actual string,the title bar and the message that will pop up
        JOptionPane.showMessageDialog(null,"The sum is " + sum,"Testing title",JOptionPane.PLAIN_MESSAGE);
    }
    public static void mguistutos(){
        MGUITuto modgui = new MGUITuto();
        //we need to set a default stop operation
        modgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        modgui.setSize(275,180);
        modgui.setVisible(true);



    }
    public static void eventsgui(){
        FirstEventHandler eventgui = new FirstEventHandler();
        eventgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventgui.setSize(500,100);
        eventgui.setVisible(true);


    }
    public static void polyarrtuto(){
        //pilymorphic array
        Food thing[]=new Food[2];
        thing[0]=new Bread();
        thing[1]=new Pollo();

        for (int x=0;x<2;x++){
            thing[x].eat();
        }

    }
    public static void polyeat(){
        human me = new human();

        //even tho it asks for a food object since those other
        //two extend food they can pass as a food object by
        //polymorphing them to be food

        Food fos = new Bread();
        Food foss = new Pollo();
        me.digest(fos);
        me.digest(foss);
    }
    public static void aniprog(){
        AnimalList ALO = new AnimalList();
        Dog d = new Dog();
        Fish f = new Fish();
        ALO.add(d);
        ALO.add(f);
    }
    public static void corepoly(){

        Animal[] theList = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();

        theList[0]=d;
        theList[1]=f;

        for(Animal x: theList){
            x.noise();
        }

    }
    public static void jbutton(){
        JButtonss hgui = new JButtonss();
        hgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hgui.setSize(500,150);
        hgui.setVisible(true);

    }
    public static void jcheck(){
        JCheckbox cgui = new JCheckbox();
        cgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cgui.setSize(500,150);
        cgui.setVisible(true);

    }
    public static void jrad(){
        Radio rgui = new Radio();
        rgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rgui.setSize(500,150);
        rgui.setVisible(true);

    }
    public static void jcbox(){
        JComboboxs cgui = new JComboboxs();
        cgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cgui.setSize(500,150);
        cgui.setVisible(true);

    }
    public static void jlist(){
        Lists lgui = new Lists();
        lgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lgui.setSize(500,150);
        lgui.setVisible(true);

    }
    public static void jmlist(){
        MultipleLists mlgui = new MultipleLists();
        mlgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mlgui.setSize(500,150);
        mlgui.setVisible(true);

    }
    public static void jmevent(){
        MouseEvents megui = new MouseEvents();
        megui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        megui.setSize(500,350);
        megui.setVisible(true);
        megui.setLocationRelativeTo(null);

    }
    public static void jadap(){
        Adapclass adgui = new Adapclass();
        adgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adgui.setSize(500,350);
        adgui.setVisible(true);
        adgui.setLocationRelativeTo(null);

    }
    public static void filer(){
        Open op = new Open();
    }
    public static void filec(){
        //outputs a string to a file
        Create crr = new Create();
    }
    public static void filee(){
        Edit_Adds crt = new Edit_Adds();
        crt.openFile();
        crt.addRecords();
        crt.closeFile();


    }
    public static void fileread(){
        Read rd =  new Read();
        rd.openFile();
        rd.readFile();
        rd.closeFile();
    }
    public static void excepthandling(){
        Scanner input = new Scanner(System.in);
        int x = 1;
        do {
            try {
                System.out.println("First num: ");
                int num1 = input.nextInt();
                System.out.println("Second num: ");
                int num2 = input.nextInt();
                int sum = num1 / num2;
                System.out.println(sum);
                x=2;
            } catch (Exception e) {
                System.out.println("You cant do that");
            }
        }while(x==1);

    }
    public static void layout(){
        Layouts llgui = new Layouts();
        llgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        llgui.setSize(500,150);
        llgui.setVisible(true);

    }
    public static void drawing(){
        JFrame drgui = new JFrame();
        drgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing draw = new Drawing();
        drgui.add(draw);
        drgui.setSize(500,150);
        drgui.setVisible(true);

    }
    public static void cchooser(){
        ColorChooser ccgui = new ColorChooser();
        ccgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ccgui.setSize(500,150);
        ccgui.setVisible(true);

    }
    public static void moardrawing(){
        JFrame mdrgui = new JFrame();
        mdrgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MoarDraweng mdraw = new MoarDraweng();
        mdrgui.add(mdraw);
        mdrgui.setSize(500,200);
        mdrgui.setVisible(true);

    }




}