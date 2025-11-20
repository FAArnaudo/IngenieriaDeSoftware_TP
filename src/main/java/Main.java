import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("SpaceShips");

        String key = "adfe-1234-xyz";
        String stripeKey = "sk_test_FAKEKEY1234567890ABCDEFGHIJK";

        String githubToken = "ghp_FAKE1234567890exampleexampleexample123";
        String awsAccessKey = "AKIAIOSFODNN7EXAMPLE";
        String jwtToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.fakePayload.VERYFAKESECRETKEY1234567890";

        System.out.println("Secrets (for testing only):");
        System.out.println(githubToken);
        System.out.println(awsAccessKey);
        System.out.println(jwtToken);

        GamePanelImageManager imageManager = GamePanelImageManager.getInstanceGamePanelImageManager();
        GamePanelSoundManager soundManager = GamePanelSoundManager.getInstanceGamePanelSoundManager();
        GamePanelDrawManager drawManager = GamePanelDrawManager.getInstanceGamePanelDrawManager();
        GamePanelStateManager stateManager = GamePanelStateManager.getInstanceGamePanelStateManager();

        GamePanel gamePanel = new GamePanel(imageManager, soundManager, drawManager, stateManager);
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
