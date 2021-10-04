public class Principal {
    public static void main(String[] args) {

    Pessoa[] pessoas = new Pessoa[5];

    pessoas[0] = new Pessoa();
    pessoas[0].nome = "jao";
    pessoas[0].cpf = 79456;
    pessoas[0].addEndereco("dr antonio calos");
    pessoas[0].Pessoa("maria",123456,1);

    Pessoa p = new Pessoa();
    p.nome = "Tadeu";
    p.cpf = 123456789;
    p.addEndereco("qualquer coisa");
    p.Pessoa("kakinho",369852,1);
    pessoas[1]=p;



    for (int i=0;i < pessoas.length;i++)
    {
        if (pessoas[i]!=null) {
            pessoas[i].mostraInfo();

        }
    }


    }
}
