package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class OnboardingWindow extends JFrame implements ActionListener {
	public OnboardingWindow() {
		setTitle("rolê");
		setResizable(false);
		setSize(new Dimension(400, 400));
		
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
    	setContentPane(contentPane);
    	contentPane.setLayout(null);
    	
    	JTextArea texto = new JTextArea("para prosseguir, crie sua conta");
    	texto.setLineWrap(true);
    	texto.setWrapStyleWord(true);
    	texto.setBackground(new Color(0, 0, 0));
    	texto.setLocation(50, 188);
    	texto.setSize(new Dimension(242, 44));
    	texto.setForeground(new Color(173, 173, 173));
    	texto.setFont(new Font("Inter", Font.PLAIN, 17));
    	contentPane.add(texto);
    	
    	JPanel logo = new ImageView("src/visao/Logo.png", new Dimension(83, 33), 0.0);
    	logo.setLocation (50, 70);
    	logo.setSize(new Dimension(83, 83));
    	logo.setBackground(new Color(0, 0, 0, 0));
    	contentPane.add(logo);
   	
    	JButton nextCadastro = new JButton("prosseguir");
    	nextCadastro.setForeground(Color.BLACK);
    	nextCadastro.setFont(new Font("Inter", Font.BOLD, 17));
    	nextCadastro.setLocation(114, 273);
    	nextCadastro.setSize(new Dimension(154, 37));
    	contentPane.add(nextCadastro);
    	
    	JTextArea texto_1 = new JTextArea("boas-vindas ao seu novo aplicativo de eventos");
    	texto_1.setWrapStyleWord(true);
    	texto_1.setSize(new Dimension(242, 44));
    	texto_1.setLineWrap(true);
    	texto_1.setForeground(Color.WHITE);
    	texto_1.setFont(new Font("Inter", Font.PLAIN, 17));
    	texto_1.setBackground(Color.BLACK);
    	texto_1.setBounds(50, 132, 242, 44);
    	contentPane.add(texto_1);
    	
    	nextCadastro.addActionListener(this);
        
//        JPanel fundo = new ImageView("src/visao/Background.png", new Dimension(400, 400), 0.5);
//        fundo.setSize(400, 400);
//		contentPane.add(fundo);
	}
	
	public static void main(String[] args) {
		OnboardingWindow tela = new OnboardingWindow();
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
//		OnboardingWindow cadastro = new TelaCadastro();
//		cadastro.setVisible(true);
	}
}