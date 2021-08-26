package sample;

import java.io.File;

public class Item {


    private String tankCounter;
    private String apCounter;
    private  String name;
    private  File image;
    private  int health;
    private  int AD;
    private   int AS;
    private  int Crit;
    private  int LS;
    private  int APen;
    private  int AR;
    private  int MR;
    private  int HP5;
    private  int AP;
    private  int MPen;




    public Item(String name, int health, int AD, int AS, int Crit, int LS, int APen, int AR, int MR, int HP5, int AP, int MPen, String tankCounter,String apCounter) {
        this.name = name;
       // this.image = image;
        this.health = health;
        this.AD = AD;
        this.AS = AS;
        this.Crit = Crit;
        this.LS = LS;
        this.APen = APen;
        this.AR = AR;
        this.MR = MR;
        this.HP5 = HP5;
        this.AP = AP;
        this.MPen = MPen;
        this.tankCounter = tankCounter;
        this.apCounter = apCounter;
    }

    public String GetBestCounterItem(String ItemFound, String UserChampionType){
        if ((ItemFound == this.getName()) && (UserChampionType == "Tank")){
            return this.tankCounter;
        } else if ((ItemFound == this.getName()) && (UserChampionType == "Ap")) {
            return this.apCounter;
        }
        return "Non";
    }

    public String getName() {
        return name;
    }

    public File getImage() {
        return image;
    }


    public int getHealth() {
        return health;
    }

    public int getAD() {
        return AD;
    }

    public int getAS() {
        return AS;
    }

    public int getCrit() {
        return Crit;
    }

    public int getLS() {
        return LS;
    }

    public int getAPen() {
        return APen;
    }

    public int getAR() {
        return AR;
    }

    public int getMR() {
        return MR;
    }

    public int getHP5() {
        return HP5;
    }

    public int getAP() {
        return AP;
    }

    public int getMPen() {
        return MPen;
    }

    public String getTankCounter(){
        return tankCounter;
    };
    public String getApCounter(){
        return apCounter;
    };



}
