function validar(){

	with (document.f){//aqui 'f' é um apelido dado ao formulario

		//o documento html é o documnet
		// e dentro de documneto temos varios objetos e o 'f'
		//e prescisamos aceesar esses dados
		//e para não fazer uma sintaxe mais simples, deixando desnecessario colocar o caminho do documento em cada comando é colocado document.f assim facilita o acesso

		if(nome.value==""){

			alert("O campo nome é obrigatorio.");
			nome.focus();

		}
		else if(rg.value==""){

			alert("O campo RG é obrigatorio.");
			nome.focus();

		} 
		else if(cpf.value==""){

			alert("O campo CPF é obrigatorio.");
			nome.focus();

		} 
		else if(tel.value==""){

			alert("O campo telefone é obrigatorio.");
			nome.focus();

		}
		else {
			alert("Gravado com sucesso.");
			submit();

		}
	}
}