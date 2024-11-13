import javax.swing.JOptionPane;

public class CharacterCounter {
    public CharacterCounter(int characters) {
        String paneTitle = "Number of characters";
        int paneType = JOptionPane.PLAIN_MESSAGE;

        if (characters == 1) {
            JOptionPane.showMessageDialog(null, "1 character", paneTitle, paneType);
        } else {
            JOptionPane.showMessageDialog(null, String.format("%s characters", characters), paneTitle, paneType);
        }
    }

}
