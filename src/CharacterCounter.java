import javax.swing.JOptionPane;

public class CharacterCounter {
    private static String paneTitle = "Number of Characters";
    private static int paneType = JOptionPane.PLAIN_MESSAGE;

    public CharacterCounter(int characters) {
        if (characters == 1) {
            JOptionPane.showMessageDialog(null, "1 character", paneTitle, paneType);
        } else {
            JOptionPane.showMessageDialog(null, String.format("%s characters", characters), paneTitle, paneType);
        }
    }
}
