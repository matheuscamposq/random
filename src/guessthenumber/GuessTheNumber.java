
package guessthenumber;
import java.util.Random;
import javax.swing.JOptionPane;
public class GuessTheNumber {

    public static void main(String[] args) {
 
            Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativas = 10;
        boolean acertou = false;

        JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo Adivinhe o Número!\n" +
                "Eu escolhi um número entre 1 e 100. Você tem 10 tentativas para adivinhar.");

        for (int i = 1; i <= tentativas; i++) {
            String entrada = JOptionPane.showInputDialog(null, 
                    "Tentativa " + i + " de " + tentativas + "\nDigite seu palpite:");
            
            // Verifica se o jogador cancelou ou não digitou nada
            if (entrada == null || entrada.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Jogo encerrado. O número secreto era: " + numeroSecreto);
                return;
            }

            try {
                int palpite = Integer.parseInt(entrada);

                if (palpite == numeroSecreto) {
                    acertou = true;
                    JOptionPane.showMessageDialog(null, 
                            "Parabéns! Você acertou o número secreto (" + numeroSecreto + ") na tentativa " + i + "!");
                    break;
                } else if (palpite < numeroSecreto) {
                    JOptionPane.showMessageDialog(null, "Muito baixo! Tente novamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Muito alto! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
            }
        }

        if (!acertou) {
            JOptionPane.showMessageDialog(null, "Suas tentativas acabaram. O número secreto era: " + numeroSecreto);
        }

        JOptionPane.showMessageDialog(null, "Obrigado por jogar! Até a próxima.");
    }
}
    
    
    
    
    

