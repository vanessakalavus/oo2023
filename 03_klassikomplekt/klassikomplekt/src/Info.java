public class Info {
    String nimetus;

    String ram;

    String opSysteem;

    public Info(String nimetus, String ram, String opSysteem) {
        this.nimetus = nimetus;
        this.ram = ram;
        this.opSysteem = opSysteem;
    }

    public void muudaRaami (){

    }

    public String kysiOpSysteemi (){
        return opSysteem;
    }
}
