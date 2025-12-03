import java.util.*;
interface Modo{
    void mover(String accion);
}

class ModoRobot implements Modo{
    public void mover(String accion){
        System.out.println("MODE TRASNFORMER: "+accion+" 'a correr'");
    }
}

class ModoAuto implements Modo{
    public void mover(String accion){
        System.out.println("MODE AUTOBOT: "+accion+" 'a rodar'");
    }
}

class ModoSigilo implements Modo{
    public void mover(String accion){
        System.out.println("MODE SPY: "+accion+" 'que no nos vean'");
    }
}
interface Comando{
    void ejecutar();
}

class Avanzar implements Comando{
    Transformer t;
    public Avanzar(Transformer t){
        this.t=t;
    }
    public void ejecutar(){
        t.realizar("avanzar");
    }
}

class Retroceder implements Comando{
    Transformer t;
    public Retroceder(Transformer t){
        this.t=t;
    }
    public void ejecutar(){
        t.realizar("retroceder");
    }
}

class Girar implements Comando{
    Transformer t;
    public Girar(Transformer t){
        this.t=t;
    }
    public void ejecutar(){
        t.realizar("girar");
    }
}

class Saltar implements Comando{
    Transformer t;
    public Saltar(Transformer t){
        this.t=t;
    }
    public void ejecutar(){
        t.realizar("saltar");
    }
}
class Transformer{
    Modo modo;

    public void setModo(Modo m){
        modo=m;
    }

    public void realizar(String accion){
        modo.mover(accion);
    }
}
public class TransformerSIMM{
    public static void main(String[] args){
        Transformer bumblebee=new Transformer();
        Transformer batmanAutobot=new Transformer();

        bumblebee.setModo(new ModoRobot());
        batmanAutobot.setModo(new ModoAuto());
        Comando abee=new Avanzar(bumblebee);
        Comando rbee=new Retroceder(bumblebee);
        Comando gbee=new Girar(bumblebee);
        Comando sbee=new Saltar(bumblebee);
        Comando abat=new Avanzar(batmanAutobot);
        Comando rbat=new Retroceder(batmanAutobot);
        Comando gbat=new Girar(batmanAutobot);
        Comando sbat=new Saltar(batmanAutobot);

        System.out.println("BUMBLEBEE MODO ROBOT");
        abee.ejecutar();
        gbee.ejecutar();
        System.out.println("\nBUMBLEBEE TRANSFORMACION AUTOBOT");
        bumblebee.setModo(new ModoAuto());
        abee.ejecutar();
        rbee.ejecutar();
        System.out.println("\nBATMAN MODO AUTOBOT");
        abat.ejecutar();
        System.out.println("\nBATMAN CAMBIANDO A MODO ESPIA");
        batmanAutobot.setModo(new ModoSigilo());
        sbat.ejecutar();
        abat.ejecutar();
        gbat.ejecutar();
    }
}
