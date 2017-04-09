/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;


import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Location;
import java.awt.Point;
import ransomhacker.RansomHacker;

/**
 *
 * @author Hansen
 */
public class StoreView extends View {

   
    
    public StoreView() {
        this.displayMessage = this.getMenu();
        
    }


    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        Item[] items = RansomHacker.getCurrentGame().getItems();
        switch (choice) {
            case "1":
                RansomHacker.getCurrentGame().getCharacter().getInventory().add(items[GameControl.Items.computer.ordinal()]);
                break;
            case "2":
                this.addItem(items[GameControl.Items.wificard.ordinal()]);
                break;
            case "3":
                this.addItem(items[GameControl.Items.emailserver.ordinal()]);
                break;
            case "4":
                this.addItem(items[GameControl.Items.supercomputer.ordinal()]);
                break;
            case "5":
                this.addItem(items[GameControl.Items.botnet.ordinal()]);
                break;
            case "6":
                this.addItem(items[GameControl.Items.vpnservice.ordinal()]);
                break;
            case "7":
                this.addItem(items[GameControl.Items.proxynetwork.ordinal()]);
                break;
            case "8":
                this.addItem(items[GameControl.Items.beginnerhackingsoftware.ordinal()]);
                break;
            case "9":
                this.addItem(items[GameControl.Items.intermediatehackingsoftware.ordinal()]);
                break;
            case "10":
                this.addItem(items[GameControl.Items.advancedhackingsoftware.ordinal()]);
                break;
            case "11":
                this.addItem(items[GameControl.Items.experthackingsoftware.ordinal()]);
                break;
            case "12":
                this.addItem(items[GameControl.Items.zerodayattacks.ordinal()]);
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private String displayItems() {
        
        Item[] items = RansomHacker.getCurrentGame().getItems();
        String listOfItems = " ";
        for (int index=1; index < items.length; index++) {
                          String item = "\n" + (index + 1) + " - " + items[index].getName() +
                                 " Cost: $" + items[index].getCost() + "0" +
                                 "\n" + items[index].getDescription() + "\n";
                          listOfItems = listOfItems + item;
                    } 
        return listOfItems;
    }

    private String getMenu() {
        return "\n"
                    + "\n----------------------------"
                    + "\n|          Store            |"
                    + "\n----------------------------"
                    + "\n" + displayItems()
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select an equipment or service to buy";
    }

    private void addItem(Item choice) {
        Item[] items = RansomHacker.getCurrentGame().getItems();
        double money = RansomHacker.getCurrentGame().getCharacter().getMoney();
        if (money > choice.getCost()) {
            RansomHacker.getCurrentGame().getCharacter().getInventory().add(choice);
            money = money - choice.getCost();
            RansomHacker.getCurrentGame().getCharacter().setMoney(money);
            choice.setQuantity(choice.getQuantity() + 1);
            this.console.println("Successfully bought " + choice.getName());
        }
        else {
           ErrorView.display(this.getClass().getName(), "\nNot enough money"); 
        }
        
        
    }

    
}