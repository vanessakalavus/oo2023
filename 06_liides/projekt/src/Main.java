public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IsikukoodEE ee1 = new IsikukoodEE("Vanessa", "60001029996");
        System.out.println(ee1.getSugu());
        System.out.println(ee1.getKuupaev());
        System.out.println(ee1.getVanus());

        IsikukoodEE ee2 = new IsikukoodEE("Vanessa", "60303039914");
        System.out.println(ee2.getSugu());
        System.out.println(ee2.getKuupaev());
        System.out.println(ee2.getVanus());

        IsikukoodEE ee3 = new IsikukoodEE("Vanessa", "30303039816");
        System.out.println(ee3.getSugu());
        System.out.println(ee3.getKuupaev());
        System.out.println(ee3.getVanus());

        IsikukoodEE ee4 = new IsikukoodEE("Vanessa", "50701019992");
        System.out.println(ee4.getSugu());
        System.out.println(ee4.getKuupaev());
        System.out.println(ee4.getVanus());

        IsikukoodEE ee5 = new IsikukoodEE("Vanessa", "40404049996");
        System.out.println(ee5.getSugu());
        System.out.println(ee5.getKuupaev());
        System.out.println(ee5.getVanus());

        IsikukoodFI fi1 = new IsikukoodFI("Vanessa", "111111-111C");
        System.out.println(fi1.getSugu());
        System.out.println(fi1.getKuupaev());

        IsikukoodFI fi2 = new IsikukoodFI("Vanessa", "010101-0101");
        System.out.println(fi2.getSugu());
        System.out.println(fi2.getKuupaev());

        IsikukoodFI fi3 = new IsikukoodFI("Vanessa", "010101A900R");
        System.out.println(fi3.getSugu());
        System.out.println(fi3.getKuupaev());

        IsikukoodFI fi4 = new IsikukoodFI("Vanessa", "010101-0102");
        System.out.println(fi4.getSugu());
        System.out.println(fi4.getKuupaev());

        IsikukoodFI fi5 = new IsikukoodFI("Vanessa", "111111-111Q");
        System.out.println(fi5.getSugu());
        System.out.println(fi5.getKuupaev());
    }
}