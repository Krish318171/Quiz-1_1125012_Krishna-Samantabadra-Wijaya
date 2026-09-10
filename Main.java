interface connectable{
    void connect();
    void disconnect();
}

interface switchable{
    
}

interface lockable{
    void lock();
    void unlock();
}

enum connectType{
    WIFI,
    BLUETOOTH;
}



abstract class smartDevice{
    private int id;
    private String nama;
    private int daya;
    private int volume;

    smartDevice(int id, String nama, int daya, int volume){
        this.id = id;
        this.nama = nama;
        this.daya = daya;
        this. volume = volume;
        
    }

    abstract void turnOn();
    abstract  void turnOf();
    abstract  void Status();
    String printData(){
        return "id : " + id
        + "\nnama : " + nama
        + "\ndaya : " + daya
        + "\nvolume : " + volume;

    }

}

class smartTV extends smartDevice implements connectable{
    connectType type = connectType.WIFI;

    smartTV(int id, String nama, int daya, int volume){
        super(id, nama, daya, volume);

    }

    @Override 
    public void turnOn(){
        System.out.println("On");
    }

    @Override 
    public void turnOf(){
        System.out.println("Off");
    }

    @Override 
    public void connect(){
        System.out.println("Connect");
    }

    @Override 
    public  void disconnect(){
        System.out.println("Disconnect");
    }
    
}


class smartSpeaker extends smartDevice implements connectable{
    connectType type = connectType.BLUETOOTH;

    smartSpeaker(int id, String nama, int daya, int volume){
        super(id, nama, daya, volume);
    }

    @Override 
    public void turnOn(){
        System.out.println("On");
    }

    @Override 
    public void turnOf(){
        System.out.println("Off");

    }

    @Override 
    public void connect(){
        System.out.println("Connect");
    }

    @Override 
    public  void disconnect(){
        System.out.println("Disconnect");
    }
    
}


class smartDoorLock extends smartDevice implements lockable{

    smartDoorLock(int id, String nama, int daya){
        super(id, nama, daya);
    }
    
    @Override 
    public void lock(){
        System.out.println("Lock");
    }

    @Override 
    public void unlock(){
        System.out.println("Unlock");
    }
}