/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

/**
 *
 * @author tylertucker
 */
public class CharacterStatsView extends View {

    public CharacterStatsView() {
        super("\n"
                    + "\n----------------------------"
                    + "\n|       Character stats    |"
                    + "\n----------------------------"
                    + "\n1 - Hacking"
                    + "\n2 - Social engineering"
                    + "\n3 - Stealth"
                    + "\n----------------------------"
                    + "\nPlease select an option");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.hackingStat();
                break;
            case "2":
                this.socialEngStat();
                break;
            case "3":
                this.stealthStat();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\nInvalid Selection");
                break;
        }
            return false;
    }
 
    private void hackingStat() {
        System.out.println("\nSelected Hacking Stat");
    }

    private void socialEngStat() {
        System.out.println("\nSelected Social Engineering Stat");
    }

    private void stealthStat() {
        System.out.println("\nSelected Stealth Stat");
    }

}