package aula07;

public enum OpcaoMenu {

    CADASTRO(1),
    VISUALIZACAO(2),
    APAGAR(9),
    SAIR(0),
    DESCONHECIDA(-1);

    private final int codigoMenu;

    OpcaoMenu(int codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public static OpcaoMenu getFromCodigo(int codigoMenu) {
        OpcaoMenu[] todasAsopcoes = OpcaoMenu.values();

        for(OpcaoMenu opcao : todasAsopcoes) {
            if(opcao.codigoMenu == codigoMenu) {
                return opcao;
            }
        }

        return DESCONHECIDA;
    }
}
