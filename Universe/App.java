package Universe;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Mercurio mercurio = new Mercurio("Mercurio", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);
        Venus venus = new Venus("Mercurio", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);
        Terra terra = new Terra("Terra", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);
        Marte marte = new Marte("Mercurio", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);
        Jupiter jupiter = new Jupiter("Mercurio", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);
        Saturno saturno = new Saturno("Mercurio", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);
        Urano urano = new Urano("Mercurio", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);
        Netuno netuno = new Netuno("Mercurio", 2200.00, "Lua", 300,
                "Planeta azul!", 382909);

        int menu;

        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Este é um "
                + "menu de curiosidades sobre planetas, escolha uma opção!"
                + "\n 1 - Mercurio"
                + "\n 2 - Vênus"
                + "\n 3 - Terra"
                + "\n 3 - Marte"
                + "\n 3 - Jupiter"
                + "\n 3 - Saturno"
                + "\n 3 - Urano"
                + "\n 4 - Netuno "));

        switch (menu) {

            case 1:
            mercurio.MostrarDados();
                break;
            case 2:
                venus.MostrarDados();
                break;
            case 3:
                terra.MostrarDados();
                break;
            case 4:
                marte.MostrarDados();
                break;
            case 5:
                jupiter.MostrarDados();
                break;
            case 6:
                saturno.MostrarDados();
                break;
            case 7:
                urano.MostrarDados();
                break;
            case 8:
                netuno.MostrarDados();
                break;
        }

        System.exit(0);

        /*
         * Terra terra = new Terra("terra", 2200.00, "Lua", 300);
         * 
         * JOptionPane.showMessageDialog(null, "o nome do planeta é: " + terra.nome);
         * System.exit(0);
         */
    }
}
