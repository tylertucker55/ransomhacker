/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

/**
 *
 * @author Hansen
 */
public class HelpMenuView extends View {
    
    
    
    public HelpMenuView() {
                super("\n"
                    + "\n----------------------------"
                    + "\n| Help Menu                |"
                    + "\n----------------------------"
                    + "\n1 - Object of the Game"
                    + "\n2 - Stat Description"
                    + "\n3 - Relocating"
                    + "\n4 - Jobs"
                    + "\n5 - Developing Skills"
                    + "\n6 - Attacking"
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select an option");
        
    }
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.openObjectOfTheGame();
                break;
            case "2":
                this.openStatDescription();
                break;
            case "3":
                this.openRelocating();
                break;
            case "4":
                this.openJobs();
                break;
            case "5":
                this.openDevelopingSkills();
                break;
            case "6":
                this.openAttacking();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void openObjectOfTheGame() {
        System.out.println("\n*** openObjectOfTheGame Function Called ***"); 
    }

    private void openStatDescription() {
        System.out.println("\n*** openStatDescription Function Called ***");
        
    }

    private void openRelocating() {
        System.out.println("\n*** openRelocating Function Called ***");
        
    }

    private void openJobs() {
        System.out.println("\n*** openJobs Function Called ***");
        
    }

    private void openDevelopingSkills() {
        System.out.println("Placeholder");
        
    }

    private void openAttacking() {
        System.out.println("\n*** openAttacking Function Called ***");
    }
}