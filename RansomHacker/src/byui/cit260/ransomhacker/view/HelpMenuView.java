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
                ErrorView.display(this.getClass().getName(),"\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void openObjectOfTheGame() {
        System.out.println("\n*** openObjectOfTheGame Function Called ***"); 
    }

    private void openStatDescription() {
        System.out.println("\n*** openStatDescription Function Called ***");
        CharacterStatsView gameMenu = new CharacterStatsView();
        gameMenu.display();
    }

    private void openRelocating() {
        System.out.println("\n*** openRelocating Function Called ***");
        LoadGameView gameMenu = new LoadGameView();
        gameMenu.display();
        
    }

    private void openJobs() {
        System.out.println("\n*** openJobs Function Called ***");
        JobListView gameMenu = new JobListView();
        gameMenu.display();
    }

    private void openDevelopingSkills() {
        DevelopSkillsMenuView skillsMenu = new DevelopSkillsMenuView();
        skillsMenu.display();
        
    }

    private void openAttacking() {
        System.out.println("\n*** openAttacking Function Called ***");
    }
}