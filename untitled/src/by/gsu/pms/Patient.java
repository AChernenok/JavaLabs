package by.gsu.pms;

public class Patient {
    private String name;
    private String serName;
    private String midName;
    private String Adress;
    private int Phone;
    private String diagnosis;
    private int Card;
    private int id;

    public Patient(String name, String serName, String midName, String Adress, String diagnosis, int Phone, int id, int Card) {
        this.name = name;
        this.serName = serName;
        this.midName = midName;
        this.Adress = Adress;
        this.Phone = Phone;
        this.diagnosis = diagnosis;
        this.Card = Card;
        this.id = id;
    }

    public Patient() {
        this.name = "";
        this.serName = "";
        this.midName = "";
        this.Adress = "";
        this.Phone = 0;
        this.diagnosis = "";
        this.Card = 0;
        this.id = 0;
    }

    public void ShowInfo() {
        System.out.println(this.getSerName() + " " + this.getName() + this.getMidName() + ": Adress: " + this.getAdress() + "; PhoneNumber: " + this.getPhone() + "; Diagnosis: " + this.getDiagnosis() + "; id: " + this.getId() + "; №Card: " + this.getCard());
    }

    public String getSerName() {
        return serName;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getAdress() {
        return Adress;
    }

    public int getPhone() {
        return Phone;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getId() {
        return id;
    }

    public int getCard() {
        return Card;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setCard(int card) {
        Card = card;
    }

    public void setId(int id) {
        this.id = id;
    }
}
