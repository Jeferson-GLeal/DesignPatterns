package ui.app;

import ui.factory.*;

public class Main {

    public static void main(String[] args) {
        // Usando fábrica: Windows
        UIAbstractFactory windowsFactory = new WindowsConcreteFactory();
        Application appWin = new Application(windowsFactory);
        appWin.renderUI();

        // Usando fábrica: Mac
        UIAbstractFactory macFactory = new MacConcreteFactory();
        Application appMac = new Application(macFactory);
        appMac.renderUI();

        // Usando Fabrica: Linux
        UIAbstractFactory linuxFactory =new LinuxConcreteFactory();
        Application appLinux = new Application(linuxFactory);
        appLinux.renderUI();

        // Usando Fabrica: Unix
        UIAbstractFactory unixFactory =new UnixConcreteFactory();
        Application appUnix = new Application(unixFactory);
        appUnix.renderUI();
    }
}
