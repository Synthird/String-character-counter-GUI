import javax.swing.JOptionPane;

public class CharacterCounter {
    private static int paneType = JOptionPane.PLAIN_MESSAGE;

    public CharacterCounter(String enteredText) {
        int characters = enteredText.length();

        if (characters == 1) {
            JOptionPane.showMessageDialog(null, "1 character", enteredText, paneType);
        } else {
            JOptionPane.showMessageDialog(null, String.format("%s characters", characters), enteredText, paneType);
        }
    }
}
