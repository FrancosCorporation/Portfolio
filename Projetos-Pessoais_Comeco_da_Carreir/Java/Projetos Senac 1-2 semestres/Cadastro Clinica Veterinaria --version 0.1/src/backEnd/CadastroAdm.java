package backEnd;


public class CadastroAdm {

	
	public CadastroFuncionarios CadastroAdmin() {
		ImportarDadosFuncionarios novofuncionario = new ImportarDadosFuncionarios();
		
		CadastroFuncionarios adm = new CadastroFuncionarios("Adm",1991,"159753",1);
		return adm;
	}
	


}
