package UT6



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Act_2 extends JFrame {

    private JTextField campoCorreo;
    private JTextArea areaResultado;
    private ArrayList<String> correos;

    public Act_2() {
        super("Validación de Correos");
        correos = new ArrayList<>();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());


        JPanel panelSuperior = new JPanel(new FlowLayout());
        JLabel etiqueta = new JLabel("Correo:");
        campoCorreo = new JTextField(25);

        JButton btnAgregar = new JButton("Agregar");
        JButton btnValidar = new JButton("Validar");

        panelSuperior.add(etiqueta);
        panelSuperior.add(campoCorreo);
        panelSuperior.add(btnAgregar);
        panelSuperior.add(btnValidar);


        areaResultado = new JTextArea();
        areaResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultado);

        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);


        btnAgregar.addActionListener(e -> {
            String correo = campoCorreo.getText().trim();

            if (correo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Escribe un correo.", "Error",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            correos.add(correo);
            areaResultado.append("Entrada: " + correo + "\n");

            campoCorreo.setText("");
        });


        btnValidar.addActionListener(e -> {
            if (correos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay correos para validar.", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            areaResultado.append("\n══════════════════════════════\n");
            areaResultado.append("=== RESULTADO VALIDACIÓN ===\n");

            for (String correo : correos) {
                if (validarCorreo(correo)) {
                    areaResultado.append(correo + " → (mail correcto)\n");
                } else {
                    areaResultado.append(correo + " → (mail incorrecto)\n");
                }
            }

            areaResultado.append("══════════════════════════════\n");
        });


        setVisible(true);
    }

    private boolean validarCorreo(String correo) {
        return correo.endsWith("@gmail.com") || correo.endsWith("@gmail.es");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Act_2::new);
    }
}
