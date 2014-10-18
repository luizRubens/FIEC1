function colorir(celula){
   celula.style.backgroundColor = "#dddddd";
}

function normal(celula){
   celula.style.backgroundColor = "buttonface";
}

function excluir(pagina){
   if (confirm('Confirma Exclusão?')){
      document.form1.action=pagina;
      document.form1.submit();
   }
}

function alterar(pagina){
      document.form1.action=pagina;
      document.form1.submit();
}
