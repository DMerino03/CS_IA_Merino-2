package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import static java.util.GregorianCalendar.AD;

public class Controller {

    @FXML public AnchorPane MainPane, AllItemsPane, AllChaPane, ScreenshotPane, CompetitiveBuildsPane;
    @FXML public ChoiceBox tankChoiceBox;
    @FXML public ChoiceBox apChoiceBox;
    public ChoiceBox championTypeChoiceBox;
    @FXML private ListView itemsList;
    @FXML private TextField Healthtxtbox;
    @FXML private TextField Adtxtbox;
    @FXML private TextField Astxtbox;
    @FXML private TextField Crittxtbox;
    @FXML private TextField Lstxtbox;
    @FXML private TextField APentxtbox;
    @FXML private TextField Artxtbox;
    @FXML private TextField Mrtxtbox;
    @FXML private TextField HP5txtbox;
    @FXML private TextField Aptxtbox;
    @FXML private TextField MPentxtbox;
    @FXML private TextField Nametxtbox;
    @FXML private ListView championList;
    @FXML private TextField championNameBox;
    @FXML private DialogPane zedBuild;
    @FXML private DialogPane malzaharBuild;
    @FXML private DialogPane rammusBuild;
    @FXML private DialogPane farmingTutorial;
    @FXML private DialogPane ccTutorial;
    @FXML private DialogPane laningTutorial;

    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Champion> champions = new ArrayList<>();

    public void initialize(){
        //this is where all the functionality starts.

        //read the json file which holds all your item information and sent it to the ITEM object in the items list

        items.add(new Item("Infinity Edge",0,70,0,20,0,0,0,0,0,0,0,"Randuin's Omen","Zhonya's Hourglass"));
        items.add(new Item("Black Cleaver",0,40,0,0,0,30,0,0,0,0,0,"Frozen Heart","Zhonya's Hourglass"));
        items.add(new Item("Borg",0,40,25,0,10,0,0,0,0,0,0,"Frozen Heart","Morellonomicon"));
        items.add(new Item("Youumus",0,60,0,0,0,0,0,0,0,0,0,"Thornmail","Zhonya's Hourglass"));
        items.add(new Item("Bloodthirstier",0,55,0,20,20,0,0,0,0,0,0,"Thornmail","Morellonomicon"));
        items.add(new Item("Phantom Dancer",0,20,25,20,0,0,0,0,0,0,0,"Frozen Heart","Zhonya's Hourglass"));
        items.add(new Item("Frozen Heart",0,0,0,0,0,0,80,0,0,0,0,"Rabadon's Deathcap","Black Cleaver"));
        items.add(new Item("Warmog's Armor",800,0,0,0,0,0,0,0,200,0,0,"Demonic Embrace","Borg"));
        items.add(new Item("Spirit Visage",450,0,0,0,0,0,0,40,100,0,0,"Void Staff","Borg"));
        items.add(new Item("Thornmail",350,0,0,0,0,0,60,0,0,0,0,"Demonic Embrace","Youumus"));
        items.add(new Item("Randuin's Omen",250,0,0,0,0,0,80,0,0,0,0,"Demonic Embrace","Black Cleaver"));
        items.add(new Item("Force of Nature",350,0,0,0,0,0,0,60,0,0,0,"Void Staff","Borg"));
        items.add(new Item("Morellonomicon",250,0,0,0,0,0,0,0,80,0,0,"Force of Nature","Youumus"));
        items.add(new Item("Void Staff",0,0,0,0,0,0,0,0,0,70,40,"Warmog's Armor","Youumus"));
        items.add(new Item("Rabadon's Deathcap",0,0,0,0,0,0,0,0,0,120,0,"Force of Nature","Youumus"));
        items.add(new Item("Nashor Tooth",0,0,50,0,0,0,0,0,0,100,0,"Frozen Heart","Youumus"));
        items.add(new Item("Zhonya's Hourglass",0,0,0,0,0,0,45,0,0,65,0,"Spirit Visage","Youumus"));
        items.add(new Item("Demonic Embrace",50,0,0,0,0,0,0,0,0,70,0,"Force of Nature","Youumus"));
        //

        champions.add(new Champion("Zed", "Ad"));
        champions.add(new Champion("Rammus", "Tank"));
        champions.add(new Champion("Malzahar", "Ap"));

        ArrayList

    }


    public void ReturnHomeBtn(ActionEvent actionEvent) {
        MainPane.setVisible(true);
        AllItemsPane.setVisible(false);
       AllChaPane.setVisible(false);
         ScreenshotPane.setVisible(false);
        CompetitiveBuildsPane.setVisible(false);
    }

    public void CompetBuildsBtn(ActionEvent actionEvent) {
        CompetitiveBuildsPane.setVisible(true);
        MainPane.setVisible(false);
        /*
        if championNameBox= ("Zed" / "zed") {
            zedBuild.setVisible(true);
        }

        else championNameBox= ("Malzahar" / "malzahar"){
            malzaharBuild.setVisible(true);
        }

        else championNameBox= ("Rammus" / "rammus") {
            rammusBuild.setVisible(true);
        }
        */


    }

    public void farmingExp(ActionEvent actionEvent) {
        farmingTutorial.setVisible(true);
        laningTutorial.setVisible(false);
        ccTutorial.setVisible(false);
    }

    public void ccExp(ActionEvent actionEvent) {
        ccTutorial.setVisible(true);
        farmingTutorial.setVisible(false);
        laningTutorial.setVisible(false);
    }

    public void laningExp(ActionEvent actionEvent) {
        laningTutorial.setVisible(true);
        farmingTutorial.setVisible(false);
        ccTutorial.setVisible(false);
    }



    public void AllItemsBtn(ActionEvent actionEvent) {
        MainPane.setVisible(false);
        AllItemsPane.setVisible(true);

   }

    public void clickedItemList(MouseEvent mouseEvent) {
        int Iindex = itemsList.getSelectionModel().getSelectedIndex();

        Nametxtbox.setText(items.get(Iindex).getName());
        Adtxtbox.setText(Integer.toString(items.get(Iindex).getAD()));
        Healthtxtbox.setText(Integer.toString(items.get(Iindex).getHealth()));
        Astxtbox.setText(Integer.toString(items.get(Iindex).getAS()));
        Crittxtbox.setText(Integer.toString(items.get(Iindex).getCrit()));
        APentxtbox.setText(Integer.toString(items.get(Iindex).getAPen()));
        Lstxtbox.setText(Integer.toString(items.get(Iindex).getLS()));
        Artxtbox.setText(Integer.toString(items.get(Iindex).getAR()));
        Mrtxtbox.setText(Integer.toString(items.get(Iindex).getMR()));
        HP5txtbox.setText(Integer.toString(items.get(Iindex).getHP5()));
        Aptxtbox.setText(Integer.toString(items.get(Iindex).getAP()));
        MPentxtbox.setText(Integer.toString(items.get(Iindex).getMPen()));
        int tCounter = 0;
        int apCounter = 0;
        for(int i = 0; i < items.size()-1; i++) {
            if(items.get(i).getName().equals(items.get(Iindex).getTankCounter())){
                tCounter = i;
            }
        }
        for(int i = 0; i < items.size()-1; i++) {
            if(items.get(i).getName().equals(items.get(Iindex).getApCounter())){
                apCounter = i;
            }
        }
        tankChoiceBox.getSelectionModel().select(tCounter);
        apChoiceBox.getSelectionModel().select(apCounter);
    }



    public void AddStatsBtn(ActionEvent actionEvent) {

        //if item doesnt already exist. (you dont want to add an item twice)

    items.add(new Item(Nametxtbox.getText(), Integer.parseInt(Healthtxtbox.getText()), Integer.parseInt(Adtxtbox.getText()), Integer.parseInt(Astxtbox.getText()), Integer.parseInt(Crittxtbox.getText()), Integer.parseInt(Lstxtbox.getText()), Integer.parseInt(APentxtbox.getText()), Integer.parseInt(Artxtbox.getText()), Integer.parseInt(Mrtxtbox.getText()), Integer.parseInt(HP5txtbox.getText()), Integer.parseInt(Aptxtbox.getText()), Integer.parseInt(MPentxtbox.getText()),"32","32"));
        itemsList.getItems().clear();
        items.forEach((n)->itemsList.getItems().add(n.getName()));
    }

    public void AllChampionsBtn(ActionEvent actionEvent) {
        MainPane.setVisible(false);
        AllChaPane.setVisible(true);


    }

    public void updateChampionsBtn() {
       // champions.add(new Champion(championNameBox.getText(), championTypeChoiceBox.getSelectionModel().toString()));
       // championList.getItems().clear();
       // champions.forEach((n)->championList.getItems().add(n.getName()));
    }

    public void OwnBuildBtn(ActionEvent actionEvent) {
        ScreenshotPane.setVisible(true);
        MainPane.setVisible(false);


    }

    public void championNameBox(ActionEvent actionEvent) {
    }

    public void ccClck(ActionEvent actionEvent) {
    }

    public void laningClick(ActionEvent actionEvent) {
    }

    public void farmingClick(ActionEvent actionEvent) {
    }


    /**
        String InfinityEdge;
        String BlackCleaver;
        String Borg;
        String Youumus;
        String PhantomDancer;
        String Bloodthirstier;
        String UserChampionType;
        String FrozenHeart;
        String WarmogsArmor;
        String SpiritVisage;
        String Thornmail;
        String RanduinOmen;
        String ForceOfNature;
        String Morellonomicon;
        String VoidStaff;
        String RabadonDeathcap;
        String NashorTooth;
        String ZhonhyaHourglass;
        String DemonicEmbrace;
        String Tank;
        String Ap;
        String Ad;
        String ItemImg;
        String ItemImg;
    **/


        //after image recognition..
    //take screenshot (haystack)
    //image recognition to find (needles) item match
    //ItemFound = itemMatch

        // for each item in your list of items
             //item[0].checkItem(ItemFound,UserChampionType);




    /**
        if ((ItemFound == InfinityEdge) && (UserChampionType == Tank)){System.out.println("Randuin's Omen");}
        if (ItemImg == InfinityEdge && UserChampionType == Ap) {System.out.println("Zhonya's Hourglass");}

        if (ItemImg == BlackCleaver && UserChampionType == Tank) {System.out.println("Frozen Heart");}
        if (ItemImg == BlackCleaver && UserChampionType == Ap) {System.out.println("Zhonya's Hourglass");}

        if (ItemImg == Borg && UserChampionType == Tank) {System.out.println("Thornmail and Frozen Heart");}
        if (ItemImg == Borg && UserChampionType == Ap) {System.out.println("Zhonya's hourglass");}

        if (ItemImg == Youumus && UserChampionType == Tank) {System.out.println("Frozen Heart");}
        if (ItemImg == Youumus && UserChampionType == Ap) {System.out.println("Zhonya's hourglass");}

        if (ItemImg == Bloodthirstier && UserChampionType == Tank) {System.out.println("Thornmail and Randuin's Omen");}
        if (ItemImg == Bloodthirstier && UserChampionType == Ap) {System.out.println("Zhonya's hourglass");}

        if (ItemImg == PhantomDancer && UserChampionType == Tank) {System.out.println("Randuin's Omen and Frozen Heart");}
        if (ItemImg == PhantomDancer && UserChampionType == Ap) {System.out.println("Zhonya's hourglass");}

        if (ItemImg == FrozenHeart && UserChampionType == Ad) {System.out.println("Black Cleaver");}
        if (ItemImg == FrozenHeart && UserChampionType == Ap) {System.out.println("Demonic Embrace");}

        if (ItemImg == WarmogsArmor && UserChampionType == Ad) {System.out.println("Borg");}
        if (ItemImg == WarmogsArmor && UserChampionType == Ap) {System.out.println("Demonic Embrace");}

        if (ItemImg == SpiritVisage && UserChampionType == Ad) {System.out.println("Borg");}
        if (ItemImg == SpiritVisage && UserChampionType == Ap) {System.out.println("Demonic Embrace");}
        **/


}
