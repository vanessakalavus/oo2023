public class Arvuti {
    Info info;
    double maksumus:
    public Arvuti (Info info, int maksumus){
        this.info = info;
        this.maksumus = maksumus;
    }

    public void seadistaInfo(Info info) {

    }
    public void suurendaMkasumus(int kuiPalju){
        this.maksumus = this.maksumus  + kuiPalju;
    }

    public void paneDollaritesse(int kuiPalju){
        this.maksumus = this.maksumus  + kuiPalju;
    }
}
